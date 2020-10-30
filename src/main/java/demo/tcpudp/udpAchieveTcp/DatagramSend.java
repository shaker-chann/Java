package demo.tcpudp.udpAchieveTcp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @className: DataGramSend
 * @description: 数据报文发送：
 * 1.发送消息线程负责发送，发送后将消息放入容器中等待应答，
 * 2.接受线程接收应答，并发送消息给接收端自己已收到信息，从容器中匹配后删除
 * 3.重发线程负责重发，未收到应答的消息，发送3次后移出
 */
public class DatagramSend {

    /**
     * 本地要发送的地址对象
     */
    private SocketAddress localAddress;

    /**
     * 发送的socket对象
     */
    private DatagramSocket datagramSender;

    /**
     * 目标地址
     */
    private SocketAddress remoteAddress;

    /**
     * 本地缓存已发送的消息 Map key 为消息ID，value为消息对象本身
     */
    private Map<Integer, RequestMessage> msgQueue = new ConcurrentHashMap<>();

    public static void main(String[] args) throws SocketException {
        new DatagramSend();
    }

    public DatagramSend() throws SocketException {
        localAddress = new InetSocketAddress("127.0.0.1", 13000);
        datagramSender = new DatagramSocket(localAddress);
        remoteAddress = new InetSocketAddress("127.0.0.1", 14000);

        // 启动三个线程
        // 1.发送消息线程
        startSendThread();
        // 接收线程接收应答
        startRecvResponseThread();
        // 重发线程负责重发
        startReSendThread();
    }

    /**
     * 启动重发线程
     */
    @SuppressWarnings("all")
    private void startReSendThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        resendMsg();
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    /**
     * 重发业务：判断map中的消息，如果超过3s未收到应答，则重发
     */
    private void resendMsg() {
        // 返回队列中所有的key
        Set<Integer> keySet = msgQueue.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            RequestMessage requestMessage = msgQueue.get(key);

            // 如果重发超过3次，则移出
            if (requestMessage.getSendCount() >= 3) {
                iterator.remove();
                System.out.println("发送端--检测道丢失的消息：" + requestMessage);
            }

            long startTime = System.currentTimeMillis();
            // 等待时间不超过3s
            if ((startTime - requestMessage.getLastSendTime()) > 3000 && requestMessage.getSendCount() < 3) {
                byte[] buffer = requestMessage.toByte();
                try {
                    DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length, requestMessage.getRemoteAddr());
                    datagramSender.send(datagramPacket);
                    requestMessage.setSendCount(requestMessage.getSendCount() + 1);
                    System.out.println("客户端重新发送消息:" + requestMessage);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 启动接受应答线程
     */
    @SuppressWarnings("all")
    private void startRecvResponseThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    recvResponse();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    /**
     * 接受应答消息
     */
    private void recvResponse() throws IOException {
        System.out.println("接收端-接受应答线程启动");
        while (true) {
            byte[] recvData = new byte[100];
            //创建接受数据包对象
            DatagramPacket recvRespPacket = new DatagramPacket(recvData, recvData.length);
            //发送
            datagramSender.receive(recvRespPacket);
            //接受返回数据
            RequestMessage requestMessage = new RequestMessage(recvRespPacket.getData());
            int repId = requestMessage.getId();
            RequestMessage requestMessage1 = msgQueue.get(new Integer(repId));
            if (requestMessage1 != null) {
                System.out.println("发送端-原来发送的数据：" + requestMessage1);
                System.out.println("接受的数据：" + requestMessage);
                System.out.println("发送端-已收到接收端返回的信息：" + new String(requestMessage.getData()));
                msgQueue.remove(repId);
                //发送端需要告诉接收端，返回的数据已经收到
                //发送的数据
                byte[] msgData = (repId + " 数据已收到").getBytes();
                //创建要发送的消息对象
                RequestMessage sendMessage = new RequestMessage(repId, msgData);

                //要发送的数据，将要发送的数据转为字节数组
                byte[] buffer = sendMessage.toByte();
                //创建书包，指定内容，指定目标地址
                DatagramPacket datagramSocket = new DatagramPacket(buffer, buffer.length, remoteAddress);
                //发送数据
                datagramSender.send(datagramSocket);
            }
        }
    }

    /**
     * 发送消息线程
     */
    @SuppressWarnings("all")
    private void startSendThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    send();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    /**
     * 模拟发送消息
     */
    private void send() throws IOException, InterruptedException {
        System.out.println("发送端-发送数据线程启动");
        // 确认机制，id从0开始
        int id = 0;
        //模拟发送10个请求
        while (id < 1) {
            id++;
            //发送的数据
            byte[] msgData = (id + " hello").getBytes();
            //创建要发送的消息对象
            RequestMessage sendMessage = new RequestMessage(id, msgData);

            //要发送的数据，将要发送的数据转为字节数组
            byte[] buffer = sendMessage.toByte();
            //创建数据包，指定内容，指定目标地址
            DatagramPacket datagramSocket = new DatagramPacket(buffer, buffer.length, remoteAddress);
            //发送数据
            datagramSender.send(datagramSocket);
            // 缓存当前发送的请求
            sendMessage.setSendCount(1);
            sendMessage.setRemoteAddr(remoteAddress);
            msgQueue.put(id, sendMessage);
            System.out.println("客户端-数据已发送，缓存：" + sendMessage);
            Thread.sleep(1000);
        }
    }
}
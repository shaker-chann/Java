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
 * @className: DatagramRecive
 * @description: 数据报文接受方
 */
public class DatagramRecive {

    private SocketAddress localAddress;

    private DatagramSocket datagramSender;

    /**
     * 目标地址
     */
    private SocketAddress remoteAddress;

    /**
     * 本地缓存已发送的消息 Map key 为消息ID，value为消息对象本身
     */
    private Map<Integer, ResponseMessage> msgQueue = new ConcurrentHashMap<>();

    public static void main(String[] args) throws IOException {
        new DatagramRecive();
    }

    public DatagramRecive() throws SocketException {
        localAddress = new InetSocketAddress("127.0.0.1", 14000);
        datagramSender = new DatagramSocket(localAddress);
        remoteAddress = new InetSocketAddress("127.0.0.1", 13000);
        //  启动接收线程
        startDecvThread();
        // 接收线程接收应答
        startDecvResponseThread();
        // 重发线程负责重发
        startReSendThread();
    }

    /**
     * 重发
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

    private void resendMsg() {
        // 返回队列中所有的key
        Set<Integer> keySet = msgQueue.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            ResponseMessage responseMessage = msgQueue.get(key);

            // 如果重发超过3次，则移出
            if (responseMessage.getSendCount() >= 3) {
                iterator.remove();
                System.out.println("发送端--检测道丢失的消息：" + responseMessage);
            }

            long startTime = System.currentTimeMillis();
            // 等待时间不超过3s
            if ((startTime - responseMessage.getLastSendTime()) > 3000 && responseMessage.getSendCount() < 3) {
                byte[] buffer = responseMessage.toByte();
                try {
                    DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length, responseMessage.getRemoteAddr());
                    datagramSender.send(datagramPacket);
                    responseMessage.setSendCount(responseMessage.getSendCount() + 1);
                    System.out.println("客户端重新发送消息:" + responseMessage);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @SuppressWarnings("all")
    private void startDecvResponseThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    decvResponse();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void decvResponse() throws IOException {
        System.out.println("发送端-接受应答线程启动");
        while (true) {
            byte[] recvData = new byte[100];
            //创建接受数据包对象
            DatagramPacket recvRespPacket = new DatagramPacket(recvData, recvData.length);
            //接受数据
            datagramSender.receive(recvRespPacket);
            //接受返回数据
            RequestMessage requestMessage = new RequestMessage(recvRespPacket.getData());
            int repId = requestMessage.getId();
            System.out.println("接收端接受到的数据id：" + repId);
            ResponseMessage responseMessage = msgQueue.get(new Integer(repId));
            if (responseMessage != null) {
                System.out.println("接收端发送的源数据：" + responseMessage);
                System.out.println("接收端已收到发送端返回的数据：" + new String(requestMessage.getData()));
                msgQueue.remove(repId);
            }
        }
    }

    @SuppressWarnings("all")
    private void startDecvThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    recvMsg();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void recvMsg() throws IOException {
        System.out.println("启动接收线程");
        while (true) {
            // 接受发送端发送过来的数据 100表示缓存的长度
            byte[] recvData = new byte[100];
            DatagramPacket datagramPacket = new DatagramPacket(recvData, recvData.length);
            datagramSender.receive(datagramPacket);
            //获取接收端发送的数据
            RequestMessage requestMessage = new RequestMessage(datagramPacket.getData());
            String requestMessageData = new String(requestMessage.getData());
            System.out.println("接收端收到发送端的数据：" + requestMessageData);

            // 将接收到的数据发送给发送端，
            byte[] responseData = (requestMessageData + " world").getBytes();
            ResponseMessage responseMessage = new ResponseMessage(requestMessage.getId(), 0, responseData);
            System.out.println("接收端返回的数据：" + new String(responseMessage.getData()));
            byte[] data = responseMessage.toByte();
            DatagramPacket dp = new DatagramPacket(data, data.length, remoteAddress);
            datagramSender.send(dp);

            //将接收端返回的数据存入队列中，用于后面监听重发机制
            responseMessage.setLastSendTime(System.currentTimeMillis());
            responseMessage.setSendCount(1);
            responseMessage.setData(responseMessage.getData());
            //对于接收端来说，它需要返回的地址就是请求消息的本地
            responseMessage.setRemoteAddr(remoteAddress);
            msgQueue.put(requestMessage.getId(), responseMessage);

            System.out.println("接收端-已发送应答：" + responseMessage);
        }
    }
}
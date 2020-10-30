package demo.tcpudp.udpAchieveTcp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.SocketAddress;
import java.util.Arrays;

/**
 * @className: MessageEntity
 * @description: 请求发送消息实体的结构定义
 */
public class RequestMessage {

    /**
     * 定义数据的长度
     */
    private int totalLen;

    /**
     * 生成唯一的id
     */
    private int id;

    /**
     * 数据
     */
    private byte[] data;

    /**
     * 发送次数
     */
    private int sendCount = 0;

    /**
     * 最后一次发送时间
     */
    private Long lastSendTime = System.currentTimeMillis();

    /**
     * 发送者接受应答的地址
     */
    private SocketAddress recvRespAddr;

    /**
     * 接收者的地址
     */
    private SocketAddress remoteAddr;

    public RequestMessage(int id, byte[] data) {
        this.id = id;
        this.data = data;
        // 4+4是因为每个int类型占4个字节
        this.totalLen = 4 + 4 + data.length;
    }

    /**
     * 构造器将收到的udp数据解析为tcp的requestMessage对象
     *
     * @param udpData udp数据
     */
    public RequestMessage(byte[] udpData) {
        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(udpData);
            DataInputStream dis = new DataInputStream(bais);
            this.totalLen = dis.readInt();
            this.id = dis.readInt();
            this.data = new byte[totalLen - 4 - 4];
            dis.readFully(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public byte[] toByte() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(baos);
            // 写和读需要一一对应
            dos.writeInt(totalLen);
            dos.writeInt(id);
            dos.write(data);
            dos.flush();
            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getTotalLen() {
        return totalLen;
    }

    public void setTotalLen(int totalLen) {
        this.totalLen = totalLen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public int getSendCount() {
        return sendCount;
    }

    public void setSendCount(int sendCount) {
        this.sendCount = sendCount;
    }

    public Long getLastSendTime() {
        return lastSendTime;
    }

    public void setLastSendTime(Long lastSendTime) {
        this.lastSendTime = lastSendTime;
    }

    /**
     * Gets the value of recvRespAddr
     *
     * @return the value of recvRespAddr
     */
    public SocketAddress getRecvRespAddr() {
        return recvRespAddr;
    }

    /**
     * Sets the recvRespAddr
     *
     * @param recvRespAddr recvRespAddr
     */
    public void setRecvRespAddr(SocketAddress recvRespAddr) {
        this.recvRespAddr = recvRespAddr;
    }

    /**
     * Gets the value of remoteAddr
     *
     * @return the value of remoteAddr
     */
    public SocketAddress getRemoteAddr() {
        return remoteAddr;
    }

    /**
     * Sets the remoteAddr
     *
     * @param remoteAddr remoteAddr
     */
    public void setRemoteAddr(SocketAddress remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    @Override
    public String toString() {
        return "RequestMessage{" +
                "totalLen=" + totalLen +
                ", id=" + id +
                ", data=" + Arrays.toString(data) +
                ", sendCount=" + sendCount +
                ", lastSendTime=" + lastSendTime +
                '}';
    }
}

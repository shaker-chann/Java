package demo.tcpudp.udpAchieveTcp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.SocketAddress;
import java.util.Arrays;

/**
 * @className: ResponseMessage
 * @description: 响应信息实体的结构定义
 */
public class ResponseMessage {

    /**
     * 总长度
     */
    private int totalLen;

    /**
     * 对应接收到消息的id
     */
    private int repId;

    /**
     * 响应的数据
     */
    private byte[] data;

    /**
     * 接收状态 0：正确接收 其他：错误
     */
    private int state = 0;

    /**
     * 应答方的发送时间
     */
    private Long resTime;

    /**
     * 发送次数
     */
    private int sendCount;

    /**
     * 最后一次发送时间
     */
    private Long lastSendTime = System.currentTimeMillis();

    /**
     * 接收者的地址
     */
    private SocketAddress remoteAddr;

    public ResponseMessage(int repId, int state, byte[] data) {
        this.repId = repId;
        this.state = state;
        this.data = data;
        // 4+4+4是因为每个int类型占4个字节
        this.totalLen = 4 + 4 + 4 + data.length;
    }

    public ResponseMessage(byte[] udpData) {
        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(udpData);
            DataInputStream dis = new DataInputStream(bais);
            this.totalLen = dis.readInt();
            this.repId = dis.readInt();
            this.state = dis.readInt();
            this.data = new byte[totalLen - 4 - 4 - 4];
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
            dos.writeInt(repId);
            dos.writeInt(state);
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

    public int getRepId() {
        return repId;
    }

    public void setRepId(int repId) {
        this.repId = repId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Long getResTime() {
        return resTime;
    }

    public void setResTime(Long resTime) {
        this.resTime = resTime;
    }

    /**
     * Gets the value of sendCount
     *
     * @return the value of sendCount
     */
    public int getSendCount() {
        return sendCount;
    }

    /**
     * Sets the sendCount
     *
     * @param sendCount sendCount
     */
    public void setSendCount(int sendCount) {
        this.sendCount = sendCount;
    }

    /**
     * Gets the value of lastSendTime
     *
     * @return the value of lastSendTime
     */
    public Long getLastSendTime() {
        return lastSendTime;
    }

    /**
     * Sets the lastSendTime
     *
     * @param lastSendTime lastSendTime
     */
    public void setLastSendTime(Long lastSendTime) {
        this.lastSendTime = lastSendTime;
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

    /**
     * Gets the value of data
     *
     * @return the value of data
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Sets the data
     *
     * @param data data
     */
    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseMessage{" +
                "totalLen=" + totalLen +
                ", repId=" + repId +
                ", data=" + Arrays.toString(data) +
                ", state=" + state +
                ", resTime=" + resTime +
                ", sendCount=" + sendCount +
                ", lastSendTime=" + lastSendTime +
                '}';
    }
}

package builder.com.bean;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 13:31
 */
public class CMessage {

    private String msgId;

    private String msgInfo;

    private String msgLevel;

    public CMessage(){}

    public CMessage(String msgId, String msgInfo, String msgLevel) {
        this.msgId = msgId;
        this.msgInfo = msgInfo;
        this.msgLevel = msgLevel;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getMsgInfo() {
        return msgInfo;
    }

    public void setMsgInfo(String msgInfo) {
        this.msgInfo = msgInfo;
    }

    public String getMsgLevel() {
        return msgLevel;
    }

    public void setMsgLevel(String msgLevel) {
        this.msgLevel = msgLevel;
    }

    @Override
    public String toString() {
        return "CMessage{" +
                "msgId='" + msgId + '\'' +
                ", msgInfo='" + msgInfo + '\'' +
                ", msgLevel='" + msgLevel + '\'' +
                '}';
    }
}

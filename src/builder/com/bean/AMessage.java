package builder.com.bean;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 12:47
 */
public class AMessage {

    private String msgId;

    private String msgInfo;

    public AMessage(){}

    public AMessage(String msgId, String msgInfo) {
        this.msgId = msgId;
        this.msgInfo = msgInfo;
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
}

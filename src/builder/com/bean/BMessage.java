package builder.com.bean;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 12:48
 */
public class BMessage {

    private String msgId;

    private String msgInfo;

    private String msgLevel;

    private String author;

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BMessage{" +
                "msgId='" + msgId + '\'' +
                ", msgInfo='" + msgInfo + '\'' +
                ", msgLevel='" + msgLevel + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

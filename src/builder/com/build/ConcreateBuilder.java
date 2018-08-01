package builder.com.build;

import builder.com.bean.CMessage;
import builder.com.bean.AMessage;
import builder.com.bean.BMessage;

/**
 * Created with IntelliJ IDEA.
 * Description:具体实现者
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 12:52
 */
public class ConcreateBuilder implements Build {

    private BMessage bMessage=new BMessage();

    private CMessage cMessage=new CMessage();

    @Override
    public void BuildBMessage(AMessage aMessage) {
        bMessage.setMsgId(aMessage.getMsgId());
        bMessage.setMsgInfo(aMessage.getMsgInfo());
        bMessage.setMsgLevel("level");
        bMessage.setAuthor("mine");
    }

    @Override
    public BMessage getBMessage() {
        return bMessage;
    }

    @Override
    public void BuildCMessage(AMessage aMessage) {

        cMessage.setMsgId(aMessage.getMsgId());
        cMessage.setMsgInfo(aMessage.getMsgInfo());
        cMessage.setMsgLevel("这个没有");

    }

    @Override
    public CMessage getCMessage() {
        return cMessage;
    }
}

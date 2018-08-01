package builder.com.build;

import builder.com.bean.CMessage;
import builder.com.bean.AMessage;
import builder.com.bean.BMessage;

/**
 * Created with IntelliJ IDEA.
 * Description:导演者类，直接用A系统中的bean构造出B所需要的业务属性
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 12:54
 */
public class Director {

    private Build bMessage=new ConcreateBuilder();

    private Build cMessage=new ConcreateBuilder();

    public BMessage getBMessage(AMessage aMessage){
        bMessage.BuildBMessage(aMessage);//构建
        return bMessage.getBMessage();//获取
    }

    public CMessage getCMessage(AMessage aMessage){
        cMessage.BuildCMessage(aMessage);
        return cMessage.getCMessage();
    }
}

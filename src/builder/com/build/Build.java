package builder.com.build;

import builder.com.bean.CMessage;
import builder.com.bean.AMessage;
import builder.com.bean.BMessage;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 12:50
 */
public interface Build {

    public void BuildBMessage(AMessage aMessage);

    public BMessage getBMessage();

    public void BuildCMessage(AMessage aMessage);

    public CMessage getCMessage();
}

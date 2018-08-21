package command.example2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 15:14
 */
public abstract class Command {

    private XiaoFeiZhe xiaoFeiZhe;

    public Command(XiaoFeiZhe xiaoFeiZhe) {
        this.xiaoFeiZhe = xiaoFeiZhe;
    }

    public XiaoFeiZhe getXiaoFeiZhe() {
        return xiaoFeiZhe;
    }

    public void setXiaoFeiZhe(XiaoFeiZhe xiaoFeiZhe) {
        this.xiaoFeiZhe = xiaoFeiZhe;
    }

    public abstract void execute();

}

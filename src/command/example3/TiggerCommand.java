package command.example3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 15:18
 */
public class TiggerCommand extends Command {

    public TiggerCommand(XiaoFeiZhe xiaoFeiZhe) {
        super(xiaoFeiZhe);
    }

    @Override
    public void execute() {
        this.getXiaoFeiZhe().taoXin();
    }
}

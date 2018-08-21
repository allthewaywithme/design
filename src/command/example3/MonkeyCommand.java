package command.example3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 15:16
 */
public class MonkeyCommand extends Command {
    public MonkeyCommand(XiaoFeiZhe xiaoFeiZhe) {
        super(xiaoFeiZhe);
    }

    @Override
    public void execute() {
        this.getXiaoFeiZhe().touTao();
    }
}

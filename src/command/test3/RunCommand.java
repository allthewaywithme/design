package command.test3;

/**
 * Created with IntelliJ IDEA.
 * Description:具体命令实现类
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 10:36
 */
public class RunCommand extends Command {


    public RunCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.getReceiver().run();//请求对象调用接收者的操作方法
    }
}

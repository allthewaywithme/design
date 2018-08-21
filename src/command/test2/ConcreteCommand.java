package command.test2;

/**
 * Created with IntelliJ IDEA.
 * Description:具体命令实现类
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 10:36
 */
public class ConcreteCommand extends Command {


    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.getReceiver().action();//请求对象调用接收者的操作方法
    }
}

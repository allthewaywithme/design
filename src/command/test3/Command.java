package command.test3;

/**
 * Created with IntelliJ IDEA.
 * Description:抽象命令类
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 10:34
 */
public abstract class Command {

    private Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}

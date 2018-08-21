package command.example;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 11:50
 */
public class MinimizeCommand extends Command {
    private WindowHanlder whObj; //维持对请求接收者的引用

    public MinimizeCommand() {
        whObj = new WindowHanlder();
    }

    //命令执行方法，将调用请求接收者的业务方法
    public void execute() {
        whObj.minimize();
    }
}

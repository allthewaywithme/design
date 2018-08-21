package command.test;

/**
 * Created with IntelliJ IDEA.
 * Description:发送者
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 10:40
 */
public class Invoker {

    private Command command;

    /**
     * set设值注入
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 构造注入
     * @param command
     */
    public Invoker(Command command){
        this.command=command;
    }

    /**
     * //业务方法，用于调用命令类的execute()方法
     */
    public void call(){
        command.execute();//调用请求对象的方法
    }



}

package command.example2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 15:20
 */
public class GonFu {

    private Command command;

    GonFu(Command command){
        this.command=command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void liangong(){
        command.execute();
    }

}

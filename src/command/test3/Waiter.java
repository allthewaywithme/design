package command.test3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:封装命令对象
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 11:23
 */
public class Waiter {

    private List<Command> commands=new ArrayList<>();


    public void setOrder(Command command) {
        commands.add(command);
    }

    public void removeOrder(Command command) {
        commands.remove(command);
    }

    public void sail(){
        for (Command command : commands){
            command.execute();
        }
    }
}

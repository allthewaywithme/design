package command.example3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 15:24
 */
public class CommandQueue {

    private List<Command> list=new ArrayList<>();

    public void add(Command command){
        list.add(command);
    }

    public void remove(Command command){
        list.remove(command);
    }

    public void execute(){
        for (Command command : list){
            command.execute();
        }
    }



}

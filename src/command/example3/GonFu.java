package command.example3;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 15:20
 */
public class GonFu {

    private CommandQueue commandQueue;

    GonFu(CommandQueue commandQueue){
        this.commandQueue=commandQueue;
    }

    public void setOrder(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void liangong(){
        commandQueue.execute();
    }

}

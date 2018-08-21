package command.example3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 15:10
 */
public class Client {

     public static void main(String[] args) {

         XiaoFeiZhe xiaoFeiZhe=new XiaoFeiZhe();//接收者对象

         Command command=new MonkeyCommand(xiaoFeiZhe);//猴子命令具体实现类对象
         Command command1=new TiggerCommand(xiaoFeiZhe);//老虎命令具体实现类对象

         CommandQueue commandQueue=new CommandQueue();//多个命令队列对象

         commandQueue.add(command);//向命令队列对象中添加命令
         commandQueue.add(command1);//向命令队列对象中添加命令

         commandQueue.remove(command);//向命令队列对象中移除命令


         GonFu gonFu=new GonFu(commandQueue);//命令发起者对象
         gonFu.liangong();//命令发起者对象发起动作



      }



}

package command.test3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 10:42
 */
public class MainClass {



     public static void main(String[] args) {

         Receiver receiver=new Receiver();

         Command command=new ConcreteCommand(receiver);
         Command command1=new RunCommand(receiver);

         Invoker invoker=new Invoker(command);
         Invoker invoker1=new Invoker(command1);
//         invoker.call();
//         invoker1.call();

         Waiter waiter=new Waiter();
         //先下订单
         waiter.setOrder(command);
         waiter.setOrder(command1);

         //移除订单
         waiter.removeOrder(command);


         waiter.sail();






      }
}

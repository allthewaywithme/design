package observer.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 14:49
 */
public class Client {

         public static void main(String[] args) {


             WechatServer ws=new WechatServer();


             Observe u1=new User("张三");
             Observe u2=new User("李四");
             Observe u3=new User("王五");

             ws.registerObserver(u1);
             ws.registerObserver(u2);
             ws.registerObserver(u3);

             //setInformation方法里含有调用notifyObjserver方法
             ws.setInformation("生命苦短，容不得片刻恐惧！");

             System.out.println("---------------------------");
             System.out.println("");

             ws.removeObserver(u1);
             ws.setInformation("sssss");







          }

}

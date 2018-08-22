package observer.example1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 15:21
 */
public class Client1 {

     public static void main(String[] args) {
         WechatServer ws=new WechatServer();

         Observe tom = new User("Tom");
         Observe bob = new User("Bob");
         Observe lili = new User("Lili");

         ws.registerObserver(tom);
         ws.registerObserver(bob);
         ws.registerObserver(lili);

         ws.setInformation("今天来打比赛");

         ws.removeObserver(lili);
         ws.setInformation("今晚来开黑");


     }
}

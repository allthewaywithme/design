package factory.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 17:02
 */
public class MainClass {

     public static void main(String[] args) {

         FruitFactory winShiFactory = new WinShiFactory();
         Fruit apple = winShiFactory.getApple();
         Fruit banana = winShiFactory.getBanana();
         apple.get();
         banana.get();

     }


}

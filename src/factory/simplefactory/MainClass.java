package factory.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 16:36
 */
public class MainClass {

     public static void main(String[] args) {

         Fruit apple = FruitFactory.getApple();
         apple.get();


     }


}

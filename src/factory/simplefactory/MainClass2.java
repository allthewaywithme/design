package factory.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 16:42
 */
public class MainClass2 {

     public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

         Fruit aa = FruitFactory2.getApple("factory.simplefactory.Apple");
         aa.get();



     }
}

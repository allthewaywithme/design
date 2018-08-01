package factory.factory1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 16:20
 */
public class Test {

     public static void main(String[] args) {

         FruitFactory fruitFactory = new AppleFactory();
         Fruit fruit = fruitFactory.getFruit();
         fruit.get();

     }

}

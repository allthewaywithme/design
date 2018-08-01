package factory.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 16:35
 */
public class FruitFactory {

    public static Fruit getApple(){
        return new Apple();
    }

}

package factory.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * Description:通过Java的反射方式，用类名获取该类的对象实例，比较灵活
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 16:38
 */
public class FruitFactory2 {


    public static Fruit getApple(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class<?> fruit = Class.forName(name);
        return (Fruit)fruit.newInstance();
    }

}

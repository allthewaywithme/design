package factory.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 16:57
 */
public class WinShiFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new WinShiApple();
    }

    @Override
    public Fruit getBanana() {
        return new WinShiBanana();
    }
}

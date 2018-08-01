package bridge;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/1 16:16
 */
public class Bus extends Car {
    public Bus(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.print("Bus:");
        this.getEngine().installEngine();
    }
}

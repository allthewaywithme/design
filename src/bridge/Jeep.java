package bridge;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/1 16:17
 */
public class Jeep extends Car {
    public Jeep(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.print("Jeep:");
        this.getEngine().installEngine();

    }
}

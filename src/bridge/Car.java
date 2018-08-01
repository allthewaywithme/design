package bridge;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/1 16:09
 */
public abstract class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine=engine;
    }

    public abstract void installEngine();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

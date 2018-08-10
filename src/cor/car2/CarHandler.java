package cor.car2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/10 10:13
 */
public abstract class CarHandler {

    protected CarHandler carHandler;

    public CarHandler setNextCarHandler(CarHandler carHandler){
        this.carHandler=carHandler;
        return this.carHandler;
    }

    public abstract  void handleCar();
}

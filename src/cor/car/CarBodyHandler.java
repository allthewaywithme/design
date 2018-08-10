package cor.car;

import bridge.Car;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/10 10:16
 */
public class CarBodyHandler extends CarHandler {
    @Override
    public void handleCar() {
        System.out.println("组装车身");
    }
}

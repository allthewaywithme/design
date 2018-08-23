package module.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 15:06
 */
public class WCar extends CarModel {
    @Override
    protected void start() {
        System.out.println("大众车启动了.........");
    }

    @Override
    protected void stop() {
        System.out.println("大众车停止了.........");
    }
}

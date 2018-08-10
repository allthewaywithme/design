package cor.car2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/10 10:17
 */
public class CarTailHandler extends CarHandler {
    @Override
    public void handleCar() {
        System.out.println("组装车尾");
        if (this.carHandler!=null){
            this.carHandler.handleCar();
        }
    }
}

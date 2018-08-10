package cor.car2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/10 10:15
 */
public class CarHeadHandler extends CarHandler {
    @Override
    public void handleCar() {
        System.out.println("组装车头");
        if (this.carHandler!=null){
            this.carHandler.handleCar();
        }
    }
}

package strategy.example1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 14:15
 */
public class CarImpl implements Car {

    protected String carName;
    protected String carColor;

    CarImpl(String carName,String carColor){
        this.carName=carName;
        this.carColor=carColor;
    }



    @Override
    public void run() {
        System.out.println(carColor+"的"+carName);
    }
}

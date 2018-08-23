package strategy.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 11:27
 */
public class CarImpl implements Car {

    protected String carName;

    protected String carColor;

    public CarImpl(String carName,String carColor){
        this.carName=carName;
        this.carColor=carColor;
    }



    @Override
    public void run() {
        System.out.println(carColor +" " + carName  +"在行驶。。。");
    }
}

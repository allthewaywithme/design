package strategy.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 11:29
 */
public class SmallCar extends CarImpl {

    public SmallCar(String carName, String carColor) {
        super(carName, carColor);
    }

    public void run(){
        System.out.println(carColor +" " + carName  +"在行驶。。。");
    }

}

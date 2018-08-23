package strategy.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 11:31
 */
public class BusCar extends CarImpl {
    public BusCar(String carName, String carColor) {
        super(carName, carColor);
    }

    public void run(){
        System.out.println(carColor +" " + carName  +"在行驶。。。");
    }
}

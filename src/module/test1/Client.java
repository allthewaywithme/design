package module.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 15:07
 */
public class Client {

     public static void main(String[] args) {

         //家里的第一辆车，作为用户的我们并不需要关注车怎么启动的.子类变量变为父类。多态
         CarModel wCar = new WCar();//家里没多少钱，买个大众车开开
         wCar.excute();


         CarModel oCar = new OCar();//家里很有钱了，买个奥迪开开
         oCar.excute();


     }
}

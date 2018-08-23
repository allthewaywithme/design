package strategy.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 11:34
 */
public class Client {

     public static void main(String[] args) {


         CarImpl smallCar = new SmallCar("奔驰","黑色");
         CarImpl busCar = new BusCar("五菱", "红色");
         new Person("老王","45").driver(smallCar);
         new Person("小李","18").driver(busCar);
         new Person("老王","45").driver(busCar);

/*         老王  45 岁  开着黑色 奔驰在行驶。。。
         小李  18 岁  开着红色 五菱在行驶。。。
         老王  45 岁  开着红色 五菱在行驶。。。*/


     }
}

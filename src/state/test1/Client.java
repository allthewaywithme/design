package state.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 16:23
 */
public class Client {

     public static void main(String[] args) {

         CarState o=new Ordinary();
         CarState second=new Second();
         CarState third=new Third();

         Car car=new Car();
         car.setCarState(o);
         car.change();
         car.setCarState(second);
         car.change();
         car.setCarState(third);
         car.change();

      }



}

package strategy.example1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 14:21
 */
public class Client1 {

     public static void main(String[] args) {

         CarImpl busCar = new BusCar("悍马", "白色");
         CarImpl mpvCar = new MpvCar("奇瑞", "黄色");

         Person person=new Person("老王");
         person.driver(busCar);
         person.driver(mpvCar);



     }
}

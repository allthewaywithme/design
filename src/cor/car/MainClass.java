package cor.car;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/10 10:13
 */
public class MainClass {

     public static void main(String[] args) {

         CarHandler head=new CarHeadHandler();
         CarHandler body=new CarBodyHandler();
         CarHandler tail=new CarTailHandler();

         head.handleCar();
         body.handleCar();
         tail.handleCar();






      }
}

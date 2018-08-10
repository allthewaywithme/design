package cor.car2;

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

         //组装顺序预先设定好，车头-->车身-->车尾
         head.setNextCarHandler(body);
         body.setNextCarHandler(tail);

         //调用责任链的第一个（链头）完成操作
         head.handleCar();

         System.out.println("-----------------");

//         //希望改变顺序，车身-->车头-->车尾
//         body.setNextCarHandler(head);
//         head.setNextCarHandler(tail);

         body.setNextCarHandler(head).setNextCarHandler(tail);

         //调用链头
         body.handleCar();

         System.out.println("-----------------");

//         //希望改变顺序，车尾-->车头-->车身
         //车尾-->车头-->车身
//         body.setNextCarHandler(tail).setNextCarHandler(head);
//         tail.setNextCarHandler(head).setNextCarHandler(body);
         //调用链头
//         body.handleCar();






      }
}

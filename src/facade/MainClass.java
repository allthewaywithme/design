package facade;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/31 15:54
 */
public class MainClass {

     public static void main(String[] args) {

         Facade facade=new Facade();
         facade.start();
         System.out.println("------------------------------------");
         System.out.println("--------------分割线-----------------");
         System.out.println("------------------------------------");
         facade.shutDown();


      }



}

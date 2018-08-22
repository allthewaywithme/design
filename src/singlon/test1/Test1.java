package singlon.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 15:46
 */
public class Test1 {

     public static void main(String[] args) {

         EH1 eh1 = EH1.getEh1();
         eh1.setName("tom");

         EH1 eh2 = EH1.getEh1();
         eh2.setName("bob");

         System.out.println(eh1.getName());
         System.out.println(eh2.getName());



     }
}

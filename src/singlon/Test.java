package singlon;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 15:56
 */
public class Test {

     public static void main(String[] args) {
         /*LH lh=LH.getLh();
         lh.setName("dd");
         System.out.println(lh);*/

         EH eh=EH.getEh();
         eh.setName("ddd");
         EH eh1=EH.getEh();
         eh1.setName("dddd");
         System.out.println(eh.getName());
         System.out.println(eh1.getName());

      }
}

package builder;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 9:54
 */
public class MainClass {

     public static void main(String[] args) {

         //由工程队来修
//         HourseBuilder hourseBuilder= new  PingFangBuilder();
         HourseBuilder hourseBuilder= new  GongyuBuilder();
        //由设计师来做
         HourseDirector hourseDirector=new HourseDirector(hourseBuilder);
         hourseDirector.makeHourse();

         Hourse hourse= hourseBuilder.getHourse();
         System.out.println(hourse.getFloor());
         System.out.println(hourse.getWall());
         System.out.println(hourse.getHourseTop());

      }
}

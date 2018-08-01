package adapter.objectadapter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/31 14:20
 */
public class MainClass {

     public static void main(String[] args) {

         Ps2 ps2 = new Adapter(new Usber());
         ps2.isPs2();


     }





}

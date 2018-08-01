package adapter.classadapter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/31 11:36
 */
public class MainClass {

     public static void main(String[] args) {

         Ps2 ps2 = new Adapter();
         ps2.isPs2();

         Usb usb=new Adapter();
         usb.isUsb();

         Usber usber=new Adapter();
         ((Adapter) usber).isPs2();


     }



}

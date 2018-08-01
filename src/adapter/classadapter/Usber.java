package adapter.classadapter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/31 11:35
 */
public class Usber implements Usb {
    @Override
    public void isUsb() {
        System.out.println("USB");
    }
}

package adapter.objectadapter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/31 14:18
 */
public class Adapter implements Ps2 {

    private Usb usb;

    public Adapter(Usb usb){
        this.usb=usb;
    }

    @Override
    public void isPs2() {
        System.out.println("PS2");
    }
}

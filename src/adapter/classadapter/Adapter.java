package adapter.classadapter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/31 11:35
 */
public class Adapter extends Usber implements Ps2 {
    @Override
    public void isPs2() {
        System.out.println("PS2");
    }
}

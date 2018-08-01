package decorate;

/**
 * Created with IntelliJ IDEA.
 * Description:做正常普通的馒头
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/31 16:55
 */
public class NormalBread implements IBread {
    @Override
    public void pripair() {
        System.out.println("准备面粉，水和发酵粉..........");
    }

    @Override
    public void kneadFlour() {
        System.out.println("和面...........");
    }

    @Override
    public void steamed() {
        System.out.println("蒸馒头........馒头熟了！");
    }

    @Override
    public void process() {
        pripair();
        kneadFlour();
        steamed();
    }
}

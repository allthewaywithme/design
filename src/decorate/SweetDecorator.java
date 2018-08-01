package decorate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/31 17:08
 */
public class SweetDecorator extends AbstractBread {
    public SweetDecorator(IBread iBread) {
        super(iBread);
    }

    public void paint(){
        System.out.println("添加甜蜜素.....");
    }

    @Override
    public void kneadFlour() {
        paint();//添加甜蜜素，此处为自己添加的方法
        super.kneadFlour();//和面
    }
}

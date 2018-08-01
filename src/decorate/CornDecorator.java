package decorate;

/**
 * Created with IntelliJ IDEA.
 * Description:制作带有颜色的馒头
 * CornDecorator继承了AbstractBread类，可以有选择的覆盖（重写）AbstractBread的制作普通馒头的方法，
 * 并添加原有方法的原来的信息，最主要的是可以添加自己需要的方法
 * 装饰者模式中这里最关键,
 *      对应上述的第1个注意点:装饰者类要实现真实类同样的接口
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/31 17:03
 */
public class CornDecorator extends AbstractBread {
    public CornDecorator(IBread iBread) {
        super(iBread);
    }

    public void paint(){
        System.out.println("添加染色剂.....");
    }

    public void kneadFlour(){
        paint();//添加染色剂
        super.kneadFlour();//和面
    }
}

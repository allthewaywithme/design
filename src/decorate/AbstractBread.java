package decorate;

/**
 * Created with IntelliJ IDEA.
 * Description:抽象类实现了IBread这个制作面包的接口，同时也包含了IBread的实例
 * 对应上述的第2个注意点:装饰者类内有一个真实对象的引用
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/31 16:58
 */
public abstract  class AbstractBread implements IBread {

    private IBread iBread;

    public AbstractBread(IBread iBread){
        super();
        this.iBread=iBread;
    }


    @Override
    public void pripair() {
        this.iBread.pripair();
    }

    @Override
    public void kneadFlour() {
        this.iBread.kneadFlour();
    }

    @Override
    public void steamed() {
        this.iBread.steamed();
    }

    @Override
    public void process() {
        pripair();
        kneadFlour();
        steamed();
    }
}

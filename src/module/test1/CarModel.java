package module.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 15:04
 */
public abstract class CarModel {

    protected abstract void start();

    protected abstract void stop();

    final public void excute(){
        this.start();
        this.stop();
    }
}

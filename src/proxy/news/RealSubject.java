package proxy.news;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/1 14:40
 */
public class RealSubject implements Subject {
    @Override
    public void sailBook() {
        System.out.println("卖书");
    }
}

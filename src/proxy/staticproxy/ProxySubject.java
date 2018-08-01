package proxy.staticproxy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/1 14:43
 */
public class ProxySubject implements Subject {

    private RealSubject realSubject;

    public void dazhe(){
        System.out.println("打折");
    }

    public void give(){
        System.out.println("赠送代金券");
    }


    @Override
    public void sailBook() {
        dazhe();
        if (realSubject==null){
            realSubject=new RealSubject();
        }
        this.realSubject.sailBook();
        give();

    }
}

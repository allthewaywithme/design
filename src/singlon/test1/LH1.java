package singlon.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:懒汉模式只适合单线程，不适合多线程
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 15:49
 */
public class LH1 {

    private String name;

    private static LH1 lh1;

    private LH1(){

    }

    public static  LH1 getLH1(){
        if (lh1==null){
            synchronized (LH1.class){
                if (lh1==null){
                    lh1=new LH1();
                }
            }

        }
        return lh1;
    }


}

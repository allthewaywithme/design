package singlon;

/**
 * Created with IntelliJ IDEA.
 * Description:单例模式懒汉模式 用的时候创建 使用双重验证
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 15:49
 */
public class LH {

    private String name;

    //（懒汉式创建对象，需要时创建）只适合单线程，多线程情况下不适合
    private static LH lh;

    public static LH getLh(){

        if (lh==null){
            synchronized (LH.class){
                if (lh==null){
                    lh=new LH();
                }
            }
        }
        return lh;
    }



    public LH(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LH{" +
                "name='" + name + '\'' +
                '}';
    }
}

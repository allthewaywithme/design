package singlon;

/**
 * Created with IntelliJ IDEA.
 * Description:单例模式里的饿汉模式  类加载时初始化一次
 * 整个类中保证只有这一个对象（推荐）
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 15:45
 */
public class EH {

    private String name;

    private static final EH eh =new EH();

    public static EH getEh(){
        return eh;
    }

    public EH(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

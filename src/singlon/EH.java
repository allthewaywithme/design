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

    //此处定义类变量实例并直接实例化，在类加载的时候就完成了实例化并保存在类中
    private static final EH eh =new EH();

    public static EH getEh(){
        return eh;
    }

    //定义私有构造函数，用于单例实例
    private EH(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

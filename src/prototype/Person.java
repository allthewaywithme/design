package prototype;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:浅度克隆
 * 这就是浅度克隆，当被克隆的类中有引用对象（String或Integer等包装类型除外）时，
 * 克隆出来的类中的引用变量存储的还是之前的内存地址，也就是说克隆与被克隆的对象是同一个。
 * 这样的话两个对象共享了一个私有变量，所有人都可以改，是一个种非常不安全的方式，
 * 在实际项目中使用还是比较少的。
 *
 * 浅度克隆就是
 * 克隆的对象修改包装类型等时是修改的引用，一定程度上会改变原型对象的内容，不安全
 *
 *
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/31 9:47
 */
public class Person implements Cloneable{

    private String name;

    private List<String> list;



    @Override
    protected Person clone(){

        try {
            return (Person)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Person(String name, List<String> list) {
        this.name = name;
        this.list = list;
    }

    public Person(){}
}

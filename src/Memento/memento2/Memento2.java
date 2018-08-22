package Memento.memento2;

/**
 * Created with IntelliJ IDEA.
 * Description:备份对象
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 17:14
 */
public class Memento2 {

    private String name;

    private int age;

    private String sex;

    public Memento2() {
    }

    public Memento2(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

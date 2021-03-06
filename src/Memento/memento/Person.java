package Memento.memento;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 17:13
 */
public class Person {

    private String name;

    private int age;

    private String sex;

    public Person() {
    }

    public Person(String name, int age, String sex) {
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

    //创建一个备份
    public Memento createMemento(){
        return  new Memento(name,age,sex);
    }

    //恢复，备份
    public  void setMemento(Memento memento){
        this.name=memento.getName();
        this.age=memento.getAge();
        this.sex=memento.getSex();

    }

    public void display(){
        System.out.println("name:"+name+",age:"+age+",sex:"+sex);
    }
}

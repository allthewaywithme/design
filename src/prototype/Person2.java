package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:深度克隆
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/31 10:15
 */
public class Person2 implements Cloneable{

    private String name;

    private String sex;

    private List<String> list;



    @Override
    protected Person2 clone(){
        try {
            Person2 person2=(Person2)super.clone();
            List<String> newList =new ArrayList<>();
            for(String str:this.list){
                newList.add(str);
            }
            person2.setList(newList);
            return person2;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Person2() {
    }

    public Person2(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Person2(String name, String sex, List<String> list) {
        this.name = name;
        this.sex = sex;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", list=" + list +
                '}';
    }
}

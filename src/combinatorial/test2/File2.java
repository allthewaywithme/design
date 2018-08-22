package combinatorial.test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 10:30
 */
public class File2 {


    private String name;//文件名

    public File2(String name) {
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println(name);
    }
}

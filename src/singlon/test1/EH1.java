package singlon.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 15:44
 */
public class EH1 {

    private String name;

    private static EH1 eh1=new EH1();

    private EH1(){

    }

    public static EH1 getEh1(){
        return eh1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

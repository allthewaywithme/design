package strategy.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 11:32
 */
public class Person {

    private String pName;
    private String pAge;
    private CarImpl car;

    public Person(String pName, String pAge) {
        this.pName = pName;
        this.pAge = pAge;
    }

    public void driver(CarImpl car){
        System.out.print(pName +"  "+ pAge+" 岁 "+" 开着");
        car.run();
    }
}

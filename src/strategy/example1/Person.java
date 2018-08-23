package strategy.example1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 14:19
 */
public class Person {

    private String name;

    private CarImpl car;

    public Person(String name){
        this.name=name;
    }

    public void driver(CarImpl car){
        System.out.println(name+"开着");
        car.run();
    }
}

package state.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 16:16
 */
public class Car {

    public static final CarState ordinary=new Ordinary();
    public static final CarState second=new Second();
    public static final CarState third=new Third();
    private CarState carState=ordinary;

    public void setCarState(CarState carState) {
        this.carState = carState;
    }

    public void change(){
        carState.change();
    }



}

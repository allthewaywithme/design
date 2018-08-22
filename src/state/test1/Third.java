package state.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 16:15
 */
public class Third implements CarState{

    @Override
    public void change() {
        System.out.println("汽车状态为三档");
    }
}

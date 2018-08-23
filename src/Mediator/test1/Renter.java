package Mediator.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:房屋求租者
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 16:43
 */

/**
 * 租客
 */
public class Renter extends Person{
    public Renter(Mediator mediator, String pName) {
        super(mediator, pName);
    }

    @Override
    public void seMessage(String msg) {
        mediator.operation(this,msg);
    }

    @Override
    public void getMessage(String msg) {
        System.out.println("求租者"+pName+"收到房东的"+msg);
    }
}

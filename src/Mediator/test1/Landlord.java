package Mediator.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:具体同事类，这里是房东
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 16:48
 */

/**
 * 房东
 */
public class Landlord extends Person {

    public Landlord(Mediator mediator, String pName) {
        super(mediator, pName);
    }

    @Override
    protected void seMessage(String msg) {
        mediator.operation(this,msg);
    }

    @Override
    protected void getMessage(String msg) {
        System.out.println("房东["+ pName +"]收到中介发来的消息：" + msg);
    }
}

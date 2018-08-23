package Mediator.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:抽象同事类
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 16:39
 */
public abstract class Person {

    protected Mediator mediator;

    protected String pName;

    public Person(Mediator mediator, String pName) {
        this.mediator = mediator;
        this.pName = pName;
    }

    /**
     * 设置中介者对象
     * @param mediator
     */
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    //向中介发送消息
    protected abstract  void seMessage(String msg);

    //从中介得到消息
    protected abstract  void getMessage(String msg);
}

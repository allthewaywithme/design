package Memento.memento2;

/**
 * Created with IntelliJ IDEA.
 * Description:管理备份对象的对象
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 17:26
 */
public class Caretaker {

    private Memento2 memento;

    public Memento2 getMemento() {
        return memento;
    }

    public void setMemento(Memento2 memento) {
        this.memento = memento;
    }
}

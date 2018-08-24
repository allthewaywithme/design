package iteration.example1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/24 11:44
 */
public class ConcreteAggregate implements List {

    private int size=0;
    private int index=0;
    private Object[] list;

    ConcreteAggregate(){
        size=0;
        index=0;
        list=new Object[100];
    }


    @Override
    public void add(Object o) {
        list[index++]=o;
        size++;
    }

    @Override
    public Object get(int index) {
        return list[index];
    }

    @Override
    public Itertor iteger() {
        return new ConcreteItertor(this);
    }

    @Override
    public int getSize() {
        return size;
    }
}

package iteration.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:定义容器角色的具体实现类
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/24 11:08
 */
public class ConcreteAggregate implements List {

    private Object[] list;
    private int index=0;
    private int size=0;
    public ConcreteAggregate(){
        index=0;
        size=0;
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
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public int getSize() {
        return size;
    }
}

package iteration.test1;

import iteration.test1.List;

/**
 * Created with IntelliJ IDEA.
 * Description:定义迭代器角色具体实现类
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/24 11:01
 */
public class ConcreteIterator implements Iterator {

    private List list=null;

    private int index;

    public ConcreteIterator(List list){
        super();
        this.list=list;
    }


    @Override
    public boolean hasnext() {
        System.out.println("list:"+list.getSize());
        if (index >= list.getSize()){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object o = list.get(index);
        index++;
        return o;
    }
}

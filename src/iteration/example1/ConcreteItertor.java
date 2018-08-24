package iteration.example1;


/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/24 11:41
 */
public class ConcreteItertor implements Itertor {

    private List list=null;
    private int index;

    ConcreteItertor(List list){
        super();
        this.list=list;
    }


    @Override
    public boolean hasNext() {
        if (index >= list.getSize()){
            return false;
        }else{
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

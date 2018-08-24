package iteration.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:定义容器角色
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/24 11:06
 */
public interface List {

    public void add(Object o);

    public Object get(int index);

    public Iterator iterator();

    public int getSize();
}

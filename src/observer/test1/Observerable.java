package observer.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 14:34
 */
public interface Observerable {

    //注册
    public void registerObserver(Observe observe);

    //删除
    public void removeObserver(Observe observe);

    //遍历通知所有订阅者更新状态
    public void notifyObjserver();
}

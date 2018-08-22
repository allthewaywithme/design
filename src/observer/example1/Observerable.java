package observer.example1;

import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 15:11
 */
public interface Observerable {

    public void registerObserver(Observe observe );

    public void removeObserver(Observe observe);

    public void notifyObserver();
}

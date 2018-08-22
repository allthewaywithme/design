package observer.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 15:13
 */
public class WechatServer implements Observerable{

    private List<Observe> list;
    private String message;

    public WechatServer(){
        list=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observe observe) {
        list.add(observe);
    }

    @Override
    public void removeObserver(Observe observe) {
        if (!list.isEmpty());
        list.remove(observe);
    }

    @Override
    public void notifyObserver() {
        for (int i=0;i<list.size();i++){
            Observe observe = list.get(i);
            observe.update(message);
        }
    }

    public void setInformation(String s){
        this.message=s;
        System.out.println("LOL公众号推送消息："+s);
        notifyObserver();
    }
}

package observer.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 14:37
 */
public class WechatServer implements Observerable {

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

    /**
     * 遍历
     */
    @Override
    public void notifyObjserver() {
        for (int i=0;i<list.size();i++){
            Observe observe1 = list.get(i);
            observe1.update(message);
        }

    }

    public void setInformation(String s){
        this.message=s;
        System.out.println("微信公众号推送信息："+s);
        notifyObjserver();
    }
}

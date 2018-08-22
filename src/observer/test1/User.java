package observer.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 14:46
 */
public class User implements Observe {

    private String name;

    private String message;

    public User(String name){
        this.name=name;
    }

    @Override
    public void update(String message) {
        this.message=message;
        read();
    }

    private void read() {
        System.out.println(name+"收到微信推送的消息："+message);
    }
}

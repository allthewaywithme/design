package observer.example1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 15:17
 */
public class User implements Observe{

    private String name;
    private String message;

    public User(String  name){
        this.name=name;
    }


    @Override
    public void update(String message) {
        this.message=message;
        read();
    }

    public void read(){
        System.out.println(name+"收到公众号信息："+message);
    }
}

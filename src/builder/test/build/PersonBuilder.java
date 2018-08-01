package builder.test.build;

import builder.test.bean.User;
import builder.test.bean.admin;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 14:17
 */
public class PersonBuilder implements build {

    private admin a=new admin();

    @Override
    public void buildAdmin(User user) {
        a.setId(user.getId());
        a.setName(user.getName());
        a.setStatus("这个是自己定义的status,user里没有这个实例属性");

    }

    @Override
    public admin getAdmin() {
        return a;
    }
}

package builder.test.build;

import builder.test.bean.User;
import builder.test.bean.admin;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 14:24
 */
public class director {

    private build b=new PersonBuilder();

    public admin getAdmin(User user){
        b.buildAdmin(user);
        return b.getAdmin();
    }
}

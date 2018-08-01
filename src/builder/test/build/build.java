package builder.test.build;

import builder.test.bean.User;
import builder.test.bean.admin;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 14:15
 */
public interface build {

    public void buildAdmin(User user);

    public admin getAdmin();
}

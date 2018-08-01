package builder.test.main;

import builder.test.bean.User;
import builder.test.bean.admin;
import builder.test.build.director;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 14:27
 */
public class test {
     public static void main(String[] args) {

         User user =new User("1","bob");

         director d =new director();
         admin admin = d.getAdmin(user);
         System.out.println(admin);



     }
}

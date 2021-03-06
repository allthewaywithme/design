package command.example;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 14:26
 */
public class ShowUrl {

     public static void main(String[] args) {

         ShowUrl muDemo = new ShowUrl();
         try {
             muDemo.showURL();
         } catch (IOException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }

      }


    public void showURL() throws IOException {

        // 第一种：获取类加载的根路径   D:\git\daotie\daotie\target\classes
        File f = new File(this.getClass().getResource("/").getPath());
        System.out.println("第一种：");
        System.out.println(f);
        System.out.println("-------------");

        // 获取当前类的所在工程路径; 如果不加“/”  获取当前类的加载目录  D:\git\daotie\daotie\target\classes\my
        File f2 = new File(this.getClass().getResource("").getPath());
        System.out.println(f2);
        System.out.println("-------------");

        // 第二种：获取项目路径    D:\git\daotie\daotie
        File directory = new File("");// 参数为空
        String courseFile = directory.getCanonicalPath();
        System.out.println("第二种：");
        System.out.println(courseFile+"\\src\\command\\example\\config.xml");
        System.out.println("-------------");


        // 第三种：  file:/D:/git/daotie/daotie/target/classes/
        URL xmlpath = this.getClass().getClassLoader().getResource("");
        System.out.println(xmlpath);
        System.out.println("第三种：");
        System.out.println("-------------");


        // 第四种： D:\git\daotie\daotie
        System.out.println("第四种：");
        System.out.println(System.getProperty("user.dir"));
        System.out.println("-------------");
        /*
         * 结果： C:\Documents and Settings\Administrator\workspace\projectName
         * 获取当前工程路径
         */

        // 第五种：  获取所有的类路径 包括jar包的路径
        System.out.println("第五种：");
        System.out.println(System.getProperty("java.class.path"));
        System.out.print("-------------");

    }

}

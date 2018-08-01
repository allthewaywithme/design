package builder.com.test;

import builder.com.bean.AMessage;
import builder.com.bean.CMessage;
import builder.com.build.Director;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 13:16
 */
public class Test {

     public static void main(String[] args) {
/*
         Build build=new ConcreateBuilder();

         AMessage a=new AMessage("1","a的信息");

         Director director = new Director();
         BMessage bMessage = director.getBMessage(a);
         System.out.println(bMessage);*/

        AMessage a =new AMessage("2","这个是a给c赋的值");
        Director director=new Director();
        CMessage cMessage = director.getCMessage(a);
         System.out.println(cMessage);



     }

}

package command.example2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 15:10
 */
public class Client {

     public static void main(String[] args) {

         XiaoFeiZhe xiaoFeiZhe=new XiaoFeiZhe();

         Command command=new MonkeyCommand(xiaoFeiZhe);
         Command command1=new TiggerCommand(xiaoFeiZhe);

         GonFu gonFu=new GonFu(command);
         GonFu gonFu1=new GonFu(command1);

         gonFu.liangong();
         gonFu1.liangong();



      }



}

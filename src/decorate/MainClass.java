package decorate;

/**
 * Created with IntelliJ IDEA.
 * Description:开始制作普通馒头
 * 开始制作添加色素和甜蜜素的馒头
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/31 17:10
 */
public class MainClass {

     public static void main(String[] args) {

            //1.做普通馒头
         /*IBread ib = new NormalBread();
         ib.process();*/
            //2.做添加色素和甜蜜素的馒头

         IBread ib = new NormalBread();//普通馒头

         IBread cornDecorator = new CornDecorator(ib);//加染色剂的馒头

         IBread sweetDecorator = new SweetDecorator(cornDecorator);//加甜蜜素的馒头
         sweetDecorator.process();//蒸馒头


     }




}

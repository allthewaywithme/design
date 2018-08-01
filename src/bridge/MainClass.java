package bridge;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/1 16:18
 */
public class MainClass {

     public static void main(String[] args) {

         Engine engine2000 = new Engine2000();
         Engine engine2200 = new Engine2200();

         Car bus1=new Bus(engine2000);
         bus1.installEngine();

         Car bus2=new Bus(engine2200);
         bus2.installEngine();


         Car jeep1=new Jeep(engine2000);
         Car jeep2=new Jeep(engine2200);
         jeep1.installEngine();
         jeep2.installEngine();


     }
}

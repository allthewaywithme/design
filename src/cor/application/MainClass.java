package cor.application;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/10 11:22
 */
public class MainClass {

     public static void main(String[] args) {

         Request request = new Request.Builder().setName("张三").setDays(5)
                 .setReason("事假").build();
         ChainOfResponsibilityClient client = new ChainOfResponsibilityClient();
         Result result = client.execute(request);

         System.out.println("结果：" + result.toString());


     }
}

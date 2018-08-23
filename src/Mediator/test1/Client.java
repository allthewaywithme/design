package Mediator.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 17:01
 */
public class Client {

     public static void main(String[] args) {

         //实例化房屋中介
         Mediator houseMediator = new HouseMediator();

         Person renter,land1,land2;

         renter=new Renter(houseMediator,"小王");

         land1=new Landlord(houseMediator,"房东A");
         land2=new Landlord(houseMediator,"房东B");

         //中介注册租客信息
         houseMediator.registerRenter(renter);

         //中介注册房东信息
         houseMediator.registerLandlord(land1);
         houseMediator.registerLandlord(land2);

         //租客发布租房子信息
         renter.seMessage("在天河公园附近租套房子，价格1000元左右一个月");
         System.out.println("--------------------------");

         land1.seMessage("天河公园学院站三巷27号四楼有一房一厅出租  1200/月  光线好 近公交站");
         land2.seMessage("天河公园学院站三巷27号四楼有一房一厅出租  800/月  光线好 远公交站");


     }


}

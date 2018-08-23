package Mediator.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:具体中介者类，这里的角色是中介
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 16:57
 */

/**
 * 房屋出租中介
 */
public class HouseMediator extends Mediator {
    @Override
    public void operation(Person person, String msg) {
        if (person instanceof Renter){

            for (Person land:landlordList){
                land.getMessage(msg);
            }

        }else if(person instanceof Landlord){

            for (Person renter:renterList){
                renter.getMessage(msg);
            }

        }
    }
}

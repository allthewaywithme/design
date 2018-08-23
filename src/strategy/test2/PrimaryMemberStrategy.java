package strategy.test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 14:35
 */
public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double bookprice) {
        System.out.println("初级会员没有优惠");
        return bookprice;
    }
}

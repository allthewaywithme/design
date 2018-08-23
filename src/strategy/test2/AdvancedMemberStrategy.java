package strategy.test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 14:42
 */
public class AdvancedMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double bookprice) {
        System.out.println("高级会员打八折");
        return bookprice * 0.8;
    }
}

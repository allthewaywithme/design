package strategy.test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 14:41
 */
public class IntermediateMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double bookprice) {
        System.out.println("中级会员打九折");
        return bookprice * 0.9;
    }
}

package strategy.test2;

import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 14:43
 */
public class Price {

    private MemberStrategy strategy;

    public Price(MemberStrategy strategy){
        this.strategy=strategy;
    }

    public double quote(double bookprice){
        return this.strategy.calcPrice(bookprice);
    }
}

package strategy.test2;

import strategy.test1.Person;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 14:46
 */
public class Client {

     public static void main(String[] args) {

         MemberStrategy primary=new PrimaryMemberStrategy();
         MemberStrategy advancedMemberStrategy = new AdvancedMemberStrategy();
         MemberStrategy intermediateMemberStrategy = new IntermediateMemberStrategy();

         Price price = new Price(primary);
         double quote = price.quote(50);
         System.out.println("图书的最终价格为：" + quote);

         Price price3 = new Price(intermediateMemberStrategy);
         double quote3 =price3.quote(50);
         System.out.println("图书的最终价格为：" + quote3);

         Price price2 = new Price(advancedMemberStrategy);
         double quote2= price2.quote(50);
         System.out.println("图书的最终价格为：" + quote2);



     }



}

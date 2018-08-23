package interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 15:54
 */
public class Client {

     public static void main(String[] args) {

        String number="10";
        Context context=new Context(number);

//        Expression expression=new PlusExpression();
//        expression.interpreter(context);
//        System.out.println(context.getOutput());
//
//        String num="20";
//        Context context1=new Context(num);
//        Expression minusExpression = new MinusExpression();
//         minusExpression.interpreter(context1);
//         System.out.println(context1.getOutput());

         List<Expression> list=new ArrayList<>();
         list.add(new PlusExpression());
         list.add(new PlusExpression());
         list.add(new PlusExpression());
         list.add(new MinusExpression());

         for (Expression ex:list){
             ex.interpreter(context);
             System.out.println(context.getOutput());
         }


     }
}

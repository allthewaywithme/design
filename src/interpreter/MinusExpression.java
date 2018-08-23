package interpreter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 16:09
 */
public class MinusExpression extends Expression {


    @Override
    public void interpreter(Context context) {
        System.out.println("自动递减");

        String input = context.getInput();
        int i = Integer.parseInt(input);
        i--;
        /**
         * 这里要注意 input和output 都要同时改变赋值状态，进行更新
         */
        context.setInput(String.valueOf(i));
        context.setOutput(i);



    }
}

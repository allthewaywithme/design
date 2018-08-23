package interpreter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 15:58
 */
public class PlusExpression extends Expression  {

    public void interpreter(Context context){
        //提示信息
        System.out.println("自动递增");
        //获得上下文
        String input = context.getInput();
        //转换类型
        int i = Integer.parseInt(input);
        //递增
        i++;
        //对上下文环境进行重新赋值
        /**
         * 这里要注意 input和output 都要同时改变赋值状态，进行更新
         */
        context.setInput(String.valueOf(i));
        context.setOutput(i);



    }
}

package cor.application.role;

import cor.application.Ratify;
import cor.application.Request;
import cor.application.Result;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/10 11:34
 */
public class DepartmentHeader implements Ratify {
    @Override
    public Result deal(Chain chain) {
        Request request = chain.request();
        System.out.println("DepartmentHeader=====>request:"
                + request.toString());
        if (request.days() > 7) {
            return new Result(false, "你这个完全没必要");
        }
        return new Result(true, "DepartmentHeader：不要着急，把事情处理完再回来！");
    }

}

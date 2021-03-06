package cor.application.role;

import cor.application.Ratify;
import cor.application.Request;
import cor.application.Result;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/10 11:33
 */
public class Manager implements Ratify {
    @Override
    public Result deal(Chain chain) {
        Request request = chain.request();
        System.out.println("Manager=====>request:" + request.toString());
        if (request.days() > 3) {
            // 构建新的Request
            Request newRequest = new Request.Builder().newRequest(request)
                    .setManagerInfo(request.name() + "每月的KPI考核还不错，可以批准")
                    .build();
            return chain.proceed(newRequest);

        }
        return new Result(true, "Manager：早点把事情办完，项目离不开你");
    }

}

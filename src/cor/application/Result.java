package cor.application;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/10 11:24
 */
public class Result {

    public boolean isRatify;
    public String info;

    public Result() {

    }

    public Result(boolean isRatify, String info) {
        super();
        this.isRatify = isRatify;
        this.info = info;
    }

    public boolean isRatify() {
        return isRatify;
    }

    public void setRatify(boolean isRatify) {
        this.isRatify = isRatify;
    }

    public String getReason() {
        return info;
    }

    public void setReason(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Result [isRatify=" + isRatify + ", info=" + info + "]";
    }

}

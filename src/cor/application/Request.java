package cor.application;

/**
 * Created with IntelliJ IDEA.
 * Description:请假对象
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/10 11:22
 */
public class Request {

    private String name;

    private String reason;

    private int days;

    //组长
    private String groupLeaderInfo;

    //经理
    private String managerInfo;

    //部门领导
    private String departmentHeaderInfo;

    private String customInfo;

    public Request(Builder builder) {
        super();
        this.name = builder.name;
        this.reason = builder.reason;
        this.days = builder.days;
        this.groupLeaderInfo = builder.groupLeaderInfo;
        this.managerInfo = builder.managerInfo;
        this.departmentHeaderInfo = builder.departmentHeaderInfo;
        this.customInfo = builder.customInfo;
    }

    public static class Builder {
        public String name;

        public String reason;

        public int days;

        public String groupLeaderInfo;

        public String managerInfo;

        public String departmentHeaderInfo;

        public String customInfo;

        public Builder() {

        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }

        public Builder setDays(int days) {
            this.days = days;
            return this;
        }

        public Builder setGroupLeaderInfo(String groupLeaderInfo) {
            this.groupLeaderInfo = groupLeaderInfo;
            return this;
        }

        public Builder setManagerInfo(String managerInfo) {
            this.managerInfo = managerInfo;
            return this;
        }

        public Builder setDepartmentHeaderInfo(String departmentHeaderInfo) {
            this.departmentHeaderInfo = departmentHeaderInfo;
            return this;
        }

        public Builder setCustomInfo(String customInfo) {
            this.customInfo = customInfo;
            return this;
        }

        public Builder newRequest(Request request) {
            this.name = request.name;
            this.days = request.days;
            this.reason = request.reason;
            if (request.groupLeaderInfo != null
                    && !request.groupLeaderInfo.equals("")) {
                this.groupLeaderInfo = request.groupLeaderInfo;
            }

            if (request.managerInfo != null && !request.managerInfo.equals("")) {
                this.managerInfo = request.managerInfo;
            }

            if (request.departmentHeaderInfo != null
                    && !request.departmentHeaderInfo.equals("")) {
                this.departmentHeaderInfo = request.departmentHeaderInfo;
            }

            if (request.customInfo != null && !request.customInfo.equals("")) {
                this.customInfo = request.customInfo;
            }


            return this;
        }

        public Request build() {
            return new Request(this);
        }
    }

    public String name() {
        return name;
    }

    public String reason() {
        return reason;
    }

    public int days() {
        return days;
    }

    public String groupLeaderInfo() {
        return groupLeaderInfo;
    }

    public String managerInfo() {
        return managerInfo;
    }

    public String departmentHeaderInfo() {
        return departmentHeaderInfo;
    }

    public String customInfo() {
        return customInfo;
    }

    @Override
    public String toString() {
        return "Request [name=" + name + ", reason=" + reason + ", days="
                + days + ",customInfo=" + customInfo + ", groupLeaderInfo="
                + groupLeaderInfo + ", managerInfo=" + managerInfo
                + ", departmentHeaderInfo=" + departmentHeaderInfo + "]";
    }

}

package builder;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 9:51
 */
public class PingFangBuilder implements HourseBuilder {

    Hourse hourse=new Hourse();


    @Override
    public void makeWall() {
        hourse.setWall("建平房的墙");
    }

    @Override
    public void makeFloor() {
        hourse.setFloor("建平房的地板");

    }

    @Override
    public void makeHourseTop() {
        hourse.setHourseTop("建平房的屋顶");
    }

    @Override
    public Hourse getHourse() {
        return hourse;
    }
}

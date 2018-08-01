package builder;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 10:23
 */
public class GongyuBuilder  implements HourseBuilder{

    Hourse hourse =new Hourse();

    @Override
    public void makeWall() {
        hourse.setWall("建造公寓的墙");
    }

    @Override
    public void makeFloor() {
        hourse.setFloor("建造公寓的地板");
    }

    @Override
    public void makeHourseTop() {
        hourse.setHourseTop("建造公寓的屋顶");
    }

    @Override
    public Hourse getHourse() {
        return hourse;
    }
}

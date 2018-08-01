package builder;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/30 10:17
 */
public class HourseDirector {

    private HourseBuilder hourseBuilder;

    public HourseDirector(HourseBuilder hourseBuilder){
        this.hourseBuilder=hourseBuilder;
    }

    public void makeHourse(){
        hourseBuilder.makeWall();
        hourseBuilder.makeFloor();
        hourseBuilder.makeHourseTop();

    }



}

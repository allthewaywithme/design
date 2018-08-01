package flyweight.news;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/1 10:28
 */
public class TeacherFactory {

    private Map<String,Teacher> pool;

    public TeacherFactory(){
        pool=new HashMap<String,Teacher>();
    }

    public Teacher getTeacher(String number){
        Teacher teacher=pool.get(number);
        if (teacher==null){
            teacher =new Teacher();
            teacher.setNumber(number);
            pool.put(number,teacher);
        }
        return teacher;
    }
}

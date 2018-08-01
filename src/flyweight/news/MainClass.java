package flyweight.news;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/1 10:24
 */
public class MainClass {

     public static void main(String[] args) {


         TeacherFactory factory=new TeacherFactory();

         Teacher teacher1 = factory.getTeacher("010201");
         Teacher teacher2 = factory.getTeacher("010202");
         Teacher teacher3 = factory.getTeacher("010201");
         Teacher teacher4 = factory.getTeacher("010204");
         Teacher teacher5 = factory.getTeacher("010205");
         Teacher teacher6 = factory.getTeacher("010206");

         System.out.println(teacher1);
         System.out.println(teacher2);
         System.out.println(teacher3);
         System.out.println(teacher4);
         System.out.println(teacher5);
         System.out.println(teacher6);

         if (teacher1==teacher3){
             System.out.println("true");
         }else {
             System.out.println("false");
         }


     }
}

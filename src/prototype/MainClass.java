package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/31 9:54
 */
public class MainClass {

     public static void main(String[] args) {

         List<String> list=new ArrayList<>();
         list.add("aa");
         list.add("bb");
         list.add("cc");
         //浅度克隆


        Person person1=new Person("p1", list);
        Person person2=person1.clone();
        person2.setName("p2");
         list.add("dd");
        person1.setList(list);

        System.out.println(person1.getName()+"***"+person1.getList());
        System.out.println(person2.getName()+"***"+person2.getList());

        System.out.println("--------------------分割线----------------------------");


        //深度克隆
        Person2 person21=new Person2("bob","男",list);

         Person2 person22=person21.clone();
         person21.setName("jack");
         list.add("dd");
         person21.setList(list);

        System.out.println(person21);
        System.out.println(person22);


         list.add("ee");
         person22.setList(list);
         System.out.println(person21.getName()+"***"+person21.getList());
         System.out.println(person22.getName()+"***"+person22.getList());





      }




}

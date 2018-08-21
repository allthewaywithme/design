package Memento.memento;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 17:18
 */
public class MainClass {

     public static void main(String[] args) {

      Person person=new Person("bob",20,"男");
         //备份
         Memento memento = person.createMemento();
         person.display();

         person.setAge(30);
         person.display();

         person.setMemento(memento);
         person.display();



     }



}

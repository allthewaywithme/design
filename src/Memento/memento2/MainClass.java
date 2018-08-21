package Memento.memento2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/21 17:18
 */
public class MainClass {

     public static void main(String[] args) {

      Person2 person=new Person2("bob",20,"男");


         Caretaker caretaker=new Caretaker();
         //备份
         caretaker.setMemento(person.createMemento());
         person.display();

         person.setAge(33);
         person.display();


         person.setMemento(caretaker.getMemento());
         person.display();



     }



}

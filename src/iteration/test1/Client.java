package iteration.test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/24 11:16
 */
public class Client {
    
     public static void main(String[] args) {


         List list = new ConcreteAggregate();
         list.add("a");
         list.add("b");
         list.add("c");
         list.add("d");
         Iterator iterator = list.iterator();
         while (iterator.hasnext()){
             System.out.println(iterator.next());
         }



     }
}

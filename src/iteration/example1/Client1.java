package iteration.example1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/24 11:47
 */
public class Client1 {

     public static void main(String[] args) {

         List list = new ConcreteAggregate();
         list.add("A");
         list.add("B");
         list.add("C");
         list.add("D");
         Itertor iteger = list.iteger();
         while (iteger.hasNext()){
             System.out.println(iteger.next());
         }



     }
}

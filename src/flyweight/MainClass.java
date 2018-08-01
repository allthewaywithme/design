package flyweight;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/1 10:09
 */
public class MainClass {

     public static void main(String[] args) {
         
         
         MyCharacterFactory factory=new MyCharacterFactory();

         MyCharacter myCharacter1 = factory.getMyCharacter('a');
         MyCharacter myCharacter2 = factory.getMyCharacter('b');
         MyCharacter myCharacter3 = factory.getMyCharacter('a');
         MyCharacter myCharacter4 = factory.getMyCharacter('d');
         MyCharacter myCharacter5 = factory.getMyCharacter('e');

         System.out.println(myCharacter1.toString());
         System.out.println(myCharacter2.toString());
         System.out.println(myCharacter3.toString());
         System.out.println(myCharacter4.toString());
         System.out.println(myCharacter5.toString());

         if (myCharacter1==myCharacter3){
             System.out.println("true");
         }else {
             System.out.println("false");
         }


     }
}

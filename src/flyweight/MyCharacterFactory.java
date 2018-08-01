package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/1 10:11
 */
public class MyCharacterFactory {

    private Map<Character,MyCharacter> pool;

    public MyCharacterFactory(){
        pool=new HashMap<Character,MyCharacter>();
    }

    public  MyCharacter getMyCharacter(Character character){

        MyCharacter myCharacter = pool.get(character);
        if (myCharacter==null){
            myCharacter=new MyCharacter(character);
            pool.put(character,myCharacter);
        }
        return myCharacter;
    }



}

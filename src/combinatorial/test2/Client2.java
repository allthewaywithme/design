package combinatorial.test2;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 10:40
 */
public class Client2 {

     public static void main(String[] args) {

         Noder2 noder2=new Noder2("d://ceshi");
         createNode(noder2);
         noder2.display();
      }


    public static void createNode(Noder2 noder2){

        File file=new File(noder2.getNode());

        File[] files = file.listFiles();

        for (File n2: files){
            if(n2.isFile()){
                File2 file1=new File2(n2.getAbsolutePath());
                noder2.addFile(file1);
            }

            if (n2.isDirectory()){
                Noder2 noder21=new Noder2(n2.getAbsolutePath());
                noder2.addNode(noder21);
                createNode(noder21);//使用递归生成树结构
            }
        }
    }


}

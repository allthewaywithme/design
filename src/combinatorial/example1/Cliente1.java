package combinatorial.example1;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 11:08
 */
public class Cliente1 {

     public static void main(String[] args) {

         Node node=new NodeImpl("D://ceshi");
         try {
             createNode(node);
         } catch (Exception e) {
             e.printStackTrace();
         }
         node.display();
     }


    public static  void createNode(Node node) throws Exception {

        File file=new File(node.node);
        File[] files = file.listFiles();
        for (File f:files){
            if (f.isFile()){
                FileImpl fi1=new FileImpl(f.getAbsolutePath());
                node.addNode(fi1);
            }
            if (f.isDirectory()){
                NodeImpl ni1=new NodeImpl(f.getAbsolutePath());
                node.addNode(ni1);
                createNode(ni1);//使用递归生成树形结构
            }
        }
    }
}

package combinatorial.example2;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 11:36
 */
public class Client {

     public static void main(String[] args) {

         Node node=new NodeImpl("D://java");
         try {
             createNode(node);
         } catch (Exception e) {
             e.printStackTrace();
         }
         node.display();
     }

    public static void createNode(Node node) throws Exception{
        File file=new File(node.nodeName);
        File[] files = file.listFiles();
        for (File f:files){
            if (f.isFile()){
                FileImpl file1=new FileImpl(f.getAbsolutePath());
                node.addNode(file1);
            }
            if (f.isDirectory()){
                NodeImpl node1=new NodeImpl(f.getAbsolutePath());
                node.addNode(node1);
                createNode(node1);//使用递归生成下级树形目录
            }
        }


    }
}

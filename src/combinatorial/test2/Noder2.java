package combinatorial.test2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 10:31
 */
public class Noder2 {

    private String node;//目录名

    public Noder2(String node){
        this.node=node;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    private List<Noder2> nodeList=new ArrayList<>();

    private List<File2> file2List=new ArrayList<>();

    //添加目录、添加文件方法

    //添加下级目录
    public void addNode(Noder2 noder2){
        nodeList.add(noder2);
    }

    //添加文件
    public void addFile(File2 file2){
        file2List.add(file2);
    }

    //显示文件名、下级目录
    public void display(){
        //显示下级目录名
        for (Noder2 noder2: nodeList){
            System.out.println(noder2.node);
            noder2.display();
        }

        for (File2 file2 : file2List){
            file2.display();
        }
    }


}

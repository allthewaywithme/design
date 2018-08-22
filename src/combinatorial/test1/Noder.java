package combinatorial.test1;

import javax.annotation.processing.Filer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 9:57
 */

/**
 * nodeName 目录名
 * nodeList 目录的下级目录列表
 * fileList 目录的下级文件列表
 * addNoder 新增下级目录
 * addFiler 新增文件
 * display  显示下级内容和方法（包含目录和文件）
 *
 */
public class Noder {

    String nodeName;//目录名

    //通过构造器为目录命名
    public Noder(String nodeName) {
        this.nodeName = nodeName;
    }

    List<Noder> nodeList = new ArrayList<Noder>();//目录的下级目录列表
    List<Filer1> fileList = new ArrayList<Filer1>();//目录的下级文件列表

    //新增下级目录
    public void addNoder(Noder noder) {
        nodeList.add(noder);
    }

    //新增文件
    public void addFiler(Filer1 filer) {
        fileList.add(filer);
    }

    //显示下级目录及文件
    public void display() {
        for (Noder noder : nodeList) {
            System.out.println(noder.nodeName);
            noder.display();//递归显示目录列表
        }
        for (Filer1 filer : fileList) {
            filer.display();
        }
    }

}

package combinatorial.test1;

import javax.annotation.processing.Filer;
import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 10:10
 */
public class Client {

    public static void createTree(Noder node) {
        File file = new File(node.nodeName);
        File[] f = file.listFiles();
        for (File fi : f) {
            if (fi.isFile()) {
                Filer1 filer = new Filer1(fi.getAbsolutePath());
                node.addFiler(filer);
            }
            if (fi.isDirectory()) {
                Noder noder = new Noder(fi.getAbsolutePath());
                node.addNoder(noder);
                createTree(noder);//使用递归生成树结构
            }
        }
    }

    public static void main(String[] args) {
        Noder noder = new Noder("d://ceshi");
        createTree(noder);//创建目录树形结构
        noder.display();//显示目录及文件

//        System.out.println(sum(100));//一个简单的递归方法
    }


    public static int sum(int num){
        if(num == 1){
            return 1;
        }
        return num + sum(num-1);

    }

}

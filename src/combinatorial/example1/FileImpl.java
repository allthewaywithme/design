package combinatorial.example1;

/**
 * Created with IntelliJ IDEA.
 * Description:实现文件节点
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 11:02
 */
public class FileImpl extends Node {

    //通过构造器给node赋值
    public FileImpl(String node) {
        super(node);
    }

    //重写display方法，实现文件的具体内容
    @Override
    public void display() {
        System.out.println(node);
    }
}

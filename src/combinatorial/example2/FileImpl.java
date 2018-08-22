package combinatorial.example2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 11:23
 */
public class FileImpl extends Node {
    public FileImpl(String nodeName) {
        super(nodeName);
    }

    @Override
    public void display() {
        System.out.println(nodeName);
    }
}

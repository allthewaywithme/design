package combinatorial.example2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 11:21
 */
public abstract class Node {

    protected String nodeName;

    public Node(String nodeName) {
        this.nodeName = nodeName;
    }

    public void addNode(Node file1)throws Exception{
        throw new Exception("Invalid exception");
    }

    public abstract void  display();
}

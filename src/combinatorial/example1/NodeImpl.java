package combinatorial.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:目录节点实现
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 11:04
 */
public class NodeImpl extends  Node {

    List<Node> list=new ArrayList<>();

    public void addNode(Node node) throws Exception{
        list.add(node);
    }

    public NodeImpl(String node) {
        super(node);
    }

    @Override
    public void display() {
        System.out.println(node);
        for (Node n: list){
            n.display();
        }
    }
}

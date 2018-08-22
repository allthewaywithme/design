package combinatorial.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 11:23
 */
public class NodeImpl extends Node {

    List<Node> list =new ArrayList<>();

    public NodeImpl(String nodeName) {
        super(nodeName);
    }

    public void addNode(Node node){
        list.add(node);
    }

    @Override
    public void display() {
        System.out.println(nodeName);
        for (Node n:list){
            n.display();
        }
    }
}

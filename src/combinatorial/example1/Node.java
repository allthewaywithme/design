package combinatorial.example1;

/**
 * Created with IntelliJ IDEA.
 * Description:将文件与目录统一看成是一个节点，用一个抽象类来定义这个节点
 * 然后通过她的实现类来具体区分文件和目录，再实现类中分别定义各自的具体的实现内容
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/22 10:54
 */
public abstract class Node {

    protected String node;//节点名称

    //构造器赋值
    public Node(String node){
        this.node=node;
    }

    //新增节点，文件节点无此方法，目录节点重写此方法
    public  void addNode(Node node) throws  Exception{
        throw new Exception("Invalid exception");
    }

    //显示节点，文件与目录都重写此方法
    public abstract void display();




}

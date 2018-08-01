package facade;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/31 15:49
 */
public class Facade {

    private Cpu cpu;

    private Disk disk;

    private Memory memory;

    public Facade(){
        cpu=new Cpu();
        disk=new Disk();
        memory=new Memory();
    }

    public void start(){
        System.out.println("电脑开启中......");
        cpu.start();
        disk.start();
        memory.start();
        System.out.println("电脑已开启------");
    }

    public void shutDown(){
        System.out.println("电脑关机中........");
        cpu.shutown();
        disk.shutown();
        memory.shutown();
        System.out.println("电脑已关机--------");
    }



}

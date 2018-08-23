package Mediator.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:抽象者中介类
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/23 16:41
 */
public abstract  class Mediator {

    //添加房东角色
    protected List<Person> landlordList=new ArrayList<>();
    //添加租客角色
    protected List<Person> renterList=new ArrayList<>();

    /**
     * 中介者注册房东信息
     * @param landlord
     */
    public void registerLandlord(Person landlord){
        landlordList.add(landlord);
    }

    /**
     * 中介者注册租客信息
     * @param renter
     */
    public void registerRenter(Person renter){
        renterList.add(renter);
    }


    //声明抽象方法 由具体中介者子类实现 消息的中转和协调
    public abstract void operation(Person person,String msg);
}

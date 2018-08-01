package proxy.news;

import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/8/1 15:20
 */
public class MainClass {

     public static void main(String[] args) {

         RealSubject realSubject=new RealSubject();
         MyHandler myHandler=new MyHandler();
         myHandler.setRealSubject(realSubject);

         Subject subject =(Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), realSubject.getClass().getInterfaces(), myHandler);
         subject.sailBook();

     }


}

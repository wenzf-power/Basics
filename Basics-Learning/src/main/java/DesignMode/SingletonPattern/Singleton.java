package main.java.DesignMode.SingletonPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/21/11:32
 * @Description: 通用单例模式：直接 new 一个对象传递给类的成员变量 singleton，需要的时候 getInstance（）直接返回
 */
public class Singleton {

    private static final Singleton singleton=new Singleton();

    /***
    * @Description: 限制住不能直接产生一个实例
    */
    private Singleton(){

    }

    public synchronized static Singleton getInstance(){
        return singleton;
    }

    public void singletonName() {
        System.out.println("我是唯一的一个实例，调用多少次都是同一个的我");
    }
}

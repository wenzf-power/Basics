package main.java.Other.singleton;

/**
 * @Author: wenzf
 * @Date: 2022/11/14/10:51
 * @Description: 饿汉式单例模式
 * 单例模式是指确保一个类在任何情况下都绝对只有一个实例，并提供一个全局访问点
 * 饿汉式单例模式，在类加载的时候就立即初始化，并且创建单例对象，绝对线程安全，在线程还没出现的时候就实例化了
 * 优点： 没有任何锁，执行效率较高，用户体验比懒汉式单例模式更好
 * 缺点：类加载的时候就初始化，无论是否使用都会占用空间，浪费内存资源
 */
public class HungrySingleton {

    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){
    }

    public static HungrySingleton getInstance(){
        return  singleton;
    }
}
/***
* @Description: 利用静态代码块机制，创建单例
*/
class HungryStaticSingleton{
    private static final HungryStaticSingleton staticSingleton;
    static {
        staticSingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){
    }

    public static HungryStaticSingleton getInstance() {
        return staticSingleton;
    }
}
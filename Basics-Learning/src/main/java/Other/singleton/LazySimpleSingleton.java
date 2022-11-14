package main.java.Other.singleton;

/**
 * @Author: wenzf
 * @Date: 2022/11/14/11:03
 * @Description: 懒汉式单例模式 ： 在外部调用的时候开始加载
 */
public class LazySimpleSingleton {

    private LazySimpleSingleton() {
    }
    private static LazySimpleSingleton lazySimpleSingleton = null;

    public static LazySimpleSingleton getInstance() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}

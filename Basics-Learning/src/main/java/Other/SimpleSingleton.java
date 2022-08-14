package main.java.Other;

/**
 * @Author: wenzf
 * @Date 2021-9-2
 * @Description: 单例的使用
 */
public class SimpleSingleton {
     private static SimpleSingleton simpleSingleton = new SimpleSingleton();

    private SimpleSingleton() {

    }

    public static SimpleSingleton getInstance() {
        return simpleSingleton;
    }
}

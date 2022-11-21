package main.java.DesignMode.SingletonPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/21/11:42
 * @Description: 通用单例模式测试
 */
public class TestSingleton {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Singleton singleton = Singleton.getInstance();
            singleton.singletonName();
        }
    }
}
/***
* 结果：
 * 我是唯一的一个实例，调用多少次都是同一个的我
 * 我是唯一的一个实例，调用多少次都是同一个的我
 * 我是唯一的一个实例，调用多少次都是同一个的我
 * 我是唯一的一个实例，调用多少次都是同一个的我
 * 我是唯一的一个实例，调用多少次都是同一个的我
*/
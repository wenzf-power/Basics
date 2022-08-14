package main.java.Thread.ThreadDemo;

/**
 * @Author: wenzf
 * @Date 2021-8-4
 * @Description:加锁后的线程运行
 */
public class ThreadDemo4 {
    public static void main(String[] args) {
        ThreadDemo2 thread2 = new ThreadDemo2();
        Thread  t1= new Thread(thread2);
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();
    }
}

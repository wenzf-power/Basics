package main.java.Thread.ThreadDemo;

/**
 * @Author: wenzf
 * @Date 2021-8-4
 * @Description:加锁后的线程运行
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(ThreadDemo3::print);
        Thread t2 = new Thread(ThreadDemo3::print1);
        t1.start();
        t2.start();
    }
    public  static  synchronized void print(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    public static synchronized void print1() {
        for (int i = 0; i <5 ; i++) {
            System.out.println(i);
        }
    }
}

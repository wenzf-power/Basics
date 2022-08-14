package main.java.Thread.ThreadDemo;

/**
 * @Author: wenzf
 * @Date 2021-12-1
 * @Description:start()和run()方法的使用
 * run()就是直接调用Thread线程的Runnable成员的run()方法，并不会新建一个线程。
 * run() 方法和普通成员方法一样，可以重复调用。单独调用 run()方法时，会在当前线程执行 run() 方法，而不会启动新的线程。
 * start()实际上是通过本地方法start0()启动线程的。而start0()会新运行一个线程，新线程会调用run()方法。
 * 调用start()方法后，线程进入就绪状态
 */
public class ThreadDemo6 {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        System.out.println(Thread.currentThread().getName()+" TestThread run()");
        thread.run();
        System.out.println(Thread.currentThread().getName()+" TestThread start()");
        thread.start();
    }
}
class TestThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is running");
    }
}

package main.java.Thread.ThreadDemo;

/**
 * @Author: wenzf
 * @Date 2021-12-1
 * @Description:线程等待与唤醒的运用
 * wait() 的作用是让当前线程进入等待状态，同时，wait() 也会让当前线程释放它所持有的锁。
 * 而 notify() 和 notifyAll() 的作用，则是唤醒当前对象上的等待线程；notify() 是唤醒单个线程，而 notifyAll() 是唤醒所有的线程
 *
 * ①、 注意，图中"主线程" 代表“主线程main”。"线程t1" 代表Demo02中启动的“线程t1”。 而“锁” 代表“t1这个对象的同步锁”。
 * ②、“主线程”通过 new ThreadA("t1") 新建“线程t1”。随后通过synchronized(t1)获取“t1对象的同步锁”。然后调用t1.start()启动“线程t1”。
 * ③、“主线程”执行t1.wait() 释放“t1对象的锁”并且进入“等待(阻塞)状态”。等待t1对象上的线程通过notify() 或 notifyAll()将其唤醒。
 * ④、“线程t1”运行之后，通过synchronized(this)获取“当前对象的锁”；接着调用notify()唤醒“当前对象上的等待线程”，也就是唤醒“主线程”。
 * ⑤、“线程t1”运行完毕之后，释放“当前对象的锁”。紧接着，“主线程”获取“t1对象的锁”，然后接着运行
 */
public class ThreadDemo11 {
    public static void main(String[] args) {
        Thread t1 = new DemoThread("t1");
        synchronized (t1){
            try {
                //启动线程1
                System.out.println(Thread.currentThread().getName()+" start t1");
                t1.start();
                System.out.println(Thread.currentThread().getName()+" wait()");
                t1.wait();
                System.out.println(Thread.currentThread().getName()+" continue");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
class DemoThread extends Thread{
    public DemoThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        synchronized (this){
            try{
                System.out.println(Thread.currentThread().getName()+" call notify()");
                notify();//唤醒当前ThreadDemo11线程
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }
}

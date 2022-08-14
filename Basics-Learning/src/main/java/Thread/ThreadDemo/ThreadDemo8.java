package main.java.Thread.ThreadDemo;

/**
 * @Author: wenzf
 * @Date 2021-12-1
 * @Description: 同步锁synchronized的运用
 * 在java中，每一个对象有且仅有一个同步锁。这也意味着，同步锁是依赖于对象而存在
 *
 *(1) 当一个线程访问“某对象”的“synchronized方法”或者“synchronized代码块”时，其他线程对“该对象”的该“synchronized方法”或者“synchronized代码块”的访问将被阻塞。
 */
public class ThreadDemo8 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        synchronized (this) {
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(1000);// 休眠1秒
                    System.out.println(Thread.currentThread().getName() + "---" + i);
                }
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
/**
 * 运行结果示例：
 * Thread-0---0
 * Thread-0---1
 * Thread-0---2
 * Thread-0---3
 * Thread-0---4
 * Thread-1---0
 * Thread-1---1
 * Thread-1---2
 * Thread-1---3
 * Thread-1---4
 */

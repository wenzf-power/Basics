package main.java.Thread.ThreadDemo;

/**
 * @Author: wenzf
 * @Date 2021-12-1
 * @Description:同步锁synchronized的运用
 *(3)当一个线程访问“某对象”的“synchronized方法”或者“synchronized代码块”时，其他线程对“该对象”的其他的“synchronized方法”或者“synchronized代码块”的访问将被阻塞
 */
public class ThreadDemo10 {
    public static void main(String[] args) {
        ThreadDemo10 demo10 = new ThreadDemo10();
        new Thread(()->{
            demo10.synCount1();
        }).start();
        new Thread(()->{
            demo10.SynCount2();
        }).start();
    }
    // 同步代码块的方法
    public void synCount1 () {
        synchronized (this) {
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(1000);// 休眠1秒
                    System.out.println(Thread.currentThread().getName() + " syn count1 method " + i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    // 同步代码块的方法
    public void SynCount2 () {
        synchronized (this) {
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(1000);// 休眠1秒
                    System.out.println(Thread.currentThread().getName() + " syn count2 method " + i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
/**
 * 运行结果示例：
 * Thread-0 syn count1 method 0
 * Thread-0 syn count1 method 1
 * Thread-0 syn count1 method 2
 * Thread-0 syn count1 method 3
 * Thread-0 syn count1 method 4
 * Thread-1 syn count2 method 0
 * Thread-1 syn count2 method 1
 * Thread-1 syn count2 method 2
 * Thread-1 syn count2 method 3
 * Thread-1 syn count2 method 4
 */

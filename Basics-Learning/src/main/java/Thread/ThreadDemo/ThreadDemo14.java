package main.java.Thread.ThreadDemo;

/**
 * @Author: wenzf
 * @Date 2021-12-1
 * @Description: 线程join() 方法的使用
 * join() 定义 Thread 类中的，作用是：把指定的线程加入到当前线程，可以将两个交替执行的线程合并为顺序执行的线程。
 * 如：线程B中调用了线程A的Join()方法，直到线程A执行完毕后，才会继续执行线程B。
 */
public class ThreadDemo14 {
    public static void main(String[] args) {
        try {
            Thread t1 = new DemoThread("t1");
            t1.start();
            t1.join();//将线程t1加入到主线程main中，并且主线程main()会等待它的完成
            System.out.println(Thread.currentThread().getName() + " main end.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    static class DemoThread extends Thread{
        public DemoThread(String name) {
            super(name);
        }
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " run start.");
            for(int i = 0;i < 10000;i++) {
                ;
            }
            System.out.println(Thread.currentThread().getName() + " run end.");
        }
    }
}
/**
 * 运行结果示例：
 * t1 run start.
 * t1 run end.
 * main main end.
 */

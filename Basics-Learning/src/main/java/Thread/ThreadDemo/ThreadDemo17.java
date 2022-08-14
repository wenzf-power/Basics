package main.java.Thread.ThreadDemo;

/**
 * @Author: wenzf
 * @Date 2021-12-1
 * @Description: 守护线程的使用
 *
 * ①、主线程main是用户线程，它创建的子线程t1也是用户线程。
 * ②、t2 是守护线程。在“主线程main”和“子线程t1”(它们都是用户线程)执行完毕，只剩t2这个守护线程的时候，JVM自动退出。
 */
public class ThreadDemo17 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"[ isDaemon ="+Thread.currentThread().isDaemon()+"]");
        Thread t1 = new DemoThread("t1");
        Thread t2 = new DaemonDemo("t2");
        t2.setDaemon(true);//设置t2为守护线程
        t1.start();
        t2.start();
    }
    static class DemoThread extends Thread{
        public DemoThread(String name) {
            super(name);
        }
        @Override
        public void run(){
            try {
                for (int i=0; i<5; i++) {
                    Thread.sleep(3);
                    System.out.println(this.getName() +"[ isDaemon = "+this.isDaemon()+ " ] " + "loop " + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        }
    }
    class DaemonDemo extends Thread{
        public DaemonDemo(String name) {
            super(name);
        }
        @Override
        public void run(){
            try {
                for (int i=0; i<10000; i++) {
                    Thread.sleep(1);
                    System.out.println(this.getName() +"[ isDaemon = " + this.isDaemon() + " ] " +"loop "+i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
/**
 * 运行结果示例：
 * main[ isDaemon =false]
 * t2[ isDaemon = true ] loop 0
 * t2[ isDaemon = true ] loop 1
 * t1[ isDaemon = false ] loop 0
 * t2[ isDaemon = true ] loop 2
 * t1[ isDaemon = false ] loop 1
 * t2[ isDaemon = true ] loop 3
 * t2[ isDaemon = true ] loop 4
 * t2[ isDaemon = true ] loop 5
 * t1[ isDaemon = false ] loop 2
 * t2[ isDaemon = true ] loop 6
 * t2[ isDaemon = true ] loop 7
 * t2[ isDaemon = true ] loop 8
 * t1[ isDaemon = false ] loop 3
 * t2[ isDaemon = true ] loop 9
 * t2[ isDaemon = true ] loop 10
 * t1[ isDaemon = false ] loop 4
 */

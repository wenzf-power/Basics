package main.java.Thread.ThreadDemo;

/**
 * @Author: wenzf
 * @Date 2021-12-1
 * @Description:线程让步 yield()的使用
 * yield()的作用是让步。它能让当前线程由“运行状态”进入到“就绪状态”，从而让其它具有相同优先级的等待线程获取执行权；
 * 但是，并不能保证在当前线程调用yield()之后，其它具有相同优先级的线程就一定能获得执行权；也有可能是当前线程又进入到“运行状态”继续运行
 *
 * ①、wait()是让线程由“运行状态”进入到“等待(阻塞)状态”，而 yield() 是让线程由“运行状态”进入到“就绪状态”。
 * ②、wait() 是会线程释放它所持有对象的同步锁，而 yield() 方法不会释放锁。
 */
public class ThreadDemo13 {
    public static void main(String[] args) {
        Thread t1 = new DemoThread("t1");
        Thread t2 = new DemoThread("t2");
        t1.start();
        t2.start();
    }
    static class DemoThread extends Thread{
        public DemoThread(String name) {
            super(name);
        }
        @Override
        public synchronized void run() {
            try {
                for(int i = 0;i < 5;i++) {
                    System.out.println(Thread.currentThread().getName() + "--" + this.getPriority() + "--"+ i);
                    if (i % 4 == 0) {
                        Thread.yield();
                    }
                }
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
/**
 * 运行结果示例（每次运行结果可能不同）
 * t1--5--0
 * t2--5--0
 * t1--5--1
 * t2--5--1
 * t1--5--2
 * t2--5--2
 * t1--5--3
 * t1--5--4
 * t2--5--3
 * t2--5--4
 */

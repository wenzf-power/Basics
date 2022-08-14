package main.java.Thread.ThreadDemo;

/**
 * @Author: wenzf
 * @Date 2021-12-1
 * @Description: 线程优先级的使用
 * 主线程main的优先级是5
 *
 * Java中线程优先级分为三个级别：
 *
 * 低优先级：1~4，其中类变量 Thread.MIN_PRORITY 最低，数值为1；
 * 默认优先级：如果一个线程没有指定优先级，默认优先级为5，由类变量 Thread.NORM_PRORITY表示；
 * 高优先级：6~10，类变量 Thread.MAX_PRORITY 最高，数值为10。
 */
public class ThreadDemo16 {
    public static void main(String[] args) {
        Thread t1 = new DemoThread("t1");
        Thread t2 = new DemoThread("t2");
        t1.setPriority(1); //设置优先级为1
        t2.setPriority(10); //设置优先级为10
        t1.start();
        t2.start();
    }
    static class DemoThread extends Thread {
        public DemoThread(String name) {
            super(name);
        }
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + " [ "
                        + Thread.currentThread().getPriority() + " ] loop " + i);
            }
        }

    }
}
/**
 * 根据时间片轮循调度，并发执行,运行结果示例(每次运行结果顺序不一样）
 * t2 [ 10 ] loop 0
 * t1 [ 1 ] loop 0
 * t2 [ 10 ] loop 1
 * t2 [ 10 ] loop 2
 * t1 [ 1 ] loop 1
 * t1 [ 1 ] loop 2
 */

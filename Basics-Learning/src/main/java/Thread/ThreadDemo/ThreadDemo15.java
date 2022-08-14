package main.java.Thread.ThreadDemo;

/**
 * @Author: wenzf
 * @Date 2021-12-1
 * @Description:线程中断 interrupted()的运用
 * 通过 interrupt() 中断线程时，它的中断标记会被设置为 true。
 * interrupted() 除了返回中断标记之外，它还会清除中断标记（即将中断标记设为 false）；而 isInterrupted() 仅仅返回中断标记。
 *
 * 若线程通过 wait() 进入阻塞状态，此时通过 interrupt() 中断该线程；
 * 然后调用 interrupt() 会立即将线程的中断标记设为 true，但是由于线程处于阻塞状态，所以该“中断标记”会立即被清除为 “false”，同时，会产生一个 InterruptedException 的异常
 */
public class ThreadDemo15 {
    public static void main(String[] args) {
        try {
            Thread t1 = new DemoThread("t1"); // 新建线程t1
            System.out.println(t1.getName() + "[" + t1.getState() + "] is new.");
            t1.start();// 启动线程t1
            System.out.println(t1.getName() + "[" + t1.getState() + "] is started.");
            Thread.sleep(3000);// 休眠3000毫秒，然后主线程给t1发“中断”指令，查看t1状态
            t1.interrupt();
            System.out.println(t1.getName() + "[" + t1.getState() + "] is interrupted.");
            Thread.sleep(3000);// 休眠3000毫秒，然后查看t1状态
            System.out.println(t1.getName() + "[" + t1.getState() + "] is interrupted now.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

     static class DemoThread extends Thread {
        public DemoThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                int i = 0;
                while (!isInterrupted()) {
                    Thread.sleep(1000);// 休眠1000毫秒
                    ++i;
                    System.out.println(Thread.currentThread().getName() + "[" + this.getState() + "] loop " + i);
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "[" + this.getState() + "] catch InterruptedException");
            }
        }
    }
}

/**
 * 综合线程处于“阻塞状态”和“运行状态”的终止方式，比较通用的终止线程的形式如下
 *  public void run() {
 *  try {
 *  // 1. isInterrupted()保证，只要中断标记为true就终止线程。
 *  while (!isInterrupted()) {
 *  // 执行任务... }
 *  } catch (InterruptedException ie) {
 *  // 2. InterruptedException异常保证，当InterruptedException异常产生时，线程被终止。 }
 *  }
 */
/**
 * 运行结果示例：
 *  t1[NEW] is new.
 *  t1[RUNNABLE] is started.
 *  t1[RUNNABLE] loop 1
 *  t1[RUNNABLE] loop 2
 *  t1[TIMED_WAITING] is interrupted.
 *  t1[RUNNABLE] catch InterruptedException
 *  t1[TERMINATED] is interrupted now.
 */

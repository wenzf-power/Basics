package main.java.Thread.ThreadDemo;

/**
 * @Author: wenzf
 * @Date 2021-12-1
 * @Description: sleep()的运用
 * wait() 会释放对象的同步锁，而 sleep() 则不会释放锁
 * 主线程main中启动了两个线程t1和t2。t1和t2在run()会引用同一个对象的同步锁，即synchronized(obj)。
 * 在t1运行过程中，虽然它会调用Thread.sleep(1000) 进入休眠状态；但是，t2是不会获取CPU执行权的。因为，t1并没有释放“obj所持有的同步锁”！
 */
public class ThreadDemo12 {
    private static Object object = new Object();
    public static void main(String[] args) {
        Thread t1 = new DemoTest("t1");
        Thread t2 = new DemoTest("t2");
        t1.start();
        t2.start();
    }

    static class DemoTest extends Thread {
        public DemoTest(String name) {
            super(name);
        }

        @Override
        public void run() {
            synchronized (object) {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println(Thread.currentThread().getName() + "--" + i);
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
/**
 * 运行结果示例
 * t1--0
 * t1--1
 * t1--2
 * t1--3
 * t1--4
 * t2--0
 * t2--1
 * t2--2
 * t2--3
 * t2--4
 */

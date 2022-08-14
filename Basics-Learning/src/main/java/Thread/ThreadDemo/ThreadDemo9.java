package main.java.Thread.ThreadDemo;

/**
 * @Author: wenzf
 * @Date 2021-12-1
 * @Description:同步锁synchronized的运用
 *
 * (2)当一个线程访问“某对象”的“synchronized方法”或者“synchronized代码块”时，其他线程仍然可以访问“该对象”的非同步代码块。
 */
public class ThreadDemo9 {
    public static void main(String[] args) {
        ThreadDemo9 demo9 = new ThreadDemo9();
        new Thread(()->{
            demo9.synCount();
        }).start();//lambda方式启动线程
        new Thread(()->{
            demo9.notSynCount();
        }).start();
    }

        // 同步代码块的方法
        public void synCount() {
            synchronized (this) {
                try {
                    for(int i = 0;i <5;i++) {
                        Thread.sleep(1000);// 休眠1秒
                        System.out.println(Thread.currentThread().getName() + " syn count method " + i);
                    }
                }catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
        // 非同步的方法
        public void  notSynCount() {
            try {
                for(int i = 0;i <5;i++) {
                    Thread.sleep(1000);// 休眠1秒
                    System.out.println(Thread.currentThread().getName() + " not syn count method " + i);
                }
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
}
/**
 * 运行结果示例：
 *Thread-0 syn count method 0
 * Thread-1 not syn count method 0
 * Thread-0 syn count method 1
 * Thread-1 not syn count method 1
 * Thread-0 syn count method 2
 * Thread-1 not syn count method 2
 * Thread-0 syn count method 3
 * Thread-1 not syn count method 3
 * Thread-0 syn count method 4
 * Thread-1 not syn count method 4
 */
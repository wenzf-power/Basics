package main.java.Thread.ThreadDemo;

/**
 * @Author: wenzf
 * @Date 2021-8-4
 * @Description: 继承Thread的线程实现方式
 */
public class ThreadDemo1 extends Thread {
    private  int j = 10;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(this.getName()+",i="+j--);
        }
    }
    public static void main(String[] args) {
        Thread  t = new ThreadDemo1();
        t.start();
    }
}
/**
 * 运行结果示例：
 * Thread-0,i=10
 * Thread-0,i=9
 * Thread-0,i=8
 * Thread-0,i=7
 * Thread-0,i=6
 * Thread-0,i=5
 * Thread-0,i=4
 * Thread-0,i=3
 * Thread-0,i=2
 * Thread-0,i=1
 */

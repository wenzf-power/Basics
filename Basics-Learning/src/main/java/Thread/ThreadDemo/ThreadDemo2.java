package main.java.Thread.ThreadDemo;

/**
 * @Author: wenzf
 * @Date 2021-8-4
 * @Description:实现Runable方式的线程实现方式
 */
public class ThreadDemo2 implements Runnable {
    static  int j=10;
    @Override
    public synchronized void run() {
        for (int i = 0; i <10; i++) {
            System.out.println(j--);
        }
    }

    public static void main(String[] args) {
        ThreadDemo2 thread2 = new ThreadDemo2();
        Thread t = new Thread(thread2);
        t.start();
    }
}
/**
 * 运行结果示例：
 * 10
 * 9
 * 8
 * 7
 * 6
 * 5
 * 4
 * 3
 * 2
 * 1
 */

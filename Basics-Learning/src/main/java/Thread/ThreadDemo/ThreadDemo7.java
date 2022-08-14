package main.java.Thread.ThreadDemo;

/**
 * @Author: wenzf
 * @Date 2021-12-1
 * @Description: 线程不安全的示例
 * 主内存中的变量是共享的，所有线程都可以访问读写，而线程工作内存又是线程私有的，线程间不可互相访问。那在多线程场景下，线程 1 和线程 2两线程
 * 同时来操做共享内存里的同一个变量，那么主内存内的此变量数据就会被破坏。也就是说主内存内的此变量不是线程安全的。
 */
public class ThreadDemo7 {
    public static void main(String[] args) {
            new ThreadDemo().test();
    }
}
class ThreadDemo{
    private  int x = 0 ;

    public void count() {
        x++;
    }
    public void test() {
        //线程1
        new Thread(()->{
            for (int i = 0; i <1000000 ; i++) {
                count();
            }
            System.out.println(Thread.currentThread().getName()+":"+x);
        }).start();
        //线程2
        new Thread(()->{
            for (int i = 0; i <1000000 ; i++) {
               count();
            }
            System.out.println(Thread.currentThread().getName()+":"+x);
        }).start();
    }

}
 /**
  * 运行结果示例：
  * Thread-0:1019109
  * Thread-1:1904353
  *
  * 理论上，两个线程执行完成后，应该有一个线程会输出 x = 2000000，但是从结果上看，和预期的结果不同，
  * 出现这样的结果的原因：在多线程环境下，我们主内存的 x 变量的数据被破坏了。
  */


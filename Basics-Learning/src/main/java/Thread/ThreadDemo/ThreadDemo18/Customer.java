package main.java.Thread.ThreadDemo.ThreadDemo18;

/**
 * @Author: wenzf
 * @Date 2021-12-1
 * @Description: 消费者类
 */
public class Customer {
    private Bread bread;

    public Customer(Bread bread) {
        this.bread = bread;
    }
    public void consume(final int val) {
        new Thread(()->{
            bread.consume(val);
        }).start();
    }
}

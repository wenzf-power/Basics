package main.java.Thread.ThreadDemo.ThreadDemo18;

/**
 * @Author: wenzf
 * @Date 2021-12-1
 * @Description: 生产者类
 */
public class Producer {
    Bread bread;
    public Producer(Bread bread) {
        this.bread = bread;
    }
    public void produce(final int val) {
        new Thread(() -> {
            bread.produce(val);
        }).start();;
    }
}

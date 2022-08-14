package main.java.Thread.ThreadDemo.ThreadDemo18;

/**
 * @Author: wenzf
 * @Date 2021-12-1
 * @Description:
 * ①、Producer是“生产者”类，它与“面包(bread)”关联。
 * 当调用“生产者”的produce()方法时，它会新建一个线程并向“面包类”中生产产品。
 * ②、Customer是“消费者”类，它与“面包(bread)”关联。
 * 当调用“消费者”的consume()方法时，它会新建一个线程并消费“面包类”中的产品。
 * ③、Bread是面包类，记录“面包的产量(capacity)”以及面包当前实际数目(size)”。
 * 面包类的生产方法produce()和消费方法consume()方法都是synchronized方法，进入synchronized方法体，意味着这个线程获取到了该“面包”对象的同步锁。
 * 这也就是说，同一时间，生产者和消费者线程只能有一个能运行。通过同步锁，实现了对“残酷”的互斥访问。
 * 对于生产方法 produce() 而言：当面包量满时，生产者线程等待，需要等待消费者消费产品之后，生产线程才能生产；
 * 生产者线程生产完面包之后，会通过 notifyAll() 唤醒同步锁上的所有线程，包括“消费者线程”，即我们所说的“通知消费者进行消费”。
 * 对于消费方法consume()而言：当仓库为空时，消费者线程等待，需要等待生产者生产产品之后，消费者线程才能消费；
 * 消费者线程消费完产品之后，会通过 notifyAll() 唤醒同步锁上的所有线程，包括“生产者线程”，即我们所说的“通知生产者进行生产”。
 */
public class TestDemo {
    public static void main(String[] args) {
        Bread bread = new Bread(100);
        Producer producer = new Producer(bread);
        Customer customer = new Customer(bread);
        producer.produce(60);
        producer.produce(120);
        customer.consume(90);
        customer.consume(150);
        producer.produce(110);
    }
}

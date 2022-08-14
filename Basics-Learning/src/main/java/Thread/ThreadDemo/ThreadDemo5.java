package main.java.Thread.ThreadDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: wenzf
 * @Date 2021-11-24
 * @Description: 通过Callable接口实现多线程
 *
 * 使用Callable接口实现多线程的步骤
 *
 * （1）第一步：创建Callable子类的实例化对象
 *
 * （2）第二步：创建FutureTask对象，并将Callable对象传入FutureTask的构造方法中
 *
 * （注意：FutureTask实现了Runnable接口和Future接口）
 *
 *  (3)第三步：实例化Thread对象，并在构造方法中传入FurureTask对象
 *
 *  (4)第四步：启动线程
 */
public class ThreadDemo5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(new ThreadCall());
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }

    static class ThreadCall implements Callable<String> {

        @Override
        public String call() throws Exception {
            return "Hello world";
        }
    }
}

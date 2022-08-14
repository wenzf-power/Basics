package main.java.Thread.ThreadPoolDemo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author: wenzf
 * @Date 2021-8-5
 * @Description:线程池的使用
 */
public class ThreadPool2 {
    public static void main(String[] args) {
        //创建一个定长线程池，支持定时及周期性任务执行
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        for (int i = 0; i < 100; i++) {
            final int j = i;
            scheduledThreadPool.schedule(new Runnable() {
                @Override
                public void run() {
                    try {
//                        Thread.sleep(1000);
                        System.out.println(j);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }, 3, TimeUnit.SECONDS);
        }
    }
}

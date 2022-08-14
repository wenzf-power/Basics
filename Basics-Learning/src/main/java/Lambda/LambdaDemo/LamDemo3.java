package main.java.Lambda.LambdaDemo;
//Lambda表达式创建线程
public class LamDemo3 {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                System.out.println(2+":"+i);
            }
        });
        t.start();
    }
}
/**
 * 运行结果示例：
 *  2:0
 *  2:1
 *  2:2
 *  2:3
 *  2:4
 *  2:5
 *  2:6
 *  2:7
 *  2:8
 *  2:9
 */

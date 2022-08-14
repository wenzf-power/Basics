package main.java.Other;

import java.util.Random;

/**
 * @Author: wenzf
 * @Date 2021-10-27
 * @Description: 生成随机数的运用
 */
public class RandomDemo {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("随机输出某个范围内的整数:");
        for (int i = 0; i <5 ; i++) {
            System.out.println(random.nextInt(10));//[0,10)
        }

        System.out.println("随机出现布尔值:");
        for (int i = 0; i <5 ; i++) {
            System.out.println(random.nextBoolean());
        }

        //Math.random()生成随机整数;Math.random()随机生成从0.0（含）到1.0
        System.out.println("Math.random()生成随机整数:");
        for (int i = 0; i <5 ; i++) {
            System.out.println((int)(Math.random()*10));
        }

        //Random.ints(int origin, int bound)或Random.ints(int min, int max)生成一个从原点（包含）到bound（不包含）的随机整数
        System.out.println("Java 8 Random.int生成随机数：");
        for (int i = 0; i <5; i++) {
            System.out.println(random.ints(10, 20).findFirst().getAsInt());
        }
    }
}
/**
 * 运行结果示例：
 * 随机输出某个范围内的整数:
 * 6
 * 0
 * 3
 * 5
 * 1
 * 随机出现布尔值:
 * true
 * true
 * false
 * true
 * false
 * Math.random()生成随机整数:
 * 8
 * 5
 * 3
 * 2
 * 9
 * Java 8 Random.int生成随机数：
 * 12
 * 16
 * 13
 * 12
 * 13
 */



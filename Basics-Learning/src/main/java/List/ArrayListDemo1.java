package main.java.List;

import java.util.ArrayList;

/**
 * ArrayList的流处理
 */
//Stream()流遍历集合
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(10);
        list.stream().forEach(integer -> {
            System.out.println("integer = " + integer);
        });
    }
}
/**
 * 运行结果示例：
 * integer = 8
 * integer = 10
 */

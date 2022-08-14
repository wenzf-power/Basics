package main.java.Lambda.LambdaDemo;

import java.util.ArrayList;
import java.util.Collections;

//集合内元素排序
public class LamDemo5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 2, 3, 5, 1, 0, 6);
        list.sort((i, j) -> i - j);
        System.out.println(list);
    }
}
/**
 * 运行结果示例：
 * [0, 1, 2, 3, 5, 6]
 */

package main.java.DataStructure;

import java.util.Arrays;

/**
 * @Author: wenzf
 * @Date 2021-12-3
 * @Description: 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {2, 1, 6, 8, 4, 3, 5, 7, 9, 0};
        System.out.println("冒泡排序前："+Arrays.toString(a));
        for (int i = 0; i < 10; i++) {
            int temp;
            for (int j = 9; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        System.out.println("冒泡排序后："+Arrays.toString(a));
    }
}
/**
 * 运行结果示例：
 * 冒泡排序前：[2, 1, 6, 8, 4, 3, 5, 7, 9, 0]
 * 冒泡排序后：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */

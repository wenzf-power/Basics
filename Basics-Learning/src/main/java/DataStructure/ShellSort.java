package main.java.DataStructure;

import java.util.Arrays;

/**
 * @Author: wenzf
 * @Date 2021-12-3
 * @Description: 希尔排序(缩小增量排序）
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] a = {2, 1, 6, 8, 4, 3, 5, 7, 9, 0};
        System.out.println("希尔排序前："+Arrays.toString(a));
        int i,j,dk;
        int temp;
        for (dk = 10 / 2; dk >= 1; dk = dk / 2) {//增量变化
            for (i = dk ; i < 10; i++) {
                if (a[i] < a[i - dk]) {
                    temp = a[i];
                    for (j = i - dk; j >= 0 && temp < a[j]; j -= dk) {
                        a[j + dk] = a[j];
                    }
                    a[j+dk]=temp;//插入
                }
            }
        }
        System.out.println("希尔排序后："+Arrays.toString(a));
    }
}
/**
 * 运行结果示例：
 * 希尔排序前：[2, 1, 6, 8, 4, 3, 5, 7, 9, 0]
 * 希尔排序后：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */

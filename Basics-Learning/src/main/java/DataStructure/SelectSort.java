package main.java.DataStructure;

import java.util.Arrays;

/**
 * @Author: wenzf
 * @Date 2021-12-6
 * @Description: 简单选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] a = {2, 1, 6, 8, 4, 3, 5, 7, 9, 0};
        System.out.println("简单选择排序前"+Arrays.toString(a));
        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j <10 ; j++) {
                int min = i;// 用min记录最小位置
                if (a[j] < a[min]) {
                    min = j;//更新最小位置
                    if (min != i) {
                        int temp = a[i];
                        a[i] = a[min];
                        a[j] = temp;
                    }
                }
            }
        }
        System.out.println("简单选择排序后"+Arrays.toString(a));
    }
}
/** 运行结果示例
 * 简单选择排序前[2, 1, 6, 8, 4, 3, 5, 7, 9, 0]
 * 简单选择排序后[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */

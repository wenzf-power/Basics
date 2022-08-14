package main.java.DataStructure;

import java.util.Arrays;

/**
 * @Author: wenzf
 * @Date 2021-12-2
 * @Description: 直接插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a = {2, 1, 6, 8, 4, 3, 5, 7, 9, 0};
        System.out.println("直接插入排序前"+Arrays.toString(a));
        int temp;
        for (int i = 1; i <10 ; i++) {//依次将a[1]-a[9]插入到前面已排序的序列中
            if (a[i] < a[i - 1]) {
                temp = a[i];//复制为哨兵
                for (int j = i-1; temp < a[j]; j--) {//从后往前寻找待插入位置
                    a[j + 1] = a[j];
                    a[j] = temp;//复制到插入位置
                    if (j == 0) {//退出循环
                        break;
                    }
                }
            }
        }
        System.out.println("直接插入排序后"+Arrays.toString(a));
    }
}
/**
 * 运行结果示例：
 * 直接插入排序前[2, 1, 6, 8, 4, 3, 5, 7, 9, 0]
 * 直接插入排序后[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */

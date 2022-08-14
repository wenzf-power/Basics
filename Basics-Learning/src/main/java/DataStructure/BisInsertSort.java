package main.java.DataStructure;

import java.util.Arrays;

/**
 * @Author: wenzf
 * @Date 2021-12-3
 * @Description: 二分插入排序
 */
public class BisInsertSort {
    public static void main(String[] args) {
        int[] a = {2, 1, 6, 8, 4, 3, 5, 7, 9, 0};
        System.out.println("二分插入排序前："+Arrays.toString(a));
        int low,mid,high;
        int temp;
        for (int i = 1; i <10 ; i++) {
            temp = a[i];
            low=0;high=i-1;//设置折半查找范围
            while (low <= high) {//默认递增有序
                mid = (low+high)/2;
                if (a[mid] > temp) {
                    high = mid -1;//查找左半字表
                }else{
                    low = mid + 1;//查找右半字表
                }
            }
            for (int j = i-1; j >=high+1 ; j--) {
                a[j + 1] = a[j];//后移元素，空出待插入位置
            }
            a[high+1]= temp;//插入
        }
        System.out.println("二分插入排序后："+Arrays.toString(a));
    }
}
/**
 * 运行结果示例：
 * 二分插入排序前：[2, 1, 6, 8, 4, 3, 5, 7, 9, 0]
 * 二分插入排序后：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */

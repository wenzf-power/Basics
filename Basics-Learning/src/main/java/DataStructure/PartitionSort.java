package main.java.DataStructure;

import java.util.Arrays;

/**
 * @Author: wenzf
 * @Date 2021-12-3
 * @Description:快速排序（分区快速排序）
 */
public class PartitionSort {
    public static void main(String[] args) {
        int[] a = {2, 1, 6, 8, 4, 3, 5, 7, 9, 0};
        System.out.println("快速排序前："+Arrays.toString(a));
        QuickSort(a, 0, 9);
        System.out.println("快速排序后：" + Arrays.toString(a));
    }
    static int Partition(int[] a, int low, int high) {
        int pivot =a[low];//枢轴  将当前第一个元素设为枢轴，对其进行划分；
        while (low < high) {
            while (low < high && a[high] >=pivot) {
                high--;
            }
            a[low] = a[high];//将比枢轴小的元素移动到左端
            while (low < high && a[low] <=pivot) {
                low++;
            }
            a[high] = a[low];//将比枢轴大的元素移动到左端
        }
        a[low] = pivot;
        return low ;
    }
     static int[] QuickSort(int[] a, int low, int high) {
         if (low < high) {
                 int pos = Partition(a, low, high);
                 QuickSort(a, low, pos - 1);
                 QuickSort(a,pos+1,high);
         }
         return a;
    }
}
/**
 * 运行结果示例：
 * 快速排序前：[2, 1, 6, 8, 4, 3, 5, 7, 9, 0]
 * 快速排序后：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */

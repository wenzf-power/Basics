package main.java.DataStructure;

import java.util.Arrays;

/**
 * @Author: wenzf
 * @Date 2021-12-6
 * @Description: 堆排序
 */
public class HeapSort {
    public static void main(String[] args) {
        int [] a = {2, 1, 6, 8, 4, 3, 5, 7, 9, 0};
        System.out.println("堆排序前："+Arrays.toString(a));
        BuildMaxHeap(a, 10);//初始建堆
        for (int i = a.length-1; i >=0; i--) {
            //堆顶元素和堆底元素交换
            int temp = a[i];
            a[i] = a[0];
            a[0] = temp;
            HeadAdjust(a, 0, i - 1);//剩下的i-1个元素整理成堆
        }
        System.out.println("堆排序后："+Arrays.toString(a));
    }
    //建立大根堆算法
   static void BuildMaxHeap(int []a, int len) {
        for (int i = len/2; i >=0 ; i--) { //从i=n/2~0反复调整堆
            HeadAdjust(a, i, len);
        }
    }
    //将元素K为根的子树进行调整
    static void HeadAdjust(int[] a, int k, int len) {
        int temp = a[k];//暂存
        for (int i = 2 * k; i <len; i *= 2) {
                    if (a[i] < a[i + 1]) {
                        i++;//取key较大的子结点的下标
                    }
                    if (temp >= a[i]) {
                        break;//筛选结束
                    } else {
                        a[k] = a[i];//将a[i]调整到双亲节点上
                        k = i;//修改K值，以便继续向下筛选
                    }
        }
        a[k] = temp;//被筛选的结点值放入最终位置
    }
}
/**
 * 堆排序前：[2, 1, 6, 8, 4, 3, 5, 7, 9, 0]
 * 堆排序后：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */

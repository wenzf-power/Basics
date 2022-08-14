package main.java.DataStructure;

import java.util.Arrays;

/**
 * @Author: wenzf
 * @Date 2021-12-6
 * @Description:归并排序
 */
public class MergeSort {
    static int count=1;//记录排序次数
    public static void main(String[] args) {
        // //将表A的两段A[low,mid]和A[mid+1,high]各自有序，将它们合成一个有序表
        int[] a = {2, 1, 6, 8, 4, 3, 5, 7, 9, 0};
        System.out.println("归并排序前："+Arrays.toString(a));
        System.out.println("************************中间过程开始*********************************");
        Sort(a,0,a.length-1);
        System.out.println("************************中间过程结束*********************************");
        System.out.println("归并排序后："+Arrays.toString(a));
    }
    static void Merge(int[] a, int low, int mid, int high) {
        int i=low,j=mid+1,k;
        int[] b =new int[a.length] ;//辅助数组
        for (int m = low; m <=high; m++) {
            b[m] = a[m];//将a中所有元素复制到b中
        }
        System.out.println("mid值："+mid+" 此时辅助数组b：" + Arrays.toString(b));
        for(k=i;i <= mid && j <=high;k++) {
            if (b[i] <= b[j]) {//比较b的左右两端中的元素
                a[k] = b[i++];
            } else {
                a[k] = b[j++];
            }
        }
        while (i <= mid) {
            a[k++] = b[i++];
        }
        while (j <=high) {
            a[k++] = b[j++];
        }
        System.out.println("第"+ count++ +"趟排序后" + Arrays.toString(a));
    }
    static int[] Sort(int[] a, int low, int high) {
        if (low < high) {
            int mid = (low + high)/2;
            Sort(a, low, mid);//对左侧序列进行递归排序;
            Sort(a, mid + 1, high);//对右侧序列进行递归排序
            Merge(a,low,mid,high);//归并
        }
        return a;
    }
}
/**
 * 运行结果示例：
 * 归并排序前：[2, 1, 6, 8, 4, 3, 5, 7, 9, 0]
 * ************************中间过程开始*********************************
 * mid值：0 此时辅助数组b：[2, 1, 0, 0, 0, 0, 0, 0, 0, 0]
 * 第1趟排序后[1, 2, 6, 8, 4, 3, 5, 7, 9, 0]
 * mid值：1 此时辅助数组b：[1, 2, 6, 0, 0, 0, 0, 0, 0, 0]
 * 第2趟排序后[1, 2, 6, 8, 4, 3, 5, 7, 9, 0]
 * mid值：3 此时辅助数组b：[0, 0, 0, 8, 4, 0, 0, 0, 0, 0]
 * 第3趟排序后[1, 2, 6, 4, 8, 3, 5, 7, 9, 0]
 * mid值：2 此时辅助数组b：[1, 2, 6, 4, 8, 0, 0, 0, 0, 0]
 * 第4趟排序后[1, 2, 4, 6, 8, 3, 5, 7, 9, 0]
 * mid值：5 此时辅助数组b：[0, 0, 0, 0, 0, 3, 5, 0, 0, 0]
 * 第5趟排序后[1, 2, 4, 6, 8, 3, 5, 7, 9, 0]
 * mid值：6 此时辅助数组b：[0, 0, 0, 0, 0, 3, 5, 7, 0, 0]
 * 第6趟排序后[1, 2, 4, 6, 8, 3, 5, 7, 9, 0]
 * mid值：8 此时辅助数组b：[0, 0, 0, 0, 0, 0, 0, 0, 9, 0]
 * 第7趟排序后[1, 2, 4, 6, 8, 3, 5, 7, 0, 9]
 * mid值：7 此时辅助数组b：[0, 0, 0, 0, 0, 3, 5, 7, 0, 9]
 * 第8趟排序后[1, 2, 4, 6, 8, 0, 3, 5, 7, 9]
 * mid值：4 此时辅助数组b：[1, 2, 4, 6, 8, 0, 3, 5, 7, 9]
 * 第9趟排序后[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 * ************************中间过程结束*********************************
 * 归并排序后：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */

package main.java.List;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wenzf
 * @Date 2022-3-31
 * @Description: ArrayList set() 方法和subList() 方法运用示例
 *set() 方法的语法为：arraylist.set(int index, E element)
 *注：arraylist 是 ArrayList 类的一个对象。
 * 参数说明：
 *     index - 索引位置
 *     element - 将在 index 位置替换进去的新元素
 * 返回值
 * 返回之前在 index 位置的元素 。
 * 如果 index 值超出范围，则抛出 IndexOutOfBoundsException 异常。
 *
 *
 * subList() 方法的语法为：  arraylist.subList(int fromIndex, int toIndex)
 * 注：arraylist 是 ArrayList 类的一个对象。
 * 参数说明：
 *     fromIndex - 截取元素的起始位置，包含该索引位置元素
 *     toIndex - 截取元素的结束位置，不包含该索引位置元素
 * 返回值:
 * 返回给定的动态数组截取的部分。
 * 如果fromIndex 小于 0 或大于数组的长度，则抛出 IndexOutOfBoundsException 的异常
 * 如果 fromIndex 大于 toIndex 的值则抛出 IllegalArgumentException 异常。
 * 注意：该动态数组包含的元素起始于 fromIndex 位置，直到元素索引位置为 toIndex-1，而索引位置 toIndex 的元素并不包括。
 */
public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("GGG");
        list.add("BBB");
        list.add("www");
        System.out.println("列表: " + list);
        //替换指定索引处的元素
        String s = list.set(2, "Hello");
        System.out.println("替换后的列表: "+list);
        System.out.println("被替换的元素："+s);
        //截取指定索引范围的元素
        List<String> subList = list.subList(0, 2);
        System.out.println("截取的部分后的列表"+subList);
    }
}

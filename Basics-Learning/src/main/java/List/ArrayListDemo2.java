package main.java.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: wenzf
 * @Date 2021-8-6
 * @Description:ArrayList的简单运用
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        /**
         *   List集合拼接成以逗号分隔的字符串
         */
        List<String> list = Arrays.asList("a", "b", "c");
        System.out.println(list);
        //方法1 stream流
        String s = list.stream().collect(Collectors.joining(","));
        System.out.println(s);
        //方法2  String自带
        String s1 = String.join(",", list);
        System.out.println(s1);

        /**
         * 比较两个字符串，忽略大小写
         */
        String a = "ABc";
        String b = "abc";
        if (a.equalsIgnoreCase(b)) {
            System.out.println("相等");
        }

        /**
         * 两个list集合取交集
         */
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("d");
        list1.retainAll(list2);
        System.out.println(list1);
    }
}
/**
 * 运行结果示例：
 * [a, b, c]
 * a,b,c
 * a,b,c
 * 相等
 * [a, b]
 */

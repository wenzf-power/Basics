package main.java.List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: wenzf
 * @Date 2021-12-28
 * @Description:list截取
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        //list截取
        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println("list:"+list);
        List sublist = Arrays.asList("three Four".split(" "));
        System.out.println("子列表："+sublist);
        System.out.println("indexOfSubList:"+ Collections.indexOfSubList(list,sublist));
        System.out.println("lastIndexOfSubList:"+Collections.lastIndexOfSubList(list,sublist));

    }
}
/***
 * 运行结果示例：
 * list:[one, Two, three, Four, five, six, one, three, Four]
 * 子列表：[three, Four]
 * indexOfSubList:2
 * lastIndexOfSubList:7
 */

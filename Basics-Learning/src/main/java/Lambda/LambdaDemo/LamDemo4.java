package main.java.Lambda.LambdaDemo;

import java.util.ArrayList;
import java.util.Collections;

//Lambda表达式遍历集合和删除集合中的某个元素
public class LamDemo4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5);
        list.forEach(System.out::println);
        list.forEach(element->{
            if(element %2 == 0){
                System.out.println(element);
            }
        });
        //删除
//        list.remove(1);
        boolean b = list.removeIf(ele -> ele == 1);
        System.out.println(b);
        list.forEach(System.out::println);
    }
}
/**
 * 运行结果示例：
 * 1
 * 2
 * 3
 * 4
 * 5
 * 2
 * 4
 * true
 * 2
 * 3
 * 4
 * 5
 */
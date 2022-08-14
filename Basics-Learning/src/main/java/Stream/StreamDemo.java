package main.java.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream的简单运用
 */
public class StreamDemo {
    public static void main(String[] args) {
        //创建Stream三种创建方式
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        //1.集合Collection.stream()
        Stream<Integer> stream = list.stream();
        System.out.println(stream);

        //2.静态方法Stream.of
        Stream<String> stream1 = Stream.of("a", "b", "c");
        System.out.println(stream1);

        //3.数组Arrays.stream
        String[] arr = {"a", "c", "d"};
        Stream<String> stream2 = Arrays.stream(arr);
        System.out.println(stream2);

        //collect(Collector) 将流转化为其他形式
        List<Integer> integerList = list.stream().collect(Collectors.toList());
        System.out.println(integerList);
    }
}
/**
 * 运行结果示例：
 * java.util.stream.ReferencePipeline$Head@74a14482
 * java.util.stream.ReferencePipeline$Head@1540e19d
 * java.util.stream.ReferencePipeline$Head@677327b6
 * [1, 2, 3, 4, 5]
 */

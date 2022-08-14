package main.java.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream的简单运用1
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        List<Data> list  = Arrays.asList(
                new Data("wzf","男",21,"23456789"),
                new Data("abc","男",23,"23456788"),
                new Data("asd","女",22,"23456787"),
                new Data("awe","女",24,"23456786"),
                new Data("cvb","男",27,"23456785")
        );

        //返回流中最大值
        Optional<Data> max = list.stream().max(Comparator.comparing(Data::getAge));
        System.out.println(max);
        if (max.isPresent()) {
            Data data = max.get();
            System.out.println(data);
        }

        //返回流中最小值
        Optional<Data> min = list.stream().min(Comparator.comparing(Data::getAge));
        System.out.println(min);
        if (min.isPresent()) {
            Data data = min.get();
            System.out.println(data);
        }

        //返回流中元素综合元素个数
        long count = list.stream().count();
        System.out.println(count);

        //返回流中任意元素，此时一般返回第一个元素，因为找到了元素，即返回
        Optional<Data> any = list.stream().findAny();
        if (any.isPresent()) {
            Data data = any.get();
            System.out.println(data);
        }
        //加了parallel()方法，此时流为并行流，是无序的，返回结果任意的
        Optional<Data> any1 = list.stream().parallel().findAny();
        System.out.println(any1);

        //返回流中第一个元素
        Optional<Data> first = list.stream().findFirst();
        if (first.isPresent()) {
            Data data = first.get();
            System.out.println(data);
        }

        //匹配
        System.out.println(list.stream().allMatch(e -> e.getAge() < 20));//都符合
        System.out.println(list.stream().anyMatch(e -> e.getAge() < 22));//任一元素符合
        System.out.println(list.stream().noneMatch(e -> e.getAge() < 20));//都不符合

        //筛选出性别都是男的
        list.stream().filter(e->e.getSex().equals("男")).forEach(System.out::println);

       //筛选出年龄大于22岁的人，并放至list
        List<Data> collect = list.stream().filter(e -> e.getAge() > 22).collect(Collectors.toList());
        System.out.println(collect);

        //map(Function f) 接收流中元素，并且将其映射成为新元素
        List<String> collect1 = list.stream().map(e -> e.getEmail() + "120").collect(Collectors.toList());
        System.out.println(collect1);

        //flatMap(Function f) 将所有流中的元素并到一起连接成一个流
        List<Data> list1  = Arrays.asList(
                new Data("wzw","男",21,"234567891"),
                new Data("abd","男",23,"234567881"),
                new Data("asa","女",22,"234567871"),
                new Data("awq","女",24,"234567861"),
                new Data("cvc","男",28,"234567851")
        );
        List<Data> collect2 = Stream.of(list, list1).flatMap(e -> e.stream().filter(s -> s.getAge() > 22)).collect(Collectors.toList());
        System.out.println(collect2.size());

       // peek(Consumer c) 获取流中元素，操作流中元素，与foreach不同的是不会截断流，可继续操作流
        List<Data> collect3 = list.stream().peek(e -> e.setName(e.getName() + "^_^")).collect(Collectors.toList());
        System.out.println(collect3);
        //distinct() 通过流所生成元素的equals和hashCode去重
        //
        //limit(long val) 截断流，取流中前val个元素
        //
        //sorted(Comparator) 产生一个新流，按照比较器规则排序
        //
        //sorted() 产生一个新流，按照自然顺序排序
        List<String> list3 = Arrays.asList("b", "b", "c", "a");
        List<String> collect4 = list3.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(collect4);

        List<String> collect5 = list3.stream().distinct().sorted().limit(2).collect(Collectors.toList());
        System.out.println(collect5);
    }
}
/**
 * 运行结果示例：
 *
 * Optional[Data{name='cvb', sex='男', age=27, email='23456785'}]
 * Data{name='cvb', sex='男', age=27, email='23456785'}
 * Optional[Data{name='wzf', sex='男', age=21, email='23456789'}]
 * Data{name='wzf', sex='男', age=21, email='23456789'}
 * 5
 * Data{name='wzf', sex='男', age=21, email='23456789'}
 * Optional[Data{name='asd', sex='女', age=22, email='23456787'}]
 * Data{name='wzf', sex='男', age=21, email='23456789'}
 * false
 * true
 * true
 * Data{name='wzf', sex='男', age=21, email='23456789'}
 * Data{name='abc', sex='男', age=23, email='23456788'}
 * Data{name='cvb', sex='男', age=27, email='23456785'}
 * [Data{name='abc', sex='男', age=23, email='23456788'}, Data{name='awe', sex='女', age=24, email='23456786'}, Data{name='cvb', sex='男', age=27, email='23456785'}]
 * [23456789120, 23456788120, 23456787120, 23456786120, 23456785120]
 * 6
 * [Data{name='wzf^_^', sex='男', age=21, email='23456789'}, Data{name='abc^_^', sex='男', age=23, email='23456788'}, Data{name='asd^_^', sex='女', age=22, email='23456787'}, Data{name='awe^_^', sex='女', age=24, email='23456786'}, Data{name='cvb^_^', sex='男', age=27, email='23456785'}]
 * [a, b, c]
 * [a, b]
 */

package main.java.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: wenzf
 * @Date 2021-11-19
 * @Description: HashMap 的五种遍历方式
 *1.使用 Iterator 遍历 HashMap EntrySet
 *2.使用 Iterator 遍历 HashMap KeySet
 *3.使用 For-each 循环迭代 HashMap
 *4.使用 Lambda 表达式遍历 HashMap
 *5.使用 Stream API 遍历 HashMap
 */
public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "今天要开心");
        map.put(2, "明天要开心");
        map.put(3, "后天要开心");
        map.put(4, "怎么都要开心");
         //使用 Iterator 遍历 HashMap EntrySet
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("--------------------------------------------------");
        //使用 Iterator 遍历 HashMap KeySet
        Iterator<Integer> iterator1 = map.keySet().iterator();
        while (iterator1.hasNext()) {
            Integer integer = iterator1.next();
            System.out.println(integer+":"+map.get(integer));
        }
        System.out.println("--------------------------------------------------");
        //for-each 循环HashMap
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("--------------------------------------------------");
        //使用Lambda表达式遍历HashMap
        map.forEach((key,value)->{
            System.out.println(key+":"+value);
                });
        System.out.println("--------------------------------------------------");
        //使用Stream API 遍历HashMap
        map.entrySet().stream().forEach(entry->{
            System.out.println(entry.getKey()+":"+entry.getValue());
                }
        );
    }
}
/**
 * 运行效果示例：
 * 1:今天要开心
 * 2:明天要开心
 * 3:后天要开心
 * 4:怎么都要开心
 * --------------------------------------------------
 */

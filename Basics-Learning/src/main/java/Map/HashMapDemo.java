package main.java.Map;

import java.util.HashMap;

/**
 * HashMap的简单使用
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        //添加
        map.put(1, "abc");
        //取值访问
        System.out.println(map.get(1));
        //删除
        map.put(2, "zxc");
        map.put(3, "asd");
        map.remove(3);
        System.out.println(map);
        //计算大小
        System.out.println(map.size());
        //获取key
        System.out.println(map.keySet());
        //所有映射项的集合视图
        System.out.println(map.entrySet());
        //获取value
        System.out.println(map.values());
        //替换
        map.replace(2,"qwe");
        System.out.println(map.entrySet());
    }
}
/**
 * 运行结果示例：
 * abc
 * {1=abc, 2=zxc}
 * 2
 * [1, 2]
 * [1=abc, 2=zxc]
 * [abc, zxc]
 * [1=abc, 2=qwe]
 */


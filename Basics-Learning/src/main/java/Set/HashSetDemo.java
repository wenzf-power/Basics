package main.java.Set;
import java.util.HashSet;
/**
 * @Author: wenzf
 * @Date 2022-4-2
 * @Description: HashSet 的使用
 * HashSet 存储元素的顺序并不是按照存入时的顺序（和 List 显然不同） 而是按照哈希值来存的所以取数据也是按照哈希值取得。元素的哈希值是通过元素的hashcode 方法来获取的,
 * HashSet 首先判断两个元素的哈希值，如果哈希值一样，接着会比较equals 方法 如果 equls 结果为 true ，HashSet 就视为同一个元素。
 * 如果 equals 为 false 就不是 同一个元素
 *
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("a");
        set.add("c");
        System.out.println("set集合："+set);
        System.out.println("是否包含a:"+set.contains("a"));
        System.out.println("删除元素b:"+set.remove("b"));
        System.out.println("遍历set内容如下：");
        set.forEach(i-> System.out.println(i));
        System.out.println("清除set内容后");
        set.clear();
        System.out.println(set);
    }
}
/**
 * 运行结果示例
 * set集合：[a, b, c]
 * 是否包含a:true
 * 删除元素b:true
 * 遍历set内容如下：
 * a
 * c
 * 清除set内容后
 * []
 */
package main.java.List;

import java.util.ArrayList;

/**
 * ArrayList的简单运用
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //增加add
        arrayList.add(12);
        arrayList.add(24);
        arrayList.add(10);
        //取值get
        System.out.println(arrayList.get(0));
        //长度size
        System.out.println(arrayList.size());
        //修改设置
        System.out.println(arrayList.set(1,48));
        System.out.println(arrayList.get(1));
        //删除
        arrayList.remove(1);
        System.out.println(arrayList);
    }
}
/**
 * 结果运行示例：
 * 12
 * 3
 * 24
 * 48
 * [12, 10]
 */

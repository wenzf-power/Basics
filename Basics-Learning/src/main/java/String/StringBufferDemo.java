package main.java.String;

/**
 * StringBuffer的简单使用
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();

        //输出StringBuffer默认的容量大小：16
        System.out.println(buffer.capacity());

        //StringBuffer的长度
        StringBuffer stringBuffer = new StringBuffer("123");
        System.out.println(stringBuffer.length());

        //StirngBuffer的添加功能
        StringBuffer buffer1 = new StringBuffer("abcd");
        System.out.println(buffer1.append("efg"));

        //StringBuffer的删除功能
        System.out.println(buffer1.delete(3,5));

        //StringBuffer的截取功能;返回值不是StringBuffer的类型
        System.out.println(buffer1.substring(2));

        //StirngBuffer的替换功能
        StringBuffer buffer2 = new StringBuffer("zxc");
        System.out.println(buffer2.replace(0,3,"abc"));

        //StringBuffer的反转功能
        StringBuffer buffer3 = new StringBuffer("abc");
        System.out.println(buffer3.reverse());
    }
}
/**
 * 运行结果示例：
 * 16
 * 3
 * abcdefg
 * abcfg
 * cfg
 * abc
 * cba
 */

package main.java.String;


/**
 * String的简单使用
 */
public class StringDemo {
    public static void main(String[] args) {
        String str= new String("abcdefg");
        //字符串长度
        System.out.println(str.length());
        //取字符串某一字符
        System.out.println(str.charAt(1));
        //提取字符串中的子串
        System.out.println(str.substring(1,3));
        //字符串比较
        String str1 = new String("abc");
        System.out.println(str.equals(str1));
        //字符串拼接
        System.out.println(str.concat("aaa"));
        //字符串大小写转换
        System.out.println(str.toUpperCase());//toUpperCase:转大写；toLowerCase:转小写
        //字符串替换
        System.out.println(str1.replace("abc","efg"));
    }
}
/**
 * 运行结果示例：
 * 7
 * b
 * bc
 * false
 * abcdefgaaa
 * ABCDEFG
 * efg
 */

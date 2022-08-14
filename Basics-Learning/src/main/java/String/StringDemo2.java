package main.java.String;

/**
 * String的简单运用
 */
public class StringDemo2 {
    public static void main(String[] args) {
        //比较两个字符串区域是否相等
        String s1 = "I feel very Happy";
        String s2= "I am not very happy";
        boolean match1= s1.regionMatches(12,s2,14,5);
        System.out.println(match1);
        boolean match2= s1.regionMatches(true,12,s2,14,5);//忽略大小写
        System.out.println(match2);
    }
}
/**
 * 运行结果示例：
 * false
 * true
 */

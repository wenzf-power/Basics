package main.java.String;

import java.io.UnsupportedEncodingException;

/**
 * @Author: wenzf
 * @Date 2021-12-13
 * @Description: 字符String API demo
 */
public class StringApis {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s0 = "ScheduleJobs String";
        //字符串长度方法：length()
        System.out.println(s0.length());
        //字符串拼接方法：concat(String str)
        System.out.println(s0.concat(" hello world!"));
        //返回字符串指定索引处的 char 值：charAt(index)
        System.out.println(s0.charAt(1));

        String s1 = "ScheduleJobs,test,test";
        //返回指定子字符串在此字符串中第一次出现处的索引。
        System.out.println(s1.indexOf("st"));
        //返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。
        System.out.println(s1.indexOf("st", 5));
        //返回指定字符在此字符串中最后一次出现处的索引。
        System.out.println(s1.lastIndexOf("st"));
        //返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索。
        System.out.println(s1.lastIndexOf("st", 9));

        String s2= "abcfgabc";
        //从指定索引位置或范围，截取一个新的字符串，它是此字符串的一个子字符串
        System.out.println(s2.substring(2));
        System.out.println(s2.substring(2, 5));
        //字符大小写转换；s2.toLowerCase()
        System.out.println(s2.toUpperCase());

        String s3 = " www eee ";
        System.out.println(s3.length());
        //返回字符串的副本，忽略前导空白和尾部空白
        String t=s3.trim();
        System.out.println(t+" "+t.length());

        String s4= "好好学习，天天向上";
        //valueOf 和toString 的区别
        System.out.println(String.valueOf(s4));
        System.out.println(s4.toString());

        String s5 = "qwe abc";
        //将此字符串转换为一个新的字符数组
        char[] chars = s5.toCharArray();
        for (char c :chars) {
            System.out.println(c);
        }

        String s6 = "abc,efg";
        //测试此字符串是否以指定的前缀或后缀开始
        System.out.println(s6.endsWith("a"));
        System.out.println(s6.startsWith("ab"));
        System.out.println(s6.startsWith("bc", 1));

        String s7 = "aa.bb.cc";
        //当分割符是 . 或者是 | 时，必须使用 \\ 进行转义
        String[] split = s7.split("\\.");
        System.out.println(split[0]);

        String s8 = "dd ee    ff";
        String[] split1 = s8.split(" ");//以一个空格分割
        System.out.println(split1.length);
        String[] split2 = s8.split("\\s+");//以一个或多个空格分割
        System.out.println(split2.length);

        String s9 = "avb,efg,dgf";
        String[] split3 = s9.split(",");//逗号分割
        for (String s:split3) {
            System.out.println(s);
        }

        String s10 = "wwwzfg";
        //String intern()  返回字符串对象的规范化表示形式
        System.out.println(s10.intern());

        String s11 ="wzf";
        //字符串对象的比较
        System.out.println("WZF".equalsIgnoreCase(s11));
        System.out.println(s11.compareTo("abc"));
        System.out.println("Abc".equals(s11));

        String s12 ="abc";
        //字符串替换 replace(); s12.replaceAll(),s12.replaceFirst()
        System.out.println(s12.replace("abc", "wzf"));

        //boolean matches(String regex) 判断此字符串是否匹配给定的正则表达式
    }
}
/**
 * 运行结果示例：
 * 11
 * ScheduleJobs String hello world!
 * e
 * 2
 * 7
 * 12
 * 7
 * cfgabc
 * cfg
 * ABCFGABC
 * 9
 * www eee 7
 * 好好学习，天天向上
 * 好好学习，天天向上
 * q
 * w
 * e
 *
 * a
 * b
 * c
 * false
 * true
 * true
 * aa
 * 6
 * 3
 * avb
 * efg
 * dgf
 * wwwzfg
 * true
 * 22
 * false
 * wzf
 */

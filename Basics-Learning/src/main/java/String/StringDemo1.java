package main.java.String;

import java.io.File;

/**
 * String的简单使用
 */
public class StringDemo1 {
    public static void main(String[] args) {
        String s = "uploadfile/sysPicture/2107201134189c3208ee91694c60a9dd.PNG";
        //获取字符串下标，并截取后面内容
        System.out.println(s.substring(s.lastIndexOf("/") + 1));
        //获取字符串中的文件名
        File file = new File(s);
        System.out.println(file.getName());
    }
}
/**
 * 运行结果示例：
 * 2107201134189c3208ee91694c60a9dd.PNG
 * 2107201134189c3208ee91694c60a9dd.PNG
 */

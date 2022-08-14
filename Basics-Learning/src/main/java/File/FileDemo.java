package main.java.File;

import java.io.*;

/**
 * @Author: wenzf
 * @Date 2021-12-29
 * @Description:
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {

        //创建文件
        File file = new File("C:/Users/Administrator/Desktop/fileDemo.txt");
        if (file.createNewFile()) {
            System.out.println("文件创建成功！");
        }else{
            System.out.println("出错了，该文件已经存在");
        }

        //文件写入
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write("测试文件写入，文件写入成功！");
        bufferedWriter.close();
        System.out.println("文件已写入....");

        //读取文件内容
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String str;
        while ((str = reader.readLine()) != null){
            System.out.println("读取的内容："+str);
        }
        reader.close();

        //删除文件
        File file1 = new File("C:/Users/Administrator/Desktop/test.txt");//先在桌面创建test.txt;
        if (file1.delete()) {
            System.out.println(file1.getName()+" 文件已删除！");
        }else{
            System.out.println("文件删除失败");
        }

        //向文件追加内容
        File file2 = new File("C:/Users/Administrator/Desktop/fileDemo.txt");
        BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter(file2, true));
        bufferedWriter1.write("测试追加内容，追加成功！");
        bufferedWriter1.close();
        System.out.println("已追加内容....");
        BufferedReader reader1 = new BufferedReader(new FileReader(file));
        String appendStr;
        while ((appendStr = reader1.readLine()) != null) {
            System.out.println("读取追加后的内容："+appendStr);
        }
        reader1.close();

        //获取文件大小（1KB = 1024字节）
        File file3 = new File("C:/Users/Administrator/Desktop/fileDemo.txt");
        if(!file3.exists() || !file.isFile()){
            System.out.println("文件不存在");
        }else{
            System.out.println("文件大小："+file3.length());
        }

        //将文件内容复制到另一个文件
        File file4 = new File("C:/Users/Administrator/Desktop/fileDemo.txt");
        FileInputStream fileInputStream = new FileInputStream(file4);
        FileOutputStream fileOutputStream = new FileOutputStream(new File("C:/Users/Administrator/Desktop/copy.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len=fileInputStream.read(bytes))>0){
            fileOutputStream.write(bytes, 0, len);
        }
        fileInputStream.close();
        fileOutputStream.close();
        File file5 = new File("C:/Users/Administrator/Desktop/copy.txt");
        BufferedReader reader2 = new BufferedReader(new FileReader(file5));
        String copyStr;
        while ((copyStr = reader2.readLine()) != null){
            System.out.println("读取复制后文件的内容："+copyStr);
        }
        reader2.close();
    }
}
/***
 * 文件创建成功！
 * 文件已写入....
 * 读取的内容：测试文件写入，文件写入成功！
 * test.txt 文件已删除！
 * 已追加内容....
 * 读取追加后的内容：测试文件写入，文件写入成功！测试追加内容，追加成功！
 * 文件大小：78
 * 读取复制后文件的内容：测试文件写入，文件写入成功！测试追加内容，追加成功！
 */


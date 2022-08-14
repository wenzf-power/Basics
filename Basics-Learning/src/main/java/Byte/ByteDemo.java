package main.java.Byte;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

/**
 * @Author: wenzf
 * @Date 2021-10-28
 * @Description:
 * ByteArrayOutputStream类是在创建它的实例时，程序内部创建一个byte型别数组的缓冲区,缓冲区会随着数据的不断写入而自动增长。可使用 toByteArray() 和 toString() 获取数据。
 * ByteArrayOutputStream:    可以捕获内存缓冲区的数据，转换成字节数组  (从数组写)
 * ByteArrayInputStream: 可以将字节数组转化为输入流   （从数组读）
 * java.io.ByteArrayOutputStream.toByteArray() 方法创建一个与此输出流大小一样的新缓冲区
 *
 * 两个构造函数
 *  1、ByteArrayOutputStream(); 创建新的字节数组输出流，字节数组指定大小是32。
 *  2、ByteArrayOutputStream(int size); 创建新的字节数组输出流，并指定字节数组大小为 size。
 *
 *  实例方法
 *  1、write(int oneByte); 将指定的字节写入字节数组输出流
 *  2、write(byte[] buffer, int offset, int len) 是将字节数组buffer写入到输出流中，offset是从buffer中读取数据的起始偏移位置，len是读取的长度。
 *  3、writeTo(OutputStream out) 将该“字节数组输出流”的数据全部写入到“输出流out”中
 *  4、toByteArray(); 将缓冲区的数据全部获取出来，并赋值给字节数组输出流。该方法可以通过 String 的方法，使用指定的字符集，通过解码字节将缓冲区内容转换为字符串
 *  5、toString(); 将缓冲区的内容转换为字符串。该方法使用平台默认字符集，通过解码字节将缓冲区内容转换为字符串。
 *
 *  注意
 *  该类是把数据写入字节数组，字节数组在内存缓冲区，不需要关闭流。
 */
public class ByteDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int a=9,b=10;
        outputStream.write(a);
        outputStream.write(b);
        byte[] bytes = outputStream.toByteArray();
        for (int i = 0; i <bytes.length ; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("-------------------------------");
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
        while ((b=inputStream.read()) != -1) {
            System.out.println(b);
        }
        System.out.println("-------------------------------");
        try {
            // 在内存中创建了可以增长的内存数据。该类是在内存缓存中，使用完之后触发GC回收，关流无效
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\test.txt");
            int len;
            while ((len=fileInputStream.read())!=-1){
                // 把读取到的数据逐个写到内存中
                out.write(len);
            }
            // 将缓冲区的数据全部获取出来，并赋值给 array
            // 该方法可以通过 String 的方法，使用指定的字符集，通过解码字节将缓冲区内容转换为字符串
            byte[] array = out.toByteArray();
            System.out.println(new String(array, "utf-8"));

            System.out.println("-------------------------------");
            // 将缓冲区的内容转换为字符串。该方法使用平台默认字符集，通过解码字节将缓冲区内容转换为字符串。
            System.out.println(out.toString());

            fileInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
/**
 * 结果示例：
 * 9
 * 10
 * -------------------------------
 * 9
 * 10
 * -------------------------------
 * hello world
 * -------------------------------
 * hello world
 */


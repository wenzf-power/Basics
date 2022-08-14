package main.java.Optional;

import java.util.Optional;

/**
 * @Author: wenzf
 * @Date 2021-7-28
 * @Description:Optional的简单运用
 */
public class OptionalDemo {
    public static void main(String[] args) {
        //创建一个Optional对象
        Optional<String> opt1 = Optional.of("aaa");//如果传入的参数为空(即为null时)则跑出NPE异常
        //Optional<Object> opt2= Optional.of(null);//传nulls时抛NPE 异常

        Optional<String> optionalS = Optional.ofNullable("abc");
        System.out.println(optionalS);
        System.out.println(optionalS.get());

        Optional<String> optionalS1 = Optional.ofNullable(null);//// 参数为空的时候相当调用Optional.empty()
        System.out.println(optionalS1);

        //String s= Optional.of("abc").get();
        String s = opt1.get();// get 获取Option包裹的值如果值为null则抛出NoSuchElementException异常
        System.out.println(s);

        //String s1 = optionalS1.orElse("bbb");
        String s1 = opt1.orElse("ccc");// orElse 获取值如果值为空则返回orElse设置的默认值
        System.out.println(s1);

        //String s3 = Optional.of("aa").orElseGet( () -> "aaa".toUpperCase());
        String s3 = optionalS1.orElseGet(() -> "sas".toUpperCase());// orElseGet 获取值如果值为空则内部可以是一个实现Supplier接口的匿名内部类调用提供返回结果
        System.out.println(s3);

        //orElseThrow获取值如果不存在则抛出后面的异常
        Optional.empty().orElseThrow(IllegalArgumentException::new);

    }
}
/**
 * 运行结果示例：
 * Optional[abc]
 * abc
 * Optional.empty
 * aaa
 * aaa
 * SAS
 * Exception in thread "main" java.lang.IllegalArgumentException
 * 	at java.util.Optional.orElseThrow(Optional.java:290)
 * 	at Java8.Optional.OptionalDemo.main(OptionalDemo.java:34)
 */

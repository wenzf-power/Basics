package main.java.Lambda.interfaces;

/**
 * 多参数无返回
 */
@FunctionalInterface//修饰函数式接口，要求接口中的抽象方法只有一个
public interface NoReturnMultiParam {
    void method(int a, int b);
}


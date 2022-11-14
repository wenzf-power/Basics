package main.java.Other.singleton;




/**
 * @Author: wenzf
 * @Date: 2022/11/14/11:10
 * @Description: 枚举类单例模式 ： 可以防止通过反射和反序列化破坏
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data =data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}

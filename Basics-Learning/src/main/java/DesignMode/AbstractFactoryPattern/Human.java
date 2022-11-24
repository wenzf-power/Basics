package main.java.DesignMode.AbstractFactoryPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/22/17:40
 * @Description: 工厂方法模式，女娲造人的场景演示，首先简单定义什么是人类
 */
public interface Human {

    /***
    * @Description: 笑
    */
    void laugh();

    /***
    * @Description: 哭
    */
    void cry();

    /***
    * @Description: 谈话
    */
    void talk();

    /***
    * @Description: 性别
    */
    void sex();
}

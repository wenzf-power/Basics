package main.java.DesignMode.StrategyPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/18/18:31
 * @Description:
 */
public class FirstPlan implements IStrategy{
    @Override
    public void operate() {
        System.out.println("第一个妙计：找乔国老帮忙，使孙权不能杀刘备！");
    }
}

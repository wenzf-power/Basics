package main.java.DesignMode.StrategyPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/18/18:33
 * @Description:
 */
public class ThirdPlan implements IStrategy{
    @Override
    public void operate() {
        System.out.println("第三个妙计：孙夫人断后，挡住追兵！");
    }
}

package main.java.DesignMode.StrategyPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/18/18:32
 * @Description:
 */
public class SecondPlan implements IStrategy{
    @Override
    public void operate() {
        System.out.println("第二个妙计：求吴国太,放行！");
    }
}

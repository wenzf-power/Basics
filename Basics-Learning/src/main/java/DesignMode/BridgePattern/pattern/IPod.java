package main.java.DesignMode.BridgePattern.pattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/28/17:48
 * @Description:
 */
public class IPod extends Product{
    @Override
    public void producted() {
        System.out.println("生产出的iPod是这个样子的...");
    }

    @Override
    public void selled() {
        System.out.println("生产出的iPod卖出去了...");
    }
}

package main.java.DesignMode.BridgePattern.pattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/28/17:46
 * @Description:
 */
public class House extends Product{
    @Override
    public void producted() {
        System.out.println("生产出的房子是这个样子的...");
    }

    @Override
    public void selled() {
        System.out.println("生产出的房子卖出去了...");
    }
}

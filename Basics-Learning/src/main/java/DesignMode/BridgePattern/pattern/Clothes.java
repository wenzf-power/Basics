package main.java.DesignMode.BridgePattern.pattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/28/17:47
 * @Description:
 */
public class Clothes extends Product{
    @Override
    public void producted() {
        System.out.println("生产出的衣服是这个样子的...");
    }

    @Override
    public void selled() {
        System.out.println("生产出的衣服卖出去了...");
    }
}

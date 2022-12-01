package main.java.DesignMode.BridgePattern.demo;

/**
 * @Author: wenzf
 * @Date: 2022/11/28/16:55
 * @Description:
 */
public class ClothesCorp extends Corp{
    @Override
    protected void produce() {
        System.out.println("服装公司生产衣服...");
    }

    @Override
    protected void sell() {
        System.out.println("服装公司出售衣服...");
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司赚小钱...");
    }
}

package main.java.DesignMode.BridgePattern.demo;

/**
 * @Author: wenzf
 * @Date: 2022/11/28/17:14
 * @Description:
 */
public class IPodCorp extends Corp{
    @Override
    protected void produce() {
        System.out.println("我生产iPod...");
    }

    @Override
    protected void sell() {
        System.out.println("iPod畅销...");
    }

    @Override
    public void makeMoney(){
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }
}

package main.java.DesignMode.BridgePattern.pattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/28/17:58
 * @Description:
 */
public class OtherCorp extends Corp{
    /**
     * 构造函数，由子类定义传递具体的产品进来
     * @param product
     * @param:
     * @return:
     */
    public OtherCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney(){
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }
}

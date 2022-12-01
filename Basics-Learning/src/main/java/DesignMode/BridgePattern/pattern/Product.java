package main.java.DesignMode.BridgePattern.pattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/28/17:35
 * @Description:
 */
public abstract class Product {
    /**
    * 生产
    * @param: []
    * @return: void
    */
    public abstract void producted();
    /**
    * 销售
    * @param: []
    * @return: void
    */
    public abstract void selled();

}

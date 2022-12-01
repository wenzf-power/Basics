package main.java.DesignMode.BridgePattern.pattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/28/17:49
 * @Description: 桥梁模式，将两个抽象类型关联起来
 */
public abstract class Corp {
    /**
    * 定义一个产品对象，抽象的了，不知道具体是什么产品
    * @param:
    * @return:
    */
    private Product product;

    /**
    * 构造函数，由子类定义传递具体的产品进来
    * @param:
    * @return:
    */
    public Corp(Product product){
        this.product = product;
    }

    public void makeMoney(){

        //每个公司都是一样，先生产
        this.product.producted();

        //然后销售
        this.product.selled();

    }
}

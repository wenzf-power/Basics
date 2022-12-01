package main.java.DesignMode.BridgePattern.demo;

/**
 * @Author: wenzf
 * @Date: 2022/11/28/16:39
 * @Description:
 */
public abstract class Corp {

    /**
    * 生产
    * @param: []
    * @return: void
    */
    protected abstract void produce();
    /**
    * 销售
    * @param: []
    * @return: void
    */
    protected abstract void sell();


    public void makeMoney(){

        //每个公司都是一样，先生产
        this.produce();

        //然后销售
        this.sell();

    }

}

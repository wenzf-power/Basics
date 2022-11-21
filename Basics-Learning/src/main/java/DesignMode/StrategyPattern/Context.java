package main.java.DesignMode.StrategyPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/18/18:35
 * @Description: 放锦囊妙计的容器
 */
public class Context {
    private IStrategy iStrategy;

    /***
    * @Description: 构造函数初始化
    * @Param: [iStrategy]
    * @return:
    */
    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    /***
    * @Description: 使用计谋
    * @Param: []
    * @return: void
    */
    public void operate() {
        this.iStrategy.operate();
    }
}

package main.java.DesignMode.AbstractFactoryPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/23/11:28
 * @Description:
 */
public interface HumanFactory {
    /***
    * @Description: 制造黄色人种
     * @Param:
    * @return:
    */
    Human createYellowHuman();

    /***
     * @Description: 制造一个白色人种
     * @Param:
     * @return:
     */
    Human createWhiteHuman();
    /***
     * @Description: 制造一个黑色人种
     * @Param:
     * @return:
     */
    Human createBlackHuman();

}

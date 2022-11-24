package main.java.DesignMode.AbstractFactoryPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/23/11:18
 * @Description:
 */
public class BlackFemaleHuman extends AbstractBlackHuman{
    @Override
    public void sex() {
        System.out.println("此时生产的黑种人的性别为女");
    }
}

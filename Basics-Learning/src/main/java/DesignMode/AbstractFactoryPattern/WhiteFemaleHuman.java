package main.java.DesignMode.AbstractFactoryPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/23/11:15
 * @Description:
 */
public class WhiteFemaleHuman extends AbstractWhiteHuman{
    @Override
    public void sex() {
        System.out.println("此时生产的白种人的性别为女");
    }
}

package main.java.DesignMode.AbstractFactoryPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/23/11:14
 * @Description:
 */
public class YellowMaleHuman extends AbstractYellowHuman{
    @Override
    public void sex() {
        System.out.println("此时生产的黄种人的性别为男");
    }
}

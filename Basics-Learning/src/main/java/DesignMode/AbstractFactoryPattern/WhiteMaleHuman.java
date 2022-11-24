package main.java.DesignMode.AbstractFactoryPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/23/11:16
 * @Description:
 */
public class WhiteMaleHuman extends AbstractWhiteHuman{
    @Override
    public void sex() {
        System.out.println("此时生产的白种人的性别为男");
    }
}

package main.java.DesignMode.AbstractFactoryPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/23/11:33
 * @Description: 男性工厂
 */
public class MaleHumanFactory extends AbstractHumanFactory{

    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }

    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowMaleHuman);
    }
}

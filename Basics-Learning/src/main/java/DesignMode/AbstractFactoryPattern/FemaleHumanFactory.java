package main.java.DesignMode.AbstractFactoryPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/23/11:39
 * @Description: 女性工厂
 */
public class FemaleHumanFactory extends AbstractHumanFactory{


    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }

    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowFemaleHuman);
    }

}

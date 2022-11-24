package main.java.DesignMode.AbstractFactoryPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/23/11:42
 * @Description:
 */
public class TestAbstractFactoryPattern {
    public static void main(String[] args) {
        //第一条生产线，男性生产线
        HumanFactory maleHumanFactory = new MaleHumanFactory();

        //第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleHumanFactory();

        System.out.println("---------生产线建立完毕，开始生产人了---------");
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        maleYellowHuman.cry();
        maleYellowHuman.laugh();
        maleYellowHuman.sex();
        femaleYellowHuman.cry();
        femaleYellowHuman.talk();
        femaleYellowHuman.sex();

        System.out.println("----------------------------------------");
        Human maleBlackHuman = maleHumanFactory.createBlackHuman();
        maleBlackHuman.talk();
        maleBlackHuman.laugh();
        maleBlackHuman.sex();
        Human femaleBlackHuman = femaleHumanFactory.createBlackHuman();
        femaleBlackHuman.cry();
        femaleBlackHuman.laugh();
        femaleBlackHuman.sex();

        System.out.println("----------------------------------------");
        Human maleWhiteHuman = maleHumanFactory.createWhiteHuman();
        maleWhiteHuman.laugh();
        maleWhiteHuman.talk();
        maleWhiteHuman.sex();
        Human femaleWhiteHuman = femaleHumanFactory.createWhiteHuman();
        femaleWhiteHuman.cry();
        femaleWhiteHuman.laugh();
        femaleWhiteHuman.sex();
    }
}

/***
* 运行结果示例
* ---------生产线建立完毕，开始生产人了---------
 * 黄色人种会大笑，幸福呀！
 * 黄色人种会哭
 * 此时生产的黄种人的性别为男
 * 黄色人种会大笑，幸福呀！
 * 黄色人种会说话，一般说的都是双字节
 * 此时生产的黄种人的性别为女
 * ----------------------------------------
 * 黑人可以说话，一般人听不懂
 * 黑人会笑
 * 此时生产的黑种人的性别为男
 * 黑人会哭
 * 黑人会笑
 * 此时生产的黑种人的性别为女
 * ----------------------------------------
 * 白色人种会哭
 * 白色人种会说话，一般都是但是单字节！
 * 此时生产的白种人的性别为男
 * 白色人种会大笑，侵略的笑声
 * 白色人种会哭
 * 此时生产的白种人的性别为女
*/

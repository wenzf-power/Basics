package main.java.DesignMode.FactoryMethodPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/22/18:41
 * @Description: 测试工厂模式
 */
public class TestFactoryPattern {
    public static void main(String[] args) {

        System.out.println("------------造出的第一批人是这样的：白人 -----------------");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.cry();
        whiteHuman.laugh();
        whiteHuman.talk();

        System.out.println("\n\n------------造出的第二批人是这样的：黑人 -----------------");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.talk();

        System.out.println("\n\n------------造出的第三批人是这样的：黄色人种 -----------------");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();

    }
}
/***
 * 运行结果示例：
 * ------------造出的第一批人是这样的：白人 -----------------
 * 白色人种会大笑，侵略的笑声
 * 白色人种会哭
 * 白色人种会说话，一般都是但是单字节！
 *
 *
 * ------------造出的第二批人是这样的：黑人 -----------------
 * 黑人会哭
 * 黑人会笑
 * 黑人可以说话，一般人听不懂
 *
 *
 * ------------造出的第三批人是这样的：黄色人种 -----------------
 * 黄色人种会大笑，幸福呀！
 * 黄色人种会哭
 * 黄色人种会说话，一般说的都是双字节
 */
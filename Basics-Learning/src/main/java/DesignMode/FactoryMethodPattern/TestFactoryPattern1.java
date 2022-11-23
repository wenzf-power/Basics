package main.java.DesignMode.FactoryMethodPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/22/19:00
 * @Description:
 */
public class TestFactoryPattern1 {
    public static void main(String[] args) {
        System.out.println("\n\n------------随机产生人种-----------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("\n----------------------------");
            Human human = HumanFactory.createHuman();
            human.cry();
            human.laugh();
            human.talk();
        }
    }
}

/***
* 运行结果示例：
 *------------随机产生人种-----------------
 *
 * ----------------------------
 * 黑人会哭
 * 黑人会笑
 * 黑人可以说话，一般人听不懂
 *
 * ----------------------------
 * 白色人种会大笑，侵略的笑声
 * 白色人种会哭
 * 白色人种会说话，一般都是但是单字节！
 *
 * ----------------------------
 * 黄色人种会大笑，幸福呀！
 * 黄色人种会哭
 * 黄色人种会说话，一般说的都是双字节
 *
 * ----------------------------
 * 白色人种会大笑，侵略的笑声
 * 白色人种会哭
 * 白色人种会说话，一般都是但是单字节！
 *
 * ----------------------------
 * 黑人会哭
 * 黑人会笑
 * 黑人可以说话，一般人听不懂
*/
package main.java.DesignMode.FactoryMethodPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/23/9:45
 * @Description: 测试延迟始化，如果对象存在，则不再初始化
 */
public class TestFactoryMap {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                HumanFactoryMap.createHuman(WhiteHuman.class);
            } else if (i == 1) {
                HumanFactoryMap.createHuman(BlackHuman.class);
            } else if (i == 2) {
                HumanFactoryMap.createHuman(YellowHuman.class);
            }else {
                HumanFactoryMap.createHuman(YellowHuman.class);
            }
        }
        HumanFactoryMap.getHumans();

    }
}
/***
* 运行结果示例:
* 人种数量大小：3
 * BlackHuman:
 * 黑人会哭
 * 黑人会笑
 * 黑人可以说话，一般人听不懂
 * YellowHuman:
 * 黄色人种会大笑，幸福呀！
 * 黄色人种会哭
 * 黄色人种会说话，一般说的都是双字节
 * WhiteHuman:
 * 白色人种会大笑，侵略的笑声
 * 白色人种会哭
 * 白色人种会说话，一般都是但是单字节！
*/
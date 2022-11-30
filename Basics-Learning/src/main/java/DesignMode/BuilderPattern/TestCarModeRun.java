package main.java.DesignMode.BuilderPattern;

import java.util.ArrayList;

/**
 * @Author: wenzf
 * @Date: 2022/11/25/15:59
 * @Description: 建造者模式示例
 */
public class TestCarModeRun {
    public static void main(String[] args) {
        BenzModel benz = new BenzModel();
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<String>();
        //客户要求，run的时候时候先发动引擎
        sequence.add("engine boom");
        //启动起来
        sequence.add("start");
        //开了一段就停下来
        sequence.add("stop");
        //然后我们把这个顺序给奔驰车：
        benz.setSequence(sequence);
        benz.run();
    }
}
/**
* 运行结果示例：
 * 奔驰车的引擎是这个声音的...
 *  奔驰车跑起来是这个样子的...
 *  奔驰车应该这样停车...
*/
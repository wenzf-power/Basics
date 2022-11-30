package main.java.DesignMode.BuilderPattern;

import java.util.ArrayList;

/**
 * @Author: wenzf
 * @Date: 2022/11/25/16:23
 * @Description: 建造者模式示例
 */
public class TestBuilderPattern {
    public static void main(String[] args) {
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<String>();
        //客户要求，run的时候时候先发动引擎
        sequence.add("engine boom");
        //启动起来
        sequence.add("start");
        //开了一段就挺下来
        sequence.add("stop");

        //要一个奔驰车：
        BenzBuilder benzBuilder = new BenzBuilder();
        //把顺序给这个builder类，制造出这样一个车出来
        benzBuilder.setSequence(sequence);

        //制造出一个奔驰车
        BenzModel benz = (BenzModel)benzBuilder.getCarModel();
        //奔驰车跑一下看看
        benz.run();

        //按照同样的顺序，我再要一个宝马
        BmwBuilder bmwBuilder = new BmwBuilder();
        bmwBuilder.setSequence(sequence);
        BmwCarModel bmw = (BmwCarModel)bmwBuilder.getCarModel();
        bmw.run();
    }
}
/**
* 运行结果示例：
 * 奔驰车的引擎是这个声音的...
 * 奔驰车跑起来是这个样子的...
 * 奔驰车应该这样停车...
 * 宝马车的引擎是这个声音的...
 * 宝马车跑起来是这个样子的...
 * 宝马车应该这样停车...
*/
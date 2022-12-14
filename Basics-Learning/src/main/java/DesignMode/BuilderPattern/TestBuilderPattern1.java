package main.java.DesignMode.BuilderPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/25/16:45
 * @Description: 建造者模式示例
 */
public class TestBuilderPattern1 {
    public static void main(String[] args) {
        Director director = new Director();
        //2辆A类型的奔驰车
        for(int i=0;i<2;i++){
            director.getABenzModel().run();
            System.out.println("--------------------");
        }

        //3辆B类型的奔驰车
        for(int i=0;i<3;i++){
            director.getBBenzModel().run();
            System.out.println("--------------------");
        }

        //2量C类型的宝马车
        for(int i=0;i<2;i++){
            director.getCBMWModel().run();
            System.out.println("--------------------");
        }

        for (int i = 0; i < 2; i++) {
            director.getDBMWModel().run();
            System.out.println("--------------------");
        }
    }
}

/**
* 运行结果示例：
* 奔驰车跑起来是这个样子的...
 * 奔驰车应该这样停车...
 * --------------------
 * 奔驰车跑起来是这个样子的...
 * 奔驰车应该这样停车...
 * --------------------
 * 奔驰车的引擎是这个声音的...
 * 奔驰车跑起来是这个样子的...
 * 奔驰车应该这样停车...
 * --------------------
 * 奔驰车的引擎是这个声音的...
 * 奔驰车跑起来是这个样子的...
 * 奔驰车应该这样停车...
 * --------------------
 * 奔驰车的引擎是这个声音的...
 * 奔驰车跑起来是这个样子的...
 * 奔驰车应该这样停车...
 * --------------------
 * 宝马车的喇叭声音是这个样子的...
 * 宝马车跑起来是这个样子的...
 * 宝马车应该这样停车...
 * --------------------
 * 宝马车的喇叭声音是这个样子的...
 * 宝马车跑起来是这个样子的...
 * 宝马车应该这样停车...
 * --------------------
 * 宝马车跑起来是这个样子的...
 * --------------------
 * 宝马车跑起来是这个样子的...
 * --------------------
*/

package main.java.DesignMode.BuilderPattern;

import java.util.ArrayList;

/**
 * @Author: wenzf
 * @Date: 2022/11/25/16:02
 * @Description:
 */
public abstract class CarBuilder {

    /**
    * 建造一个模型，你要给我一个顺序要，就是组装顺序
    * @param: [sequence]
    * @return: void
    */
    public abstract void setSequence(ArrayList<String> sequence);

    /**
    * 设置完毕顺序后，获取车辆模型
    * @param:
    * @return:
    */
    public abstract CarModel getCarModel();
}

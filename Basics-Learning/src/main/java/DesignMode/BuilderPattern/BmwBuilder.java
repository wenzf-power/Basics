package main.java.DesignMode.BuilderPattern;

import java.util.ArrayList;

/**
 * @Author: wenzf
 * @Date: 2022/11/25/16:13
 * @Description:
 */
public class BmwBuilder extends CarBuilder{

    private BmwCarModel bmw = new BmwCarModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
            this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}

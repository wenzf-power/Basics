package main.java.DesignMode.BuilderPattern;

import java.util.ArrayList;

/**
 * @Author: wenzf
 * @Date: 2022/11/25/16:10
 * @Description:
 */
public class BenzBuilder extends CarBuilder{
    private BenzModel benz = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}

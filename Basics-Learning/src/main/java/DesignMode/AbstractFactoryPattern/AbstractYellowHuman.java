package main.java.DesignMode.AbstractFactoryPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/23/11:00
 * @Description:
 */
public abstract class AbstractYellowHuman implements Human{
    @Override
    public void laugh() {
        System.out.println("黄色人种会哭");
    }

    @Override
    public void cry() {
        System.out.println("黄色人种会大笑，幸福呀！");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节");
    }
}

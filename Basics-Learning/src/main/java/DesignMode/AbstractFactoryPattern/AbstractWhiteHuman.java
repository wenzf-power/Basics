package main.java.DesignMode.AbstractFactoryPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/23/11:04
 * @Description:
 */
public abstract class AbstractWhiteHuman implements Human{
    @Override
    public void laugh() {
        System.out.println("白色人种会哭");
    }

    @Override
    public void cry() {
        System.out.println("白色人种会大笑，侵略的笑声");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话，一般都是但是单字节！");
    }
}

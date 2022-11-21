package main.java.DesignMode.ProxyPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/21/10:44
 * @Description: 代理人 女明星表演
 */
public class StarWoman implements PopStar{

    @Override
    public void sing() {
        System.out.println("女明星在唱歌………………");
    }

    @Override
    public void dance() {
        System.out.println("女明星在跳舞………………");
    }
}

package main.java.DesignMode.ProxyPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/21/10:46
 * @Description: 代理人和被代理人具有相同的才艺，但是真正在表演才艺的是被代理人；
 */
public class ProxyWorker implements PopStar{

    private PopStar popStar;

    /**
    * @Description: 被代理人初始化
    * @Param: []
    * @return: 
    */
    public ProxyWorker() {
        this.popStar = new StarWoman();
    }

    @Override
    public void sing() {
        this.popStar.sing();
    }

    @Override
    public void dance() {
        this.popStar.dance();
    }
}

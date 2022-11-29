package main.java.DesignMode.TemplateMethodPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/24/15:51
 * @Description: 模板方法模式
 */
public abstract class HummerModel {

    /**
    * 启动
    * @param: []
    * @return: void
    */
    protected abstract void start();

    /**
    * 停止
    * @param: []
    * @return: void
    */
    protected abstract void stop();

    /**
    * 喇叭声音
    * @param: []
    * @return: void
    */
    protected abstract void alarm();

    /**
    * 引擎声音，会轰隆隆的响
    * @param:
    * @return:
    */
    protected abstract void engineBoom();

    /**
    * 运行，行驶
    * @param:
    * @return:
    */
    final public void run(){
        //先发动汽车
        this.start();

        //引擎开始轰鸣
        this.engineBoom();

        //喇嘛想让它响就响，不想让它响就不响
        if(this.isAlarm()){
            this.alarm();
        }

        //到达目的地就停车
        this.stop();
    }

    /**
    * 钩子方法，默认喇叭是会响的
    * @param:
    * @return:
    */
    protected boolean isAlarm(){
        return true;
    }
}

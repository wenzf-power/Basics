package main.java.DesignMode.BuilderPattern;

import java.util.ArrayList;

/**
 * @Author: wenzf
 * @Date: 2022/11/25/15:41
 * @Description:
 */
public abstract class CarModel {
    /**
    * 这个参数是各个基本方法执行的顺序
    */
    private ArrayList<String> sequence = new ArrayList<String>();

      /**
      * 模型是启动开始跑了
      * @param: []
      * @return: void
      */
    protected abstract void start();

    /**
    * 停车
    * @param: []
    * @return: void
    */
    protected abstract void stop();

    protected abstract void alarm();

    /**
    * 引擎会轰隆隆的响
    * @param:
    * @return:
    */
    protected abstract void engineBoom();

    /**
    * 那模型运行，开始跑
    * @param:
    * @return:
    */
    final public void run() {

        //循环一遍，谁在前，就先执行谁
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            //如果是start关键字，//如果是stop关键字
            if (actionName.equalsIgnoreCase("start")) {
                //开启汽车
                this.start();
            } else if (actionName.equalsIgnoreCase("stop")) {
                //停止汽车
                this.stop();
            } else if (actionName.equalsIgnoreCase("alarm")) {
                //喇叭开始叫了
                this.alarm();
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                //引擎开始轰鸣
                this.engineBoom();
            }
        }
    }

    /**
    * 把传递过来的值传递到类内
    * @param:
    * @return:
    */
    final public void setSequence(ArrayList<String> sequence){
        this.sequence = sequence;
    }
}

package main.java.DesignMode.CommandPattern;

/**
 * @Author: wenzf
 * @Date: 2023/01/19/11:44
 * @Description: 甲方、乙方 模拟命令模式
 */
public abstract class Group {
    /**
    * 甲乙双方分开办公，你要和那个组讨论，你首先要找到这个组
    * @param: []
    * @return: void
    */
    public abstract void find();

    /**
    * 被要求增加功能
    * @param: []
    * @return: void
    */
    public abstract void add();

    /**
     * 被要求删除功能
     * @param: []
     * @return: void
     */
    public abstract void delete();

    /**
    * 被要求修改功能
    * @param: []
    * @return: void
    */
    public abstract void change();

    /**
    * 被要求给出所有的变更计划
    * @param: []
    * @return: void
    */
    public abstract void plan();
}

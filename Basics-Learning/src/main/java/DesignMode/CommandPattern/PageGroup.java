package main.java.DesignMode.CommandPattern;

/**
 * @Author: wenzf
 * @Date: 2023/01/19/14:41
 * @Description: 美工组
 */
public class PageGroup extends Group{
    @Override
    public void find() {
        System.out.println("找到美工组...");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一个页面...");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一个页面...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一个页面...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求页面变更计划...");
    }

}

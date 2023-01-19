package main.java.DesignMode.CommandPattern;

/**
 * @Author: wenzf
 * @Date: 2023/01/19/14:47
 * @Description: 抽象命令类
 */
public abstract class Command {
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();
    /**
    * 执行
    * @param: []
    * @return: void
    */
    public abstract void execute();


}

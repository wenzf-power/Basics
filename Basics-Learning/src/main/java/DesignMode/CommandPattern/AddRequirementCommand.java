package main.java.DesignMode.CommandPattern;

/**
 * @Author: wenzf
 * @Date: 2023/01/19/14:52
 * @Description:
 */
public class AddRequirementCommand extends Command{
    /**
    * 执行增加一项需求的命令
    * @param: []
    * @return: void
    */
    @Override
    public void execute() {
        //找到需求组
        super.rg.find();

        //增加一份需求
        super.rg.add();

        //给出计划
        super.rg.plan();
    }

}

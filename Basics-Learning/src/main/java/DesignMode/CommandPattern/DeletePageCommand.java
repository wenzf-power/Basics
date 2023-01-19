package main.java.DesignMode.CommandPattern;

/**
 * @Author: wenzf
 * @Date: 2023/01/19/14:54
 * @Description:
 */
public class DeletePageCommand extends Command{
    /**
    * 执行删除一个页面的命令
    * @param: []
    * @return: void
    */
    @Override
    public void execute() {
        //找到页面组 
        super.pg.find();

        //删除一个页面 
        super.rg.delete();

        //给出计划 
        super.rg.plan();
    }
}

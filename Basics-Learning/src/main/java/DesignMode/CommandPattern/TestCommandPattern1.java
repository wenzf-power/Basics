package main.java.DesignMode.CommandPattern;

/**
 * @Author: wenzf
 * @Date: 2023/01/19/15:00
 * @Description: 模拟命令模式
 */
public class TestCommandPattern1 {
    public static void main(String[] args) {
        //定义我们的接头人
        Invoker test = new Invoker();
        //客户要求增加一项需求
        System.out.println("-------------客户要求增加一项需求-----------------");
        //客户给我们下命令来
        Command command = new AddRequirementCommand();
        //接头人接收到命令
        test.setCommand(command);
        //接头人执行命令
        test.action();
    }
}
/**
* 运行结果如下：
 * -------------客户要求增加一项需求-----------------
 * 找到需求组...
 * 客户要求增加一项需求...
 * 客户要求需求变更计划...
*/

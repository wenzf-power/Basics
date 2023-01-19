package main.java.DesignMode.CommandPattern;

/**
 * @Author: wenzf
 * @Date: 2023/01/19/15:03
 * @Description: 模拟命令模式
 */
public class TestCommandPattern2 {
    public static void main(String[] args) {
        //定义我们的接头人
        Invoker test = new Invoker();
        //客户要求增加一项需求
        System.out.println("-------------客户要求删除一个页面-----------------");
        //客户给我们下命令来
        Command command = new DeletePageCommand();
        //接头人接收到命令
        test.setCommand(command);
        //接头人执行命令
        test.action();
    }
}
/**
* 运行结果如下
 * -------------客户要求删除一个页面-----------------
 * 找到美工组...
 * 客户要求删除一项需求...
 * 客户要求需求变更计划...
*/

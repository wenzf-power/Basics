package main.java.DesignMode.CommandPattern;

/**
 * @Author: wenzf
 * @Date: 2023/01/19/14:55
 * @Description: 接头人
 */
public class Invoker {
    /**
    * 什么命令
    * @param:
    * @return:
    */
    private Command command;

    /**
    * 客户发出命令
    * @param:
    * @return:
    */
    public void setCommand(Command command){
        this.command = command;
    }

    /**
    * 执行客户的命令
    * @param: []
    * @return: void
    */
    public void action(){
        this.command.execute();
    }
}

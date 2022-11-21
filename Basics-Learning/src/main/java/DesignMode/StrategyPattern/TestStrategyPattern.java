package main.java.DesignMode.StrategyPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/18/18:40
 * @Description: 策略模式场景运行
 */
public class TestStrategyPattern {
    public static void main(String[] args) {
        System.out.println("**********策略模式设计示例********");
        Context context;
        System.out.println("——————————开始打开第一个妙计——————————");
        context = new Context(new FirstPlan());
        context.operate();
        System.out.println("——————————开始打开第二个妙计——————————");
        context = new Context(new SecondPlan());
        context.operate();
        System.out.println("——————————开始打开第三个妙计——————————");
        context = new Context(new ThirdPlan());
        context.operate();
    }
}

/***
* 结果：
 * **********策略模式设计示例********
 * ——————————开始打开第一个妙计——————————
 * 第一个妙计：找乔国老帮忙，使孙权不能杀刘备！
 * ——————————开始打开第二个妙计——————————
 * 第二个妙计：求吴国太,放行！
 * ——————————开始打开第三个妙计——————————
 * 第三个妙计：孙夫人断后，挡住追兵！
*/

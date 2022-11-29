package main.java.DesignMode.TemplateMethodPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/24/16:17
 * @Description: 模板方法模式示例
 */
public class TestTemplatePattern {
    public static void main(String[] args) {

        //客户开着H1型号，出去遛弯了
        HummerH1Model h1 = new HummerH1Model();
        h1.setAlarm(true);
        //汽车跑起来了；
        h1.run();

        //客户开H2型号，出去玩耍了
        HummerModel h2 = new HummerH2Model();
        h2.run();
    }
}
/**
* 运行结果示例：
 * 悍马H1发动...
 * 悍马H1引擎声音是这样的...
 * 悍马H1鸣笛...
 * 悍马H1停车...
 * 悍马H2发动...
 * 悍马H2引擎声音是这样的...
 * 悍马H2停车...
*/

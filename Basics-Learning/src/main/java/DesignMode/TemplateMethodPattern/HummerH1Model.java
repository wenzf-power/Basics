package main.java.DesignMode.TemplateMethodPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/24/15:57
 * @Description:
 */
public class HummerH1Model extends HummerModel{
    /**
    *是否要响喇叭
    */
    private boolean alarmFlag = true;

    @Override
    protected void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的...");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }
    /**
    * 要不要响喇叭，是有客户的来决定的
    * @param:
    * @return:
    */
    public void setAlarm(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }
}

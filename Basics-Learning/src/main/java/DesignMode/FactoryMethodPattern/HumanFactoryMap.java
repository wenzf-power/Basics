package main.java.DesignMode.FactoryMethodPattern;

import java.util.HashMap;

/**
 * @Author: wenzf
 * @Date: 2022/11/23/9:40
 * @Description: 工厂方法模式重要的应用，延迟始化 ,对象初始化后可以直接从内存中获取
 */
public class HumanFactoryMap {

    private static HashMap<String,Human> humans = new HashMap<String,Human>();
    /***
     * @Description: 指定生成某个类型人类
     * @Param: [c]
     * @return:
     */
    public static Human createHuman(Class c){
        //定义一个类型的人类
        Human human=null;
        try {
            //产生一个人种
            if(humans.containsKey(c.getSimpleName())){
                human = humans.get(c.getSimpleName());
            }else{
                human = (Human)Class.forName(c.getName()).newInstance();
                //放到MAP中
                humans.put(c.getSimpleName(), human);
            }
        } catch (InstantiationException e) {
            System.out.println("必须指定人种的颜色");
        } catch (IllegalAccessException e) {
            System.out.println("人种定义错误！");
        } catch (ClassNotFoundException e) {
            System.out.println("指定的人种找不到！");
        }
        return human;
    }

    public static HashMap<String, Human> getHumans() {
        System.out.println("人种数量大小："+humans.size());
        humans.forEach((key, value)->{
            System.out.println(key+":");
            value.cry();
            value.laugh();
            value.talk();
        });
        return humans;
    }
}

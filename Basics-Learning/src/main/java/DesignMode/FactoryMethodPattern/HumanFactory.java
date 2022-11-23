package main.java.DesignMode.FactoryMethodPattern;

import java.util.List;
import java.util.Random;

/**
 * @Author: wenzf
 * @Date: 2022/11/22/18:02
 * @Description: 工厂
 */
public class HumanFactory {
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
            human = (Human)Class.forName(c.getName()).newInstance();

        } catch (InstantiationException e) {
            System.out.println("必须指定人种的颜色");
        } catch (IllegalAccessException e) {
            System.out.println("人种定义错误！");
        } catch (ClassNotFoundException e) {
            System.out.println("指定的人种找不到！");
        }
        return human;
    }

    /***
    * @Description: 随机生成某个类型的人类
    * @Param: []
    * @return:
    */
    public static Human createHuman(){
        //定义一个类型的人类
        Human human=null;
        //首先是获得有多少个实现类，多少个人种
        List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class);
        // 随机造人
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());
        human = createHuman(concreteHumanList.get(rand));
        return human;
    }
}

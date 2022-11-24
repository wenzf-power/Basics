package main.java.DesignMode.AbstractFactoryPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/23/11:30
 * @Description:
 */
public abstract class AbstractHumanFactory implements HumanFactory{
   /***
   * @Description: 给定一个性别人种，创建一个人类出来 专业术语是产生产品等级
   * @Param: [humanEnum]
   * @return: main.java.DesignMode.AbstractFactoryPattern.Human
   */
    protected Human createHuman(HumanEnum humanEnum) {
        Human human = null;
        //如果传递进来不是一个Enum中具体的一个Element的话，则不处理
        if (!humanEnum.getValue().equals("")) {
            try {
                //直接产生一个实例
                human = (Human) Class.forName(humanEnum.getValue()).newInstance();
            } catch (Exception e) {
                //因为使用了enum，这个种异常情况不会产生了，除非enum有问题；
                e.printStackTrace();
            }
        }
        return human;
    }
}

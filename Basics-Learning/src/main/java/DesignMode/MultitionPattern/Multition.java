package main.java.DesignMode.MultitionPattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: wenzf
 * @Date: 2022/11/21/14:13
 * @Description: 多例模式
 */
public class Multition {
    /***
    * 最大实例数
    */
    private static int maxNum = 2;
    /**
    * @Description: 实例信息
    */
    private static ArrayList InfoList=new ArrayList(maxNum);
    /***
    * @Description: 实例列表
    */
    private static ArrayList List=new ArrayList(maxNum);
    /***
    * @Description: 当前实例标识
    */
    private static int countNum=0;

    static{
        for(int i=0;i<maxNum;i++){
            List.add(new Multition("实例"+(i+1)));
        }
    }

    private Multition(){
    }

    private Multition(String info){
        InfoList.add(info);
    }
    /***
    * @Description: 随机选出一个实例
    * @Param: []
    * @return:
    */
    public static Multition getInstance(){
        Random random = new Random();
        countNum = random.nextInt(maxNum);
        return (Multition)List.get(countNum);
    }


    public  void info(){
        System.out.println(InfoList.get(countNum));
    }

}

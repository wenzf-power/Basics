package main.java.DesignMode.AdapterPattern;

import java.util.Map;

/**
 * @Author: wenzf
 * @Date: 2022/11/24/11:29
 * @Description: 外部系统的员工信息
 */
public interface IOuterUser {
    /**
    * 基本信息，比如名称，性别，手机号码了等
    * @param: []
    * @return: java.util.Map
    */
    Map getUserBaseInfo();

    /**
    * 工作区域信息
    * @param:
    * @return:
    */
    Map getUserOfficeInfo();

    /**
    * 用户的家庭信息
    * @param:
    * @return:
    */
    Map getUserHomeInfo();
}

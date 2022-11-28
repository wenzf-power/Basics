package main.java.DesignMode.AdapterPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/24/11:08
 * @Description:
 */
public interface IUserInfo {
    /**
    * 获得用户名
    * @param: []
    * @return: java.lang.String
    */
    String getUserName();

    /**
    * 获得家庭地址
    * @param: []
    * @return: java.lang.String
    */
    String getHomeAddress();

   /**
   * 获得手机号码
   * @param: []
   * @return: java.lang.String
   */
    String getMobileNumber();

    /**
    * 获得办公电话，一般式座机
    * @param:
    * @return: java.lang.String
    */
   String getOfficeTelNumber();

    /**
    * 获取职位
    * @param: []
    * @return: java.lang.String
    */
   String getJobPosition();

    /**
    * 获取家庭电话
    * @param: []
    * @return: java.lang.String
    */
    String getHomeTelNumber();
}

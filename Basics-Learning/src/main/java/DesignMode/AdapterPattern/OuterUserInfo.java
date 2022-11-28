package main.java.DesignMode.AdapterPattern;

import java.util.Map;

/**
 * @Author: wenzf
 * @Date: 2022/11/24/11:43
 * @Description:
 */
public class OuterUserInfo extends OuterUser implements IUserInfo{

    /**
    * 员工的基本信息
    */
    private Map baseInfo = super.getUserBaseInfo();
    /**
    * 员工的家庭 信息
    */
    private Map homeInfo = super.getUserHomeInfo();
    /**
    * 员工的家庭 信息
    * @param:
    * @return:
    */
    private Map officeInfo = super.getUserOfficeInfo();


    @Override
    public String getUserName() {
        String userName = (String)this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String)this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String)this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String)this.officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = (String)this.officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String)this.homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}

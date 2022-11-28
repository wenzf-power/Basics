package main.java.DesignMode.AdapterPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/24/14:11
 * @Description: 适配器模式
 */
public class TestAdapterPattern {
    public static void main(String[] args) {
        //没有与外系统连接的时候，是这样写的
        //IUserInfo youngGirl = new UserInfo();

        //对接外部系统时
        IUserInfo youngGirl = new OuterUserInfo();
        //从数据库中查找
        for(int i=0;i<5;i++){
            youngGirl.getMobileNumber();
        }
    }
}
/**
* 运行结果示例：
 * 这个员工电话是....
 * 这个员工电话是....
 * 这个员工电话是....
 * 这个员工电话是....
 * 这个员工电话是....
*/
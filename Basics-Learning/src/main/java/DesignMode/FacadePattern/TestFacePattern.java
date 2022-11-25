package main.java.DesignMode.FacadePattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/23/18:13
 * @Description: 门面模式示例
 */
public class TestFacePattern {
    public static void main(String[] args) {
        //现代化的邮局，有这项服务，邮局名称叫Hell Road
        PostOffice hellRoadPostOffice = new PostOffice();
        //你只要把信的内容和收信人地址给他，他会帮你完成一系列的工作；
        //定义一个地址
        String address = "Happy Road No. 666,God Province,Heaven";
        String context = "Hello,It's me,do you know who I am? I'm your old lover. I'd like to....";
        hellRoadPostOffice.sendLetter(context, address);
    }
}

/***
* 运行结果示例;
 * 填写信的内容....Hello, It's me,do you know who I am? I'm your old lover. I'd like to....
 * 填写收件人地址及姓名....Happy Road No. 666,God Province,Heaven
 * 把信放到信封中....
 * 邮递信件...
*/

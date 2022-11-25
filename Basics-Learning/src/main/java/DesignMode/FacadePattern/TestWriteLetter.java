package main.java.DesignMode.FacadePattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/23/17:53
 * @Description:
 */
public class TestWriteLetter {
    public static void main(String[] args) {
        //创建一个处理信件的过程
        LetterProcess letterProcess = new LetterProcessImpl();

        //开始写信
        letterProcess.writeContext("Hello,It's me,do you know who I am? I'm your old lover. I'd like to....");

        //开始写信封
        letterProcess.fillEnvelope("Happy Road No. 666,God Province,Heaven");

        //把信放到信封里，并封装好
        letterProcess.letterIntoEnvelope();

        //跑到邮局把信塞到邮箱，投递
        letterProcess.sendLetter();
    }
}
/***
* 运行结果示例:
 * 填写信的内容....Hello, It's me,do you know who I am? I'm your old lover. I'd like to....
 * 填写收件人地址及姓名....Happy Road No. 666,God Province,Heaven
 * 把信放到信封中....
 * 邮递信件...
*/

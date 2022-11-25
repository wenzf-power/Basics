package main.java.DesignMode.FacadePattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/23/18:04
 * @Description:
 */
public class PostOffice {
    private LetterProcess letterProcess = new LetterProcessImpl();
    /***
    * @Description: 写信，封装，投递，一体化
    * @Param:
    * @return:
    */
    public void sendLetter(String context,String address) {

        //帮你写信
        letterProcess.writeContext(context);

        //写好信封
        letterProcess.fillEnvelope(address);

        //把信放到信封中
        letterProcess.letterIntoEnvelope();

        //邮递信件
        letterProcess.sendLetter();
    }
}

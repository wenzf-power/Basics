package main.java.DesignMode.FacadePattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/23/17:20
 * @Description: 门面模式示例：定义一个写信的过程
 */
public interface LetterProcess {

    /**
     * 首先要写信的内容
    * @param: context
    * @return: void
    */
    void writeContext(String context);

    /**
    * @Description: 其次写信封
    * @Param: [address]
    * @return: void
    */
    void fillEnvelope(String address);

    /**
    * @Description: 把信放到信封里
    */
    void letterIntoEnvelope();

    /***
    * @Description: 然后邮递
    */
    void sendLetter();
}

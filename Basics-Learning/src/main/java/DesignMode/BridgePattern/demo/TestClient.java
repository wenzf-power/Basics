package main.java.DesignMode.BridgePattern.demo;

/**
 * @Author: wenzf
 * @Date: 2022/11/28/17:03
 * @Description:
 */
public class TestClient {
    public static void main(String[] args) {
        System.out.println("-------房地产公司是这个样子运行的-------");

        HouseCorp houseCorp =new HouseCorp();
        houseCorp.makeMoney();
        System.out.println("\n");

        System.out.println("-------服装公司是这样运行的-------");
        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();
    }
}
/**
* 运行结果示例：
* -------房地产公司是这个样子运行的-------
 * 房地产公司盖房子...
 * 房地产公司出售房子...
 * 房地产公司赚大钱了...
 *
 *
 * -------服装公司是这样运行的-------
 * 服装公司生产衣服...
 * 服装公司出售衣服...
 * 服装公司赚小钱...
*/
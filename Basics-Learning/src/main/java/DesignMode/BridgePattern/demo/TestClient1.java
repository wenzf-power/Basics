package main.java.DesignMode.BridgePattern.demo;

/**
 * @Author: wenzf
 * @Date: 2022/11/28/17:33
 * @Description:
 */
public class TestClient1 {
    public static void main(String[] args) {

        System.out.println("-------房地产公司是这个样子运行的-------");
        HouseCorp houseCorp =new HouseCorp();
        houseCorp.makeMoney();
        System.out.println("\n");

        System.out.println("-------山寨公司是这样运行的-------");
        IPodCorp iPodCorp = new IPodCorp();
        iPodCorp.makeMoney();
    }
}

/**
* 运行结果示例;
* -------房地产公司是这个样子运行的-------
 * 房地产公司盖房子...
 * 房地产公司出售房子...
 * 房地产公司赚大钱了...
 *
 *
 * -------山寨公司是这样运行的-------
 * 我生产iPod...
 * iPod畅销...
 * 我赚钱呀...
*/

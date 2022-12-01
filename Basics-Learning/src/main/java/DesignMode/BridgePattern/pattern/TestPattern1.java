package main.java.DesignMode.BridgePattern.pattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/28/18:03
 * @Description: 桥梁模式示例
 */
public class TestPattern1 {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("-------房地产公司是这个样子运行的-------");
        //先找到我的公司
        HouseCorp houseCorp =new HouseCorp(house);
        //看我怎么挣钱
        houseCorp.makeMoney();
        System.out.println("\n");

        //山寨公司生产的产品很多，不过我只要制定产品就成了
        System.out.println("-------山寨公司是这样运行的-------");
        //OtherCorp otherCorp = new OtherCorp(new Clothes());
        OtherCorp otherCorp = new OtherCorp(new IPod());
        otherCorp.makeMoney();
    }
}

/**
* 运行结果示例：
* -------房地产公司是这个样子运行的-------
 * 生产出的房子是这个样子的...
 * 生产出的房子卖出去了...
 * 房地产公司赚大钱了...
 *
 *
 * -------山寨公司是这样运行的-------
 * 生产出的iPod是这个样子的...
 * 生产出的iPod卖出去了...
 * 我赚钱呀...
*/

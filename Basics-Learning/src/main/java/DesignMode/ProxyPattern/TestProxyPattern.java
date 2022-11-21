package main.java.DesignMode.ProxyPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/21/10:51
 * @Description: 女明星不直接对外联系，只有联系代理人，才能让女明星表演才艺
 */
public class TestProxyPattern {
    public static void main(String[] args) {
        System.out.println("**********代理模式设计示例********");
        System.out.println("开始联系代理人...");
        ProxyWorker proxyWorker = new ProxyWorker();
        System.out.println("联系成功，女明星开始表演...");
        proxyWorker.sing();
        proxyWorker.dance();
    }
}
/**
 * 结果：
 ***********代理模式设计示例********
 * 开始联系代理人...
 * 联系成功，女明星开始表演...
 * 女明星在唱歌………………
 * 女明星在跳舞………………
*/

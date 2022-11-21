package main.java.DesignMode.MultitionPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/21/14:36
 * @Description: 多例模式测试
 */
public class TestMultition {
    public static void main(String[] args) {
        int Num =10;
        for(int i=0;i<Num;i++){
            Multition multition = Multition.getInstance();
            System.out.print("循环第"+(i+1)+"次用的实例是：");
            multition.info();
        }
    }
}

/***
* 参考结果:
 * 循环第1次用的实例是：实例2
 * 循环第2次用的实例是：实例2
 * 循环第3次用的实例是：实例2
 * 循环第4次用的实例是：实例2
 * 循环第5次用的实例是：实例2
 * 循环第6次用的实例是：实例1
 * 循环第7次用的实例是：实例2
 * 循环第8次用的实例是：实例2
 * 循环第9次用的实例是：实例1
 * 循环第10次用的实例是：实例1
*/

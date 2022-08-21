package cn.test.chapter02.object.Demo12.Interface;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/8/20
 */
public class Printer implements Print{
    // 接口中的抽象方法是最常用的，一个类implements接口后，必须实现接口中的所有方法
    public void printText() {
        System.out.println("打印文字的机器！");
    }
}

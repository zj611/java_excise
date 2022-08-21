package cn.test.chapter02.object.Demo12.Interface;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/8/20
 */

/**
 * 1. interface是一种规范，不能实例化，它的成员变量是常量或者方法
 * 2. JDk1.8以前，接口中只能定义抽象类方法；JDk1.8以后可以定义抽象方法，默认方法，静态方法和私有方法
 * 3. 接口中的抽象方法是最常用的，一个类implements接口后，必须实现接口中的所有方法
 * 4. 接口的implements和类的extends的区别：
 * 一个类可以同时implements多个接口，但一个类只能extends一个父类
 * 5. 接口之间也有继承关系，也通过extends来实现继承，可以继承多个接口
 */
public interface Print {//定义interface
    public abstract void printText();

//    public default void getName(){ //当前java版本不支持default
//
//    }
}

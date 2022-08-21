package cn.test.chapter02.object.Demo10.Super;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/8/20
 */
public class X {
    int num;

    public X(int n){// 注意X类为有参构造方式，在子类继承时必须显式调用父类带参构造方式
        this.num = n;
    }
}

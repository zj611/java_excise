package cn.test.chapter01.base;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/7/23
 */
public class Demo07Method {
    public static void main(String[] args) {
        int a = 1, b = 1;
        System.out.println(add(a,b));

        double a1 = 1.6, b1 = 1.2;
        System.out.println(add(a1,b1));

        double a2 = 1.6, b2 = 1.2, c2 = 1.8;
        System.out.println(add(a2,b2,c2));
    }
    
    // 函数方法
    public static int add(int a, int b){
        return a + b;
    }

    //重载：方法名字相同，参数不同
    public static double add(double a, double b){
        return a + b;
    }

    //重载：方法名字相同，参数不同，甚至允许参数形式不一样
    public static double add(double a, double b, double c){
        return a + b + c;
    }

}

package cn.test.chapter01.base;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/7/23
 */

import java.util.Scanner;

// Scanner和逻辑运算符

public class Demo03ScannerAndLogicOperation {
    public static void main(String[] args) {
        //Scanner输入法
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数：");
//        int num1 = sc.nextInt();
//        System.out.println("num1=" + num1);
//
//        System.out.println("请输入一个小数：");
//        Double num2 = sc.nextDouble();
//        System.out.println("num2=" + num2);
//
//        System.out.println("请输入一个字符串：");
//        String num3 = sc.next();
//        System.out.println("num3=" + num3);

        //java三元逻辑运算
        byte a = 10;
        String res = a*2>11?"yes":"no";
        System.out.println("res=" +  res);
    }
}

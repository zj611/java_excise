package cn.test.chapter01.base;

import java.util.Arrays;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/7/23
 */
public class Demo06Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 8;
        System.out.println(arr[0] + " " + arr[3] + " " + arr.length);

        int[] arr1 = {1,2,3};
        System.out.println(Arrays.toString(arr1));

        //数组遍历高级写法
        for(int i:arr1){
            System.out.println(i);
        }

        //字符串数组元素检测
        String[] arrStr = {"h1","h2","h3"};
        for (String s : arrStr) {
            if (s.equals("h2")) {
                System.out.println(s);
            }
        }
    }
}

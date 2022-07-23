package cn.test.chapter01.base;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/7/23
 */


public class Demo05While {
    public static void main(String[] args) {
        // java的while循环语句
        int count = 1;
        while(count < 10){
            System.out.println("count=" + count);
            count++;
        }

        // java的do...while循环语句
        do{
            System.out.println("count=" + count);
            count--;
        }while(count > 0);

        // java的for语句
        for(int i=0; i<10; i++){
            count += i;
        }
        System.out.println("count=" + count);
    }
}

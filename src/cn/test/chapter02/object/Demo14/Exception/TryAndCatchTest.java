package cn.test.chapter02.object.Demo14.Exception;

import org.jetbrains.annotations.NotNull;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/8/21
 */
public class TryAndCatchTest {

    public static int getNum(@NotNull int[] nums, int index) throws Exception {

        //主动抛出异常
        if (index >= nums.length || index < 0){
            throw new Exception("索引越界！");
        }

        try{
            int num = nums[index];
            return nums[index];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            return -1;
        }finally {
            System.out.println("不管try是否执行成功，finally最终都要执行的代码");
        }
    }

    public static void main(String[] args) throws Exception {
        int[] nums = {1,2,3};
        int num  = getNum(nums,4);
        System.out.println(num);
    }
}

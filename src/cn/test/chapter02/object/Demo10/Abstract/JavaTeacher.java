package cn.test.chapter02.object.Demo10.Abstract;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/8/20
 */
public class JavaTeacher extends Teacher{
    public void sayHi() {
        System.out.println("hi,我是"+getName()+",我教java");
    }

    public void teach() {
        System.out.println("正在教java课");
    }
}

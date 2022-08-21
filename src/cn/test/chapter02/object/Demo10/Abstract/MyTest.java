package cn.test.chapter02.object.Demo10.Abstract;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/8/20
 */
public class MyTest {
    public static void main(String[] args) {
        JavaTeacher teacher = new JavaTeacher();
        teacher.setName("li");
        teacher.sayHi();
        teacher.teach();
    }
}

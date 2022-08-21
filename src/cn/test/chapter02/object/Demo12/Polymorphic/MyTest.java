package cn.test.chapter02.object.Demo12.Polymorphic;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/8/20
 */

/**
 * 多态的实现方式
 * 产生原因：程序执行分为两个阶段，即编译和运行
 * 编译期间，方法的指针会指向调用该方法的变量所属类型，也就是赋值符号左边的Animal
 * 运行期间，方法的指针指向了赋值符号右边的子类
 * 总之，调用方法时的指针判断为："编译看左边，运行看右边"
 */
public class MyTest {
    public static void main(String[] args) {
        Animal dog = new Dog();//父类引用指向子类对象
        Animal cat = new Cat();//父类引用指向子类对象

        dog.eat();//同一个操作，对象不同产生不同的结果
        cat.eat();//同一个操作，对象不同产生不同的结果


        //判断某个对象是否属于某个类
        boolean flag1 = dog instanceof Animal;
        boolean flag2 = dog instanceof Dog;

        System.out.println(flag1 + " " + flag2);
    }
}

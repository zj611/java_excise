package cn.test.chapter02.object.Demo10.Abstract;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/8/20
 */

import lombok.Getter;
import lombok.Setter;

/**
 * 抽象类特点：
 * 1. 通过abstract修饰；
 * 2. 抽象类都不能实例化；
 * 3. 一个类继承抽象类，必须重写抽象类的所有抽象方法，否则该类还是一个抽象类；
 * 4. 抽象关键字abstract和private不能共存。因为private是私有的，无法继承，
 * 而抽象类是一定要在子类中重写的
 */
@Getter
@Setter
public abstract class Person {
    private String name;
    private Integer age;
    public abstract void sayHi();
}

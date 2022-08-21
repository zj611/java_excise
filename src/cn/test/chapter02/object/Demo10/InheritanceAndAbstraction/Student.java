package cn.test.chapter02.object.Demo10.InheritanceAndAbstraction;

import java.util.Objects;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/7/28
 */
public class Student extends Person {
    String name = "Student";
    public void study() {
        System.out.println("res: " + name + " " + super.name);
    }


    //command + n 快速生成equals方法，用于类的比较
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

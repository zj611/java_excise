package cn.test.chapter03.higher.Reflect;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/8/21
 */
@Getter
@Setter
public class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        this.age = age;
        this.name = name;
    }

    public Student(){
        this.age = -1;
        this.name = "";
    }

    private Student(String name){//私有构造方法
        this.name = name;
    }

    public void methodName(int age){
        this.age = age;
    }
}

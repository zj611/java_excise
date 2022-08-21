package cn.test.chapter02.object.Demo10.InheritanceAndAbstraction;

import lombok.*;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/7/28
 */
@Setter
public class Person {
        public String name="Person";
        private Integer age;

        public void show(){
            System.out.println("name=" + name);
        }

    }








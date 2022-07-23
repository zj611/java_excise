package cn.test.chapter02.object;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/7/23
 */

// 封装，继承和多态面向对象的三大基石
// 所谓封装，是把不想对外暴露的部分隐藏起来，对外暴露一个访问接口
public class Demo09ObjectBase {
    public static void main(String[] args) {
        Car car = new Car();
        car.price = 1000;
        car.color = "red";
        car.run();
    }
/** integer和int的区别：
    integer是int的包装类(属于引用数据类型)，而int是Java的基本数据类型
    Integer的默认值是null，int的默认值是0
    Integer实际是对象的引用，当new一个Integer时，实际上是生成一个指针指向此对象；而int则是直接存储数据值
 **/
    public class Student{  // mac的control+enter快捷键，可以快速生成get和set方法
    private Integer Age; //设置为私有类型
    String Name;

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }


    }

    public static class Car{
        String color;
        int price;
        //构造方法与重载
        //无参形式
        public Car(){

        };
        //带一个参数的形式
        public Car(String color){
            this.color = color;
        };
        //带两个参数的形式
        public Car(String color, int price){
            this.color = color;
            this.price = price;
        };


        public void run(){
            System.out.println("color:" + color + " "+"price:" + price);
        }
    }


}


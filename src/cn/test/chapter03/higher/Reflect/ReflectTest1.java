package cn.test.chapter03.higher.Reflect;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/8/21
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射是指，在程序运行过程中，不用创建对象就能获取程序中任意一个类的属性和方法，
 * 这种动态获取类型的信息和调用对象的机制，称之为反射。
 *
 * java的类会编译成字节码，字节码加载到jvm虚拟机中后会生成一个字节码的文件对象，
 * 想要获取类的信息，需要获得该类的字节码文件对象，字节码文件对象的类型是class，一般有三种方式
 * （1）通过Object类的getClass方法
 * （2）通过"类名.class"
 * （3）通过Class类的静态方法Class.forName
 */
public class ReflectTest1 {
    public static void main(String[] args) throws
            ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException,
            InstantiationException, NoSuchFieldException {
        Student stu = new Student("zhangsan", 15);

        //调用Object类的getClass方法获取stu的字节码文件
        Class<Student> c1 = (Class<Student>) stu.getClass();
        System.out.println(c1);

        //通过"类名.class"获取stu的字节码文件
        Class<Student> c2 = Student.class;
        System.out.println(c2);

        //通过Class类的静态方法Class.forName获取stu的字节码文件
        Class<Student> c3 = (Class<Student>) Class.forName("cn.test.chapter03.higher.Reflect.Student");
        System.out.println(c2);

        /**
         * 反射的功能
         */


        /**
         * 通过反射获取构造方法
         */
        Constructor<Student> con1 = c1.getConstructor(null);//获取一个无参构造方法
        System.out.println(con1);

        Constructor<Student> con2 = c1.getConstructor(String.class, int.class);//获取一个带指定参数的构造方法
        System.out.println(con2);

        /**
         *  通过反射创建对象
         */
        Student stu2 = con2.newInstance("wangwu",12);
        System.out.println("stu2 = " + stu2.getName() +" " + stu2.getAge());
        //通过反射获取私有构造方法，并创建对象
        Constructor<Student> con3 = c1.getDeclaredConstructor(String.class);//获取一个带指定参数的构造方法
        System.out.println(con3);
        //设置取消该私有构造函数的访问权限检查
        con3.setAccessible(true);
        Student stu3 = (Student) con3.newInstance("zhaoliu");
        System.out.println("stu3 = " + stu3.getName() +" " + stu3.getAge());

        /**
         *   通过反射获取成员变量
         */
        // 类的成员变量可以用类的Field表示，
        // public Field getField(String name);//获取public修饰的成员变量
        // public Field getDeclaredField(String name);//获取任意成员变量，包括private
        // public Field[] getFields();//获取全部public修饰的成员变量
        // public Field[] getDeclaredFields();//获取全部任意成员变量，包括private
        // Field f1 = c1.getField("name"); 报错NoSuchFieldException因为是private的
        // System.out.println(f1);
        Field f2 = c1.getDeclaredField("name");//NoSuchFieldException因为是private的
        System.out.println("f2 = " + f2);

        /**
         * 通过反射对成员变量进行取值和赋值
         */
        //stu3通过反射方式已经创建对象
        Field nameF = c1.getDeclaredField("name");
        Field ageF = c1.getDeclaredField("age");
        nameF.setAccessible(true);
        ageF.setAccessible(true);
        //取值
        System.out.println("stu3.name = " + nameF.get(stu3));
        System.out.println("stu3.age = " + ageF.get(stu3));
        //赋值
        nameF.set(stu3,"zhaoliu1");
        ageF.set(stu3,12);
        //取值(验证)
        //System.out.println("stu3.name = " + nameF.get(stu3));
        //System.out.println("stu3.age = " + ageF.get(stu3));

        /**
         * 通过反射获取类的成员方法
         */
        //获取一个名称叫methodName，参数类型为int的方法
        Method m = c1.getMethod("methodName",int.class);
        m.invoke(stu3,3);//传参并调用methodName方法
        System.out.println("stu3.age = " + ageF.get(stu3));


    }
}

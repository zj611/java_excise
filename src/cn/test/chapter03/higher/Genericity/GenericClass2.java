package cn.test.chapter03.higher.Genericity;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/8/21
 */
public class GenericClass2 {
    public <T> T get(T t){
        return t;
    }

    public <M> void print(M m){
        System.out.println(m);
    }

}

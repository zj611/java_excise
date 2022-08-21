package cn.test.chapter03.higher.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/8/21
 */
public class ArrayListAndLinkedListTest {

    public static void main(String[] args) {
        /**
         * ArrayList是最常用的集合，元素类型都是Object类型，可以存储任意类型的数据；
         * 优点：每个ArrayList元素都有索引，查询效率很高；
         * 缺点：底层是数组，每次增删元素时，会引起数组的变动，导致增删效率比较低；
         */
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("123");
        arrayList.add(1,"234");

        //foreach方式（推荐）
        for (String s : arrayList) {
            System.out.println((String) s);
        }

        //迭代器方式（不推荐）
        Iterator it = arrayList.iterator();
        while(it.hasNext()){
            System.out.println((String) it.next());
        }


        /**
         * 双向列表增删效率很高，但查询效率低，走遍历
         */
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.addFirst("张三");
        linkedList.addFirst("李四");
        linkedList.addLast("王五");
        for (Object s : linkedList) {
            System.out.println((String) s);
        }
    }

}

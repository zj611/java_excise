package cn.test.chapter03.higher.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author zhangjun
 * @version 1.0
 * @date 2022/8/21
 */
public class HashMapAndHashTableTest {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("中国人","汉语");
        map.put("美国人","英语");
        System.out.println(map);

        //map遍历方式1：通过集合的所有键
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = (String) map.get(key);
            System.out.println(key + " " + value);
        }

        //map遍历方式2：通过内部类Entry的键值对的方式
        Set<Map.Entry<String, String>> entry = map.entrySet();
        for (Object o : entry) {
            Map.Entry<String,String> en = (Map.Entry) o;
            String key = (String) en.getKey();
            String value = (String) en.getValue();
            System.out.println(key + " " + value);
        }

    }
}

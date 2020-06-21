package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author maoyu
 * @date 2020/6/21 14:46
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("galgadot","maoge");
        map.put("taylor","mengying");
        map.put("swift","xiaomi");
        map.put("null","null");
        map.replace("swift","lihaixuan");
        //map.keySet
        for (String key :map.keySet()
             ) {
            System.out.println("map所有的key:##########"+key+",map的值："+map.get(key));
        }

        //通过map.entrySet使用iterator
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println("key值为#######："+ next.getKey()+"----------value值为：#######"+next.getValue());
        }

        //使用map.entrySet 这种适用于容量大的时候 推荐使用
        for (Map.Entry<String,String > entry : map.entrySet()
             ) {
            System.out.println("entry的key:"+entry.getKey()+"......"+"entry的value:"+entry.getValue());
        }

        //map.values 获取到所有的key的值，此时不能遍历所有的key
        for (String s : map.values()){
            System.out.println("value值："+ s);
        }

        boolean maoge = map.containsKey("maoge");
        boolean containsValue = map.containsValue("maoge");
        System.out.println("map中是否包含maoge:"+maoge);
        System.out.println("map的value中是否包含maoge:"+containsValue);

        int size = map.size();
        System.out.println("这个map中元素的个数"+size);

        //添加一个相同的map的值到另一个map中
        Map<String,String> map1 = new HashMap<>();
        map1.putAll(map);
        for (String s:map1.keySet()
             ) {
            System.out.println("新map中元素："+s+",值为"+map1.get(s));
        }
    }
}

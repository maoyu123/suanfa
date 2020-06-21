package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author maoyu
 * @date 2020/6/21 16:10
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet();
        set.add("1");
        set.add("key");
        set.add("wangshunda");
        set.add(null);
        for (String s : set){
            System.out.println(s);
        }
        set.clear();
        boolean empty = set.isEmpty();
        System.out.println("set集合是否为空"+ empty);

        Set<Integer> setInteger = new TreeSet<>();
        int a=20;
        int b=2;
        int c=1;
        setInteger.add(a);
        setInteger.add(b);
        setInteger.add(c);
        for (Integer i:setInteger
             ) {
            System.out.println(i);
        }
        Iterator<Integer> iterator = setInteger.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}

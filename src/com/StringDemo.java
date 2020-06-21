package com;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author maoyu
 * @date 2020/6/21 16:39
 */
public class StringDemo {
    /**
     * 随机写出一个字符串，提取出其中的数字，并将数字按顺序排列，去重
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个带数字的字符串");
        String s = sc.next();
//        String s = "阿斯蒂芬asdf1c3124$";
        s = s.replaceAll("[^0-9]", "");
        System.out.println(s);
        Set<String> treeSet = new TreeSet<>();
        String[] split = s.split("");
        for (String str:split
             ) {
            treeSet.add(str);
        }
        System.out.println(treeSet);
        StringBuffer sb = new StringBuffer();
        for (String str : treeSet){
            sb.append(str);
        }
        System.out.println(sb);

    }
}

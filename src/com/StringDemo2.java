package com;

import java.util.Scanner;

/**
 * @author maoyu
 * @date 2020/6/21 17:23
 */
public class StringDemo2 {
    /**
     * 随机输入一个字符串，提取出里边所有的字母，输出展示出来
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请随机输入一个带字母的字符串");
        String next = sc.next();
        String s = next.replaceAll("[^a-z^A-Z]", "");
        String[] split = s.split("");
        StringBuffer sb = new StringBuffer();
        for (String str :split
             ) {
            sb.append(str);
        }
        System.out.println("提取到的字母串为："+sb);
    }
}

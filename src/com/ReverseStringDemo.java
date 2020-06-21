package com;

import java.util.Scanner;

/**
 * 输入一个字符串abc,输出cba
 */
public class ReverseStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Reverse(s);
    }

    private static String Reverse(String s) {
        String str = "";
        for (int i=0;i<s.length();i++){
            str = str +s.charAt(s.length()-i-1);
            System.out.println("str="+str);
        }


        return str;

    }

}

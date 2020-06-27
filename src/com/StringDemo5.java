package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author maoyu
 * @date 2020/6/27 18:34
 */
public class StringDemo5 {
    //字符串逆序
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuffer sb = new StringBuffer();
        for (int i=input.length()-1;i>=0;i--){
            sb.append(input.charAt(i));
        }
        System.out.println(sb.toString());

    }
}

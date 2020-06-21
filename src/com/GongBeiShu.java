package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GongBeiShu {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String[] split = s.split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        System.out.println("最小公倍数：" + gongBeiShu(a, b));
    }

    /**
     * 给出两个数字，输出最小公倍数
     *
     * @param a
     * @param b
     * @return
     */
    public static int gongBeiShu(int a, int b) {
        int max = a > b ? a : b;
        for (int i = max; ; i++) {
            if ((i % a == 0) && (i % b == 0)) {
                return i;
            }
        }
    }
}

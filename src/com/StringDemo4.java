package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author maoyu
 * @date 2020/6/27 17:33
 */
public class StringDemo4 {
    /**
     * 连续输入字符串(输出次数为N,字符串长度小于100)，请按长度为8拆分每个字符串后输出到新的字符串数组，
     * 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
     * 首先输入一个整数，为要输入的字符串个数。
     * 例如：
     * 输入：2
     * abc
     * 12345789
     * 输出：abc00000
     * 12345678
     * 90000000
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine())!= null){
            int count = Integer.parseInt(input);
            StringBuffer sb = new StringBuffer();
            for (int i =0; i<count;i++){
                input = br.readLine();
                int start = 0;
                int end = 8;
                int length = input.length()/8;

                if(input.length()%8 > 0){
                    ++length;
                }
                for (int j=0; j<length;j++){
                    end = end>input.length()?input.length():end;
                    String current =input.substring(start,end);
                    sb.append(current);
                    if(current.length()<8){
                        for(int k=0;k<8-current.length();k++){
                            sb.append("0");
                        }
                    }
                    sb.append("\n");
                    start += 8;
                    end += 8;
                }
            }
            System.out.println(sb.toString().trim());
        }
    }
}

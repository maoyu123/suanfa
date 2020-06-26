package com;

/**
 * @author maoyu
 * @date 2020/6/26 16:21
 */
public class StringDemo3 {
    public static void main(String[] args) {
        String [] strs = {"taylor","tarlor","tom","tom","galgadot","maoyu","maoyu","maoyu"};
        CountUtils.printMap(CountUtils.account(strs));
    }
}

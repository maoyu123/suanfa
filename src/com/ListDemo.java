package com;

import java.util.ArrayList;
import java.util.List;

/**
 * @author maoyu
 * @date 2020/6/21 11:20
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> arrayList =new ArrayList();
        arrayList.add("galgadot");
        arrayList.add("taylor");
        arrayList.add("swift");
        arrayList.add("maoyu");
        for (String list:arrayList) {
            System.out.println("foreach遍历结果："+list);
        }
        arrayList.set(3,"江梦莹");

        String girlFriends = "王露";
        if(arrayList.contains(girlFriends)){
            System.out.println(girlFriends+"是我女朋友");
        }else{
            System.out.println("不开森");
        }
        arrayList.add(1,"白龙马");
        System.out.println("江梦莹在数组中的索引为："+arrayList.indexOf("江梦莹"));
        for(int i=0;i<arrayList.size();i++){
            System.out.println("普通遍历结果："+arrayList.get(i));
        }

        List<String> strings1 = arrayList.subList(0, 2);
        for (String newStr:strings1) {
            System.out.println("截取得到新的数组1为:"+newStr);
        }
        List<String> strings2 = arrayList.subList(2, 4);
        for (String newStr:strings2) {
            System.out.println("截取得到新的数组2为:"+newStr);
        }
        //将集合转换为数组
        Object[] objects = strings1.toArray();
        String s = strings1.toString();

    }
}

package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author maoyu
 * @date 2020/6/26 16:24
 */
public class CountUtils {
    public static Map<String,Integer> account(String [] strs){
        Map<String,Integer> map = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            if(map.containsKey(strs[i])){
                map.put(strs[i],map.get(strs[i])+1);
            }else{
                map.put(strs[i],1);
            }
        }
        return map;
    }

    public static void printMap(Map<String,Integer> map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String,Integer> entry:entries
             ) {
            System.out.println(entry.getKey()+"出现的次数："+entry.getValue());
        }
    }
}

package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author maoyu
 * @date 2020/6/27 19:12
 * 人民币转大写
 */
public class RMBDemo {
    private static String charAt(String str,int index){
        if(str == null || index >=str.length() || index < 0){
            return "";
        }
        return str.substring(index,index+1);
    }

    public static void main(String[] args) throws IOException {
        Map<String,String> map = new HashMap<>(10);
        map.put("0","零");
        map.put("1","壹");
        map.put("2","贰");
        map.put("3","叁");
        map.put("4","肆");
        map.put("5","伍");
        map.put("6","陆");
        map.put("7","柒");
        map.put("8","捌");
        map.put("9","玖");
        String [] unitStr = {"拾","百","千","万","亿"};
        String [] moneyStr = {"元","角","分","整"};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while((line = br.readLine()) != null){
            String[] inputArr = line.split("\\.");
            StringBuilder rmb= new StringBuilder("人民币");
            String part1 = inputArr[0];
            String part2 = inputArr[1];
            if(!part1.equals("0")){
                for (int i =0;i< part1.length();i++){
                    int unitLen = part1.length()-i-1;
                    String number = map.get(charAt(part1, i));
                    String unit = "";
                    if(unitLen == 0){
                        unit = moneyStr[2];
                    }else if (unitLen == 1){
                        unit=unitStr[0];
                    }else if (unitLen == 2){
                        unit=unitStr[1];
                    }else if (unitLen == 3){
                        unit=unitStr[2];
                    }else if (unitLen >= 4 && unitLen < 8){
                        unit=unitStr[3];
                    }else if (unitLen >= 8){
                        unit=unitStr[4];
                    }

                    if(part1.length() == 2 && i==0){
                        rmb.append(unit);
                    }else {
                        rmb.append(number+unit);
                    }

                }
            }
            if(!part2.equals("00")){
                for (int j = 0;j<part2.length();j++){
                    String number2 = map.get(charAt(part2, j));
                    if(number2.equals("零")){
                        continue;
                    }
                   String unit2 = "";
                    if(j ==0){
                         unit2 = moneyStr[1];
                    }else if(j == 1) {
                        unit2 = moneyStr[0];
                    }
                    rmb.append(number2+unit2);
                }
            }else{
                rmb.append("整");
            }
            System.out.println(rmb);
        }
    }
}

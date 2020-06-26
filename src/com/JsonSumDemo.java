package com;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import javabean.Student;


/**
 * @author maoyu
 * @date 2020/6/22 9:10
 */
public class JsonSumDemo {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"张三\",\"gender\":\"男\",\"isStudent\" : true,\"age\" : 18}";
        JSONObject jsonObject = (JSONObject) JSONObject.parse(jsonString);
        Object o = jsonObject.get("name");
        System.out.println(jsonObject.size());

        String jsonString1 = "{\"student\":{\"name\":\"张三\",\"age\":18}}";
        JSONObject obj = (JSONObject)JSONObject.parse(jsonString1);
        JSONObject student = obj.getJSONObject("student");
        String studentString = student.toJSONString();

    }
}

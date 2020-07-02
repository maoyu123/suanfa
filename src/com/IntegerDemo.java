package com;

/**
 * @author maoyu
 * @date 2020/7/2 11:11
 */
public class IntegerDemo {
    public static void main(String[] args) {
        String a=new String("abc");
        String b="abc";
        //== 只要对比连个引用地址是否相同
        //equals只要判断值是否相等
        //Integer类型 在-126~+127之间是数字，大于这个范围的是对象
        boolean f1 =(a==b);
        boolean f2 = (a.equals(b));
        System.out.println("f1:"+f1);
        System.out.println("f2:"+f2);
        Integer a1=127;
        Integer a2=new Integer(127);
        System.out.println("a1"+(a1.equals(a2)));

        Integer a3=1271;
        Integer a4=new Integer(1271);
        System.out.println("a3"+(a3.equals(a4)));
        System.out.println("a3"+(a3==a4));

    }
}

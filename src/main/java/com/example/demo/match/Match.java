package com.example.demo.match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match {

    /*public static void main(String[] args) {

        String REGX = "(\\d{4})-([0-1]\\d)-([0-3]\\d)\\s([0-5]\\d):([0-5]\\d):([0-5]\\d)";
        String REGX1 = "[0-9]{4}-[0-1]{2}-[0-3]{2}";
        //String REGX2 = "(\\d{4}-\\d{2}-\\d{2})";

        //String str = "2019-10-12 11:11:11-2020-10-12 11:11:11";
        String str1 = "2019-10-12 11:11:11";
        Pattern pattern = Pattern.compile(REGX1);
       // Matcher m = pattern.matcher(str);
        Matcher m1 = pattern.matcher(str1);

        //System.out.println(m.matches());
        System.out.println(m1.matches());
        //System.out.println(m.find());
       // System.out.println(m.group(0));
        *//*while(m.find()) {
            System.out.println(m.group());
        }

        while(m1.find()){
            System.out.println(m1.group());
        }*//*
    }*/

    public static void main(String args[]){
        String str = "1983-07-27 00:00:00-2019-09-11 00:00:00" ;        // 指定好一个日期格式的字符串
        String str1 = "2019-10-12 11:11:11-2020-10-12 11:11:11";
        String pat = "(\\d{4}-\\d{2}-\\d{2})\\s(\\d{2}:\\d{2}:\\d{2})" ;    // 指定好正则表达式
        Pattern p = Pattern.compile(pat) ;    // 实例化Pattern类
        Matcher m = p.matcher(str1) ;    // 实例化Matcher类

        /*while(m.find()){
            System.out.println(m.group());
        }*/

        if(m.find()) {
            System.out.println(m.group());
        }

        /*if(m.matches()){        // 进行验证的匹配，使用正则
            System.out.println("日期格式合法！") ;
            while(m.find()){
                System.out.println(m.group());
            }
        }else{
            System.out.println("日期格式不合法！") ;
        }*/
    }

}

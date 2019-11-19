package com.example.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        /* Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("1")) {
                iterator.remove();
            }
        }*/

        for (String item : list) {
            if ("2".equals(item)) {
                list.remove(item);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

       /* List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
//正常循环
        for (int i = 0; i < list.size(); i++) {
           System.out.println("i的值:" + i + " 对应的数字:" + list.get(i));
        }
        System.out.println("没有remove前list的项:"+list.size());
//边循环边删除
        for (int i = 0; i < list.size(); i++) {
           System.out.println("i的值:" + i + " 对应的数字:" + list.get(i));
           if(list.get(i) == 3) list.remove(list.get(i));//删除list的第四项
        }
        System.out.println("remove后list的项:"+list.size());
        System.out.println("==========remove后的list==========");
        for (int i = 0; i < list.size(); i++) {
                System.out.println("i的值:" + i + " 对应的数字:" + list.get(i));
        }
*/
    }


}

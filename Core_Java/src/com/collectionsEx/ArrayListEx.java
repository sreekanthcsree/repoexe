package com.collectionsEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

    public static void main(String[] args){

        List<Integer> list = new ArrayList<Integer>();

        list.add(60);
        list.add(70);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(40);
        list.add(60);

        System.out.println(list);
        System.out.println(list.size());
       // System.out.println(list.remove(5));
       // System.out.println(list);
        list.remove(Integer.valueOf(30));
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.contains(60));//true
        System.out.println(list.contains(90));//false
        System.out.println(list.indexOf(60));//to find the index number
        System.out.println(list.get(6));//to find the 6th index mumber

    }
}

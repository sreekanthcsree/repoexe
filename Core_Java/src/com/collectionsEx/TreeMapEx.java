package com.collectionsEx;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

    public static void main(String[] args) {

        Map<Integer,String> map = new TreeMap<>();

        map.put(101,"Kishore");
        map.put(103,"Durga");
        map.put(102,"Ramlal");
        map.put(105,"Sunil");
        map.put(107,"Satheesh");
        map.put(104,"Nani");
        map.put(104,"Duplicate");

        System.out.println(map);

    }
}

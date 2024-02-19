package com.collectionsEx;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

    public static void main(String[] args) {

        Map<Integer,String> map = new LinkedHashMap<>();

        map.put(100,"Kishore");
        map.put(101,"Durga");
        map.put(102,"Ramlal");
        map.put(103,"Raju");
        map.put(105,"Pushparaj");
        System.out.println(map);

        map.putIfAbsent(104,"Nani");
        System.out.println(map);

    }
}

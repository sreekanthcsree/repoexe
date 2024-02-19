package com.collectionsEx;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableEx {

    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        map.put(null,null);
        map.put(null,null);

        System.out.println(map);

        Hashtable<String,String> ht = new Hashtable<>();
        ht.put(null,null);
        ht.put(null,null);
        System.out.println(ht);//NullPointerException

    }
}

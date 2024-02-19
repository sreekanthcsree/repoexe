package com.collectionsEx;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

    public static void main(String[] args) {
        Set<String> set = new HashSet();

        set.add("Kishore");
        set.add("Durga");
        set.add("Sreekanth");
        set.add("Kishore");
        set.add("Ramlal");
        set.add("Nani");
        set.add("Raju");
        System.out.println(set);
    }
}

package com.collectionsEx;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();

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

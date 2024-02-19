package com.collectionsEx;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>();
        //Set<String> set = new TreeSet<String>(Collections.reverseOrder());


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

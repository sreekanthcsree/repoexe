package com.collectionsEx;

import java.util.ArrayDeque;

public class ArrayDequeEx {

    public static void main(String[] args) {

        ArrayDeque<String> ad = new ArrayDeque<String>();

        ad.push("Sreekanth");
        ad.push("Kishore");
        ad.push("Ajith");
        ad.push("Pushparaj");
        ad.push("Ramlal");
        ad.push("Nani");

        System.out.println(ad);
        System.out.println(ad.peek());
        System.out.println(ad.pop());
        System.out.println(ad);
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        System.out.println(ad.poll());//same as pop() method..remove 1st value
        System.out.println(ad);
    }
}

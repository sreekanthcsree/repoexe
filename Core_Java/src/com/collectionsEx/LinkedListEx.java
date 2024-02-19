package com.collectionsEx;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

    public static void main(String[] args) {

        List<String> list1 = new LinkedList<String>();
        LinkedList<String> list=new LinkedList<String>();

        list.add("Sreekanth");
        list.add("Ajith");
        list.add("Ramlal");
        list.add("Pushparaj");
        list.add("Satheesh");
        list.add("Nani");
        list.add("Raju");
        list.add(1,"Durga");

        list1.add("Kishore");
        list1.add("Prakash");

        list.addAll(list1);

        System.out.println(list);
        System.out.println(list.size());
        list.addFirst("Sunil");
        list.addLast("Nagaraju");
        System.out.println(list);
        System.out.println(list.indexOf("Sreekanth"));//find the index no
        System.out.println(list.lastIndexOf("Raju"));//find the index no
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list.removeAll(list));//it returns boolean value true
        System.out.println(list);//[]

    }
}

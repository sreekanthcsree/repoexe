package com.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListStreamsOneEx {

    public static void main(String[] args){

        List<String> list = Arrays.asList("anil","sreekanth","sreekanth","ajith","pushparaj","nani","ramlal","satheesh","raju");
        System.out.println(list);

       List<String> list1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);

        //using the lambda expression
        list.stream().distinct().forEach(x-> System.out.print(x+" "));
        System.out.println(list1+" ");

       Long l = list1.stream().count();
        System.out.println("List count : "+l);

       Set<String> set = list1.stream().collect(Collectors.toSet());
        System.out.println("Set values : "+set);

        List<String> ls =list.stream().distinct().filter(str->str.toLowerCase().startsWith("s")).collect(Collectors.toList());
        System.out.println(ls);

    }
}

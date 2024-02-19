package com.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListStreamsEx {

    public static void main(String... args){
       List<String> strings = Arrays.asList("anil","sreekanth","sreekanth","ajith","pushparaj","nani","ramlal","satheesh","raju");
        System.out.println(strings);

        //distinct ->to remove the duplicate values
       List<String> strings1 =  strings.stream().distinct().collect(Collectors.toList());
        System.out.println(strings1);

    }
}

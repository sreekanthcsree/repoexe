package com.java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIEx {

    public static void main(String[] args){

        ArrayList<Integer> al =new ArrayList<>(Arrays.asList(10,20,40,60,78,65,90));
        System.out.println("List of values : "+al);

       //where number greater than 30
       List<Integer> list = al.stream().filter(i->i>30).collect(Collectors.toList());
        System.out.println("number greater than 30 : "+list);

        //we are adding 5 to each element
        List<Integer> list1 = list.stream().map(i->i+10).collect(Collectors.toList());
        System.out.println("we are adding 5 to each element : "+list1);

        //Terminal Operations
        //1.toArray method
        Stream<Integer> s = Stream.of(2,4,6,8,10);
       Object[] o = s.toArray();
       for(Object a:o){
           System.out.print(a+" ");
       }

       //2.Count method
        Stream<Integer> s1 = Stream.of(2,4,6,8,10);
       Long l = s1.count();
        System.out.println("Count Method : "+l);

        //3.forEach method
        Stream<Integer> s2 = Stream.of(2,4,6,8,10);
        s2.forEach(x-> System.out.print(x+" "));

        //4.min() , max()
        Stream<Integer> s3 = Stream.of(2,4,6,8,10);
       Optional<Integer> opt = s3.min(((o1, o2) -> o1.compareTo(o2)));
        System.out.println("min value : "+opt.get());

        Stream<Integer> s4 = Stream.of(2,4,6,8,10);
        Optional<Integer> opt1 = s4.max(((o1, o2) -> o1.compareTo(o2)));
        System.out.println("max value : "+opt1.get());

        //5.anyMatch()
       List<Integer> alist = Arrays.asList(10,20,50,80,90,30);
      boolean b = alist.stream().anyMatch(i->i==30);
        System.out.println("antMatch method : "+b);

        //6.allMatch()
        List<Integer> alist1 = Arrays.asList(10,20,50,80,91,30);
       Boolean b1= alist1.stream().allMatch(y-> y%2==0);
        System.out.println("allMatch method : "+b1);
    }
}

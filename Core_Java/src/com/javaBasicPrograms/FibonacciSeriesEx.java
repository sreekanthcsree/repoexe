package com.javaBasicPrograms;

public class FibonacciSeriesEx {


    //Fibonacci Series :next number is the sum of previous two numbers, eg :0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    //The first two numbers of fibonacci series are 0 and 1

    public static void main(String[] args){

        int n1=0,n2=1,count=5,n3;
        System.out.println(n1+" "+n2);

        for(int i=2;i<=count;i++){

            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}

package com.abhi;

public class SingleElement {

    public static int find(int[] arr){
        int r=0;
        for(int i:arr){
            r ^=i;
        }
        return r;
    }

    public static void main(String[] args) {
        int [] x={1, 1, 2, 2, 3, 3, 4,8, 4, 5, 5, 6, 6, 7, 7};
        int r=find(x);
        System.out.println(r);

    }
}
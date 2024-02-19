package com.oopsEx;

public class DynamicPolyOne extends DynamicPoly{

    public void sree(int i,String n){
        super.sree(154," Prakash");
        String m=i+n;
        System.out.println("Child or Sub class : "+m);
    }
    public static void main(String[] args){
        DynamicPolyOne dpo=new DynamicPolyOne();
        dpo.m1();
        dpo.sree(153," Sreekanth");
    }
}

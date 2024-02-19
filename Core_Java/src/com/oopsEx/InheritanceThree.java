package com.oopsEx;

public class InheritanceThree extends InheritanceTwo{

    public void rem(int a,int b){
        int c=a%b;
        System.out.println("Remainder of two numbers is : "+c);

    }
    public static void main(String[] args){
        InheritanceThree it=new InheritanceThree();
        it.add(10,20);
        it.sub(20,10);
        it.mul(20,30);
        it.div(20,10);
        it.rem(30,10);

    }
}

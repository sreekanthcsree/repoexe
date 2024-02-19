package com.java8Features;



interface Addable{

    int add(int a , int b);
}

class AddableImpl implements Addable{


    @Override
    public int add(int a, int b) {
        return (a+b);
    }
}

public class LambdaParamaters {

    public static void main(String[] args) {

        Addable addable = (a,b)->(a+b);
        int result = addable.add(10,40);
        System.out.println(result);
    }
}

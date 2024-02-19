package com.oopsEx;

public class FinalInterfaceEx implements Pen,Paper {

    @Override
    public void show() {
        System.out.println("this is show method");
    }

    @Override
    public void print() {
        System.out.println("this is print method");

    }

    public static void main(String[] args) {
        FinalInterfaceEx fie=new FinalInterfaceEx();
        fie.print();
        fie.show();
    }
}

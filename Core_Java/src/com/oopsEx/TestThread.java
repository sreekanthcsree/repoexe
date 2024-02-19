package com.oopsEx;

public class TestThread {

    public static void main(String[] args) {
        Table table=new Table();

        ThreadOne to=new ThreadOne(table);
        ThreadTwo tw=new ThreadTwo(table);

        to.run();
        tw.run();
    }
}

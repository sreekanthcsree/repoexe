package com.oopsEx;

public class ThreadOne extends Thread {

    Table table;
    public ThreadOne(Table table){
        this.table=table;
    }
    public void run(){
        table.multi(4);
    }
}

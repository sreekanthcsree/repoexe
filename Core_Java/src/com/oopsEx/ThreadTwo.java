package com.oopsEx;

public class ThreadTwo extends  Thread{

    Table table;
    public ThreadTwo(Table table){
        this.table=table;
    }
    public void run(){
        table.multi(10);
    }
}

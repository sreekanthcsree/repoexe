package com.oopsEx;

public class Table {

    public synchronized void multi(int j){
        for(int i=0;i<=10;i++){
            System.out.println(j+"*"+i+"="+i*j);
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

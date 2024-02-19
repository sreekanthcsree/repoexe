package com.controlStatements;

public class ForEachLoopEx {

    //this is ForEachLoop Example
    // for(data_type ref_variabel:ArrayName){
    //     sop(ref_varia);

    public static void main(String[] args) {
        int a[]= {10,20,30,40,50};
        for(int i:a) {
            System.out.println(i);
        }
        System.out.println("------------------------------>");
        String s[]= {"sree","Ajith","Ramlal","Satheesh"};
        for(String j:s) {
            System.out.println(j);
        }
    }
}

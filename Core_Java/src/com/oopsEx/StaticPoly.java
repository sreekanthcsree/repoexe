package com.oopsEx;

public class StaticPoly {

    public void add(int a,short b){
        int k=a+b;
        System.out.println(k);
    }
    public void add(int a,float b){
        float k=a+b;
        System.out.println(k);
    }
    public void add(float a,double b){
        double k=a+b;
        System.out.println(k);
    }
    public void add(char a,String b){
        String s=a+b;
        System.out.println(s);
    }
    public void add(int id,String name){
        String k=id+name;
        System.out.println(k);
    }
    public void add(String name,double salary ){
    String k=name+salary;
        System.out.println(k);
    }
    public void add(int id,String name,long PNo){
        String k=id+name+PNo;
        System.out.println(k);
    }
    public static void main(String[] args){
        StaticPoly sp=new StaticPoly();
        sp.add(10,20.45f);
        sp.add(10,5);
        sp.add(30.45f, 46.56);
        sp.add('C'," Sreekanth");
        sp.add(153," Sreekanth");
        sp.add("Sreekanth ",15000.45);
        sp.add(153," Sreekanth", 9880016508l);

    }
}

package com.dextris;

public class MarksEx {

   int telugu_marks=40;

   public void marks(){
       if(telugu_marks>50){
           System.out.println("Greater than 50 marks : ");
       }else{
           System.out.println("no result...!");
       }
   }

    public static void main(String[] args) {
        MarksEx ex = new MarksEx();
        ex.marks();
    }
}

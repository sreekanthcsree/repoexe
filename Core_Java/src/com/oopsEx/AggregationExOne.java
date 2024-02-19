package com.oopsEx;

public class AggregationExOne {

    int dno;
    String hName;
    AggregationEx ae;

  public AggregationExOne(int dno,String hName,AggregationEx ae){
      this.dno=dno;
      this.hName=hName;
      this.ae=ae;
  }
  public void display(){
      System.out.println("Door No : "+dno+" House Name : "+hName+" Student Id : "+ae.id+" Student Name : "+ae.name+" Phone no : "+ae.phno);
  }

    public static void main(String[] args) {
        AggregationEx add=new AggregationEx(153,"Sreekanth",988016508l);
        AggregationExOne aeo=new AggregationExOne(23,"Sri krishna",add);

        aeo.display();
    }

}

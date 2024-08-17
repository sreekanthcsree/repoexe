package com.abstarction;

public class Encasp {
	
	private int eid;
	private String eName;
	
	public Encasp(int e,String eN) {
		this.eid=e;
		this.eName=eN;
	}
	public int geteId() {
		return eid;
	}
	public String geteName() {
		return eName;
	}
	@Override
	public String toString() {
		return "Encasp [eid=" + eid + ", eName=" + eName + "]";
	}
	public String display() {
		return "Id :"+eid+" Ename : "+eName;
	}
	public static void main(String[] args) {
		Encasp ex = new Encasp(1, "Thualsi");
		System.out.println("eid : "+ex.eid+" EName : "+ex.eName);
		System.out.println("By using toString() : "+ex.toString());
		System.out.println(ex.display());
	}
	
}

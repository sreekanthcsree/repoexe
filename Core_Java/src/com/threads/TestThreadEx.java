package com.threads;

public class TestThreadEx {
	
	public static void main(String[] args) {
		ThreadEx ex = new ThreadEx();
		ThreadOne t1 = new ThreadOne(ex);
		ThreadTwo t2 = new ThreadTwo(ex);
		t1.start();
		t2.start();
	}

}

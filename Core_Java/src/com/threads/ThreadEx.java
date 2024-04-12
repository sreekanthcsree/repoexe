package com.threads;

public class ThreadEx {
	
	public synchronized void multi(int j) {
		for(int i=0;i<=10;i++) {
			System.out.println(j+"*"+i+"="+i*j);
			try {
				Thread.sleep(1000);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

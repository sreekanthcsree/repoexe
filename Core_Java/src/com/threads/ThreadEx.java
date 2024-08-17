package com.threads;

public class ThreadEx {
	
	public synchronized void multi(int j) {
		for(int i=1;i<=10;i++) {
			System.out.println(j+"*"+i+"="+i*j);
			try {
				Thread.sleep(200);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

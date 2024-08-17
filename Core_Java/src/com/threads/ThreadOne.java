package com.threads;

public class ThreadOne extends Thread{
	
	ThreadEx threadEx;

	public ThreadOne(ThreadEx threadEx) {
		this.threadEx = threadEx;
	}
	public void run() {
		threadEx.multi(12);
	}
	


}

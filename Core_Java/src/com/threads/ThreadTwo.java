package com.threads;

public class ThreadTwo extends Thread{
	
	ThreadEx threadEx;

	public ThreadTwo(ThreadEx threadEx) {
		this.threadEx = threadEx;
	}
	public void run() {
		threadEx.multi(8);
	}
	
}

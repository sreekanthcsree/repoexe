package com.arrays;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;


public class QueueDemo {
	
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<String> pq = new PriorityQueue<>();
		q.add(111);
		q.add(112);
		q.add(117);
		q.add(118);
		q.add(110);
		q.add(109);
		q.add(105);
		q.add(100);
		
		
		pq.offer("Strimg");
		//pq.offer(null);
		
		System.out.println(q);
		//System.out.println(pq);
	}

}

package com.collectionsEx;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

    public static void main(String[] args) {

        Queue<Integer> q = new PriorityQueue<Integer>();
        PriorityQueue<String> pq = new PriorityQueue<String>();

        q.add(40);
        q.add(30);
        q.add(10);
        q.add(20);
        q.add(80);
        q.add(70);
        q.add(60);

        System.out.println(q);

        pq.add("Kishore");
        pq.add("Ramlal");
        pq.add("Anil");
        pq.add("Durga");
        pq.add("Pushparaj");
        System.out.println(pq);
    }
}

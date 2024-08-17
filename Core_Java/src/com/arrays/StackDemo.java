package com.arrays;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackDemo {
	
	public static void main(String[] args) {
		//push(),peek(),pop();
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(30);
		st.push(20);
		st.push(50);
		st.push(80);
		st.push(5);
		
		System.out.println(st);
		System.out.println(st.peek());//It will print the top most value
		System.out.println(st.pop());//It will remove the top most value
		System.out.println(st);
	}

}

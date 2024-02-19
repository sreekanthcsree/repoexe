package com.collectionsEx;

import java.util.List;
import java.util.Stack;

public class StackEx {

    public static void main(String[] args) {

        List<Integer> vc = new Stack<Integer>();
        Stack<String> st = new Stack<String>();

        vc.add(10);
        vc.add(20);
        vc.add(30);
        vc.add(50);
        vc.add(40);

        st.push("Ajith");
        st.push("Kishore");
        st.push("Ramlal");
        st.push("Nani");
        st.push("Pushparaj");
        st.push("Nani");

        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.indexOf("Nani"));
        System.out.println(st.peek());//top most value
        System.out.println(st.pop());//to remove the last inserted value
        System.out.println(st);
        System.out.println(st.removeAll(st));//true
        System.out.println(st);//[]
        System.out.println(vc);
    }
}

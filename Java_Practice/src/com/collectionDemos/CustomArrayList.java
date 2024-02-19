package com.collectionDemos;

import java.util.Arrays;

public class CustomArrayList<E> {
	
private static final int INITIAL_CAPACITY = 10;
	
	private int SIZE = 0;
	private final int BUFFER_SIZE = 1;
	
	private Object[] elementsData = {};
	
	
	public CustomArrayList() {
		elementsData = new Object[INITIAL_CAPACITY];
	}
	
	
	public int findCapacity() {
		return elementsData.length;
	}
	
	public int size() {
		return SIZE;
	}
	
	public void add(E e) {
		if(SIZE == elementsData.length) {
			ensureCapacity();
		}else {
			
			elementsData[SIZE++]= e;
			
		}
		
	}
	
	public void display() {
		for(int i =0; i<elementsData.length;i++) {
			System.out.println(elementsData[i]);
		}
	}
	
	
	public E get(int index) {
		
		if(index < 0 || index>=SIZE) {
			
			throw new IndexOutOfBoundsException("index:"+index);
			
		}
		
		return (E) elementsData[index];
	}
	
	
	public Object remove(int index) {
        // if index is negative or greater than size of size, we throw
        // Exception.
     if (index < 0 || index >= SIZE) {
               throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                            + index);
        }

        Object removedElement = elementsData[index];
        for (int i = index; i < SIZE - 1; i++) {
        	elementsData[i] = elementsData[i + 1];
        }
        SIZE--; // reduce size of ArrayListCustom after removal of element.

        return removedElement;
 }
	
	

	private void ensureCapacity() {
		int newCapacity = elementsData.length * 2 + BUFFER_SIZE;
		
		elementsData  = Arrays.copyOf(elementsData, newCapacity);
		
		
	}


	public static void main(String[] args) {
		
		CustomArrayList clist = new CustomArrayList();
		
		System.out.println("Initial Capacity of Custom ArrayList:"+clist.findCapacity());
		System.out.println("Initial SIZE of Custom ArrayList:"+clist.size());
		
		clist.add("Apple");
		clist.add(10);
		clist.add("Apple");
		clist.add(10.14f);
		clist.add(1000.23d);
		clist.add(100000000L);
		clist.add("Apple");
		clist.add(10);
		clist.add("Apple");
		clist.add(10.14f);
		clist.add(1000.23d);
		clist.add(100000000L);
		clist.add(null);
		clist.add(null);
		
		
		System.out.println("After add() SIZE of Custom ArrayList:"+clist.size());
		System.out.println("Increased Capacity of Custom ArrayList:"+clist.findCapacity());
		
		clist.display();
		
		System.out.println("Index Value :"+clist.get(3));
		//System.out.println("Index Value :"+clist.get(-3));
		
		clist.remove(0);
		
		System.out.println("======remove==============");
		clist.display();
	}
}

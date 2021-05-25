package com.dailycoder.journaldev;

import java.util.LinkedList;


import com.sun.xml.bind.v2.runtime.reflect.ListIterator;

public class ReveseLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();

		ll.add(1);
		ll.add(2);
		ll.add(3);
		System.out.println(ll);
		
		 
		 System.out.println("List in reverse order ");
		 ll.descendingIterator().forEachRemaining(ele -> System.out.println(ele));
		 
		 System.out.println(" List iterator");
		 try {
			java.util.ListIterator<Integer> it = ll.listIterator();
			 while(it.hasNext()) {
				 System.out.println(""+it.next());
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com.batchtwoproject.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class BasicExamples {

	public static void main(String[] args) {
		
		System.out.println("Demo Example");
		ArrayList<String> arrayList = new ArrayList<String>();
		System.out.println("Size is: " + arrayList.size());
		arrayList.add("A");
		arrayList.add("A");
		arrayList.add(0, "S");
		arrayList.add(2, "D");
		arrayList.add("B");

		System.out.println(arrayList + " and Size is: " + arrayList.size());
		arrayList.remove(2);
		System.out.println(arrayList + " and Size is: " + arrayList.size());
		
		System.out.println("Initialize Example");
		ArrayList<Integer> list = new ArrayList<Integer>(Collections.nCopies(6,3));
		System.out.println("Lists are: " + list);
		
		//Loops
		System.out.println("For Loop");
		ArrayList<Integer> arrlist = new ArrayList<Integer>(){{
			add(89);
			add(87);
			add(12);
			add(98);
		}};
		for (int i = 0 ; i < arrlist.size() ; i++){
			System.out.println(arrlist.get(i));
		}
		System.out.println("Advance For Loop");
		for (int num : arrlist){
			System.out.println(num);
		}
		System.out.println("While Loop");
		int c = 0;
		while (c < arrlist.size()){
			System.out.println(arrlist.get(c));
			c++;
		}
		System.out.println("Iterator");
		Iterator iterate = arrlist.iterator();
		while (iterate.hasNext()){
			System.out.println(iterate.next());
		}

		System.out.println("Enumeration");
		Enumeration<String> e = Collections.enumeration(arrayList);
		while (e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}

}

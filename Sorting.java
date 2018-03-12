package com.batchtwoproject.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {

		System.out.println("String sorting");
		ArrayList<String> countries = new ArrayList<String>(){{
			add("Bangladesh");
			add("Australia");
			add("Korea");
			add("India");
			add("United States");
		}};
		Collections.sort(countries);
		System.out.println("Countries are after sorting:");
		for (String c : countries){
			System.out.println(c);
		}
		System.out.println("\n");
		System.out.println("Integer sorting");
		ArrayList<Integer> num = new ArrayList<Integer>(){{
			add(332);
			add(9876);
			add(23);
			add(32);
			add(990);
		}};
		Collections.sort(num);
		Collections.reverse(num);
		System.out.println("Numbers are after sorting:");
		for (Integer i : num){
			System.out.println(i);
		}
	}

}

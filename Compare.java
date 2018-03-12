package com.batchtwoproject.arraylist;

import java.util.ArrayList;

public class Compare {

	@SuppressWarnings("serial")
	public static void main(String[] args) {
		ArrayList<String> address1 = new ArrayList<String>(){{
			add("hi");
			add("how are you ");
			add("good morning");
			add("bye");
			add("good night");
		}};
		ArrayList<String> address2 = new ArrayList<String>(){{
			add("hello");
			add("how are you ");
			add("good evening");
			add("bye");
			add("good night");
		}};
		ArrayList<String> address3 = new ArrayList<String>();
		for (String temp : address1){
			address3.add(address2.contains(temp)?"Yes" : "No");
		}
		System.out.println(address3);
	}

}

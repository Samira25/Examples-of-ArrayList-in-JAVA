package com.batchtwoproject.arraylist;

public class Student{
	private String studentname;
	private int studentage;
	Student(String name, int age){
		this.studentname = name;
		this.studentage = age;
	}

	@Override
	public String toString() {
		return "Name is: " + this.studentname + " and Age is: " + this.studentage;
	}
}

package com.masai;

public class Student {
	
	int roll;
	String name;
	int marks;
	
	public void name(int a, String b, int c) {
		
		System.out.println("Roll is:"+a);
		System.out.println("Name is :"+b);
		System.out.println("Marks is:"+c);
	}
	
	
	public static void main(String[] args) {
		
		Student d1 = new Student();
		d1.name(25, "amit", 500);
		
	
	}

}

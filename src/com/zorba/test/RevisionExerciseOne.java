package com.zorba.test;


class PersonEx {
//	int age = 10;
//	String fullName = "pravesh Mahat";
	
	int age;
	String fullName;
	static String country  = "Nepal";
	
	public PersonEx(int age , String fn){
		this.age = age;
		this.fullName = fn;
	}
	
	public void walk() {
		System.out.println("I am walking today");
		System.out.println(this.fullName);
	}
	
	public static void Cal() {
		System.out.println("Straight out of class");
	}
	
	
	
	
}
public class RevisionExerciseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonEx praveshM = new PersonEx(38,"Praveshm");
		PersonEx mahatK = new PersonEx(39,"MahatK");
		
		System.out.println(mahatK.age);
		System.out.println(mahatK.fullName);
		
		mahatK.walk();
		PersonEx.Cal();
		System.out.println(PersonEx.country);

	}
}

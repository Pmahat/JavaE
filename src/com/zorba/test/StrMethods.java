package com.zorba.test;

public class StrMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String country = "India";
		int  q1 = country.length();
		System.out.println(q1);
		
		String q2 = country.toUpperCase();
		System.out.println(q2);
		System.out.println("Welcome to "+q2);
		
		String q3 = country.toLowerCase();
		System.out.println(q3);
		System.out.println("Welcome to "+q3);
		
		String fruit = "Apple";
		String s = "I like ";
		String joinedString = s.concat(fruit);
		System.out.println(joinedString);
		
		String q4 = fruit.concat(s);
		System.out.println(q4);
		

		String first = "hello";
		String second = "hello";
		boolean result = first.equals(second);
		System.out.println(result);

	}

}

package com.zorba.test;


class GrandFather {
	
	String firstName;
	String lastName;
	
	// constructor
	GrandFather(String firstName , String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void displayName() {
		System.out.println(this.firstName + " "+ this.lastName );
	}
	
}

class Father extends GrandFather {
	
	String fFirstName;
	// If parent is having constructor , we need to have constructor in child as well
	// In child constructor first line should be call to parent constructor using super
	
	Father(String firstName ,String lastName ,String fFirstName){
		super(firstName,lastName);
		this.fFirstName = fFirstName;
	}
	@Override
	public void displayName() {
		System.out.println(this.fFirstName + " "+ this.firstName + " "+this.lastName);
		super.displayName();
	}
	
}
// Class son 




public class InheritanceE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}

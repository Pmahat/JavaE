package com.zorba.practise;

class Animals{
	public void eat() {
		System.out.println("I eat all day");
	}
}

class Dog extends Animals{
	
	@Override
	public void eat() {
		System.out.println("I am eating my own food is dogs food");
		super.eat();
	}
}

public class InheritanceSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog puppy= new Dog();
		puppy.eat();

	}

}

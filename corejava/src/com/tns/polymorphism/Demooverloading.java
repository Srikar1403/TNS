package com.tns.polymorphism;

public class Demooverloading {

	void drink(int a, int b) {
		System.out.println(a+b);
	}
	
	void drink(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demooverloading d = new Demooverloading();
		d.drink(1, 5);
		d.drink(1, 5, 4);
	}

}

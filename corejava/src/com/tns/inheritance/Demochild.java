package com.tns.inheritance;

public class Demochild  extends Demoparent{
	int a=11;
	void drink() {
		System.out.println("Child");
	}
	void display() {
		System.out.println(super.a);
		System.out.println(a);
		
		drink();
		super.drink();

	}
	public static void main(String[] args) {
		Demochild dc= new Demochild();
		dc.display();
	}

}

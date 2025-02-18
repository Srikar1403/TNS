package com.tns.interfac;

public class Demointerface {
	public static void main(String[] args) {
		Nestedinterface n=new Nestedinterface();
		n.print();
		System.out.println(n.id);
		System.out.println(Nestedinterface.id);
	}

}
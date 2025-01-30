package com.tns.scannerdemo;
import java.util.Scanner;

public class Scannerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name:");
		String name = sc.nextLine();
		System.out.println(num + " " + name);
	}

}
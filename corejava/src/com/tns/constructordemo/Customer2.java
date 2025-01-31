package com.tns.constructordemo;

import java.util.Scanner;

public class Customer2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name = sc.next();
		
		System.out.println("Enter the Id:");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Address:");
		String address = sc.next();
		
		Customer1 c = new Customer1(name, id, address);
		
		c.setCustomername(name);
		c.setCustomerid(id);
		c.setCustomeraddress(address);
		System.out.println(c);
	}

}

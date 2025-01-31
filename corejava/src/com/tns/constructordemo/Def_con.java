package com.tns.constructordemo;

public class Def_con {
	Def_con(){
		System.out.println(1234);
	}
	Def_con(int a , String b){
		System.out.println("One parameter");
	}
	Def_con(int c){
		System.out.println("two parameter");
	}
	
	public static void main(String[] args) {
		Def_con d1= new Def_con(1);
		Def_con d2= new Def_con(123, "Srikar");
		Def_con d3= new Def_con();
		

	}

}

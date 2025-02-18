package com.tns.abstractmethod;

public abstract class Shape {
protected float area;
	
	
	abstract void calarea();
	
	void show() {
		System.out.println("area of shape "+area);
	}

	@Override
	public String toString() {
		return "Shape [area=" + area + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

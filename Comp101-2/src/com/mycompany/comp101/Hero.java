package com.mycompany.comp101;

public class Hero {
	public float strength;
	String name;
	
	public Hero(String name) {
		this.name = name;
	}
	
	public void go() {
		System.out.println(name + " is going.");
	}
}

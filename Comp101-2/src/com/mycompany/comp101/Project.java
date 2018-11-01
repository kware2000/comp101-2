package com.mycompany.comp101;

public class Project {
	
	public static void main(String[] args) {
		Hero h = new Hero("Tom Hero");
		Villian v = new Villian("Victor Villian");
		h.go();
		v.go();
		h.test = 4;
		Sub1 s1 = new Sub1();
		s1.go1();
		s1.go2();
		s1.go3();
		s1.goAbstract();
		s1.runs();

	}
}

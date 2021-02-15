package com.failed_questions;

public class DoesConstructorOfBaseClassExecutes {
	public static void main(String [] args) {
		D d= new D(); // executes C() then D()
		System.out.println("-----------------");
		C cd= new D(); //executes both
		System.out.println("-----------------");
		C c = new C(); //executes C() only
		System.out.println("-----------------");
		C ce = new E(); //executes C() then D() then E()
		System.out.println("-----------------");
		C cf= new F(); //C() then E() // then F()

	}

}


class C{
	public C() {
		System.out.println("Darth Vader: I am your father");
	}
}
class D extends C{
	public D() {
		System.out.println("Luke Skywalker: NooooooOOOOoooooooooo!!!!");
	}
}
class E extends D{
	public E() {
		System.out.println("Viewers: LOL");

	}
}
class F extends D{
	public F() {
		System.out.println("Film makers: Dumb people XDdxdD");

	}
}
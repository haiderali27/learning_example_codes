package com.failed_questions;

/***
 * A program which compares two Strings with equal content, 
 * the point is to find out whether two Strings variables save a value at same place or not.
 * Java uses immutable string and all same strings are stored 
 * in one location through the process called interning
 ***/


/**
 * https://stackoverflow.com/questions/15805578/will-two-strings-with-same-content-be-stored-in-the-same-memory-location
 * 
 * The process of combining identical strings is called "interning", 
 * and has been done for many years by lots of language compilers, but not always.
 *  The answer to the question, especially as expanded by @GennadyVanin--Novosibirsk, 
 *  depends on the language and the compiler implementation. 
 *  For Java, all constant strings are interned, as required by the Java Language 
 *  Specification. 
 *  But that's only constant string expressions, and only when they're compiled at 
 *  the same time. If you have two Java strings sufficiently separated in time and space 
 *  (e.g., compiled into separate JAR files), they will not be the same object. 
 *  Similarly, dynamically created Java strings (e.g., the output of various toString() methods) 
 *  won't be interned unless the method specifically requests it via String.intern(). 
 *  And yes, all uses of an interned string will share the same memory locations - 
 *  that's a big part of why strings are interned in the first place.
 *	String Pool is the mechanism that all already defined string are stored in 
 *	some 'pool' and before creating new String object compiler checks 
 *  if such string is already defined.
 */
public class StringIsImmutable {
	public static void main(String [] args) {
		String a1="ABC";
		String b2="ABC";
		if(a1==b2) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		if(A.a==B.b) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		A a = new A();
		B b = new B();
		if(a.getpA()==b.getpB()) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	}

}
class A{
	public static String a="ABC";
	private String pA="ABC";
	public String getpA() {
		return this.pA;
	}
}
class B{
	public static String b="ABC";
	private String pB="ABC";
	public String getpB() {
		return this.pB;
	}
}

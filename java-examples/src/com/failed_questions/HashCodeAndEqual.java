package com.failed_questions;

import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEqual {
	public static void main(String [] args) {
		AB a = new AB();
		AB c = new AB();
		BA b = new BA();
		a.setA("HelloWorld");
		a.setB(1);
		c.setA("HelloWorld");
		c.setB(1);
		b.setA("HelloWorld");
		b.setB(1);
		System.out.println("AB => AhashCode:"+a.hashCode());
		System.out.println("AB => ChashCode:"+a.hashCode());
		System.out.println("BA => BhashCode:"+b.hashCode()); //same hashcode for all of them
		if(a.equals(b)) {
			System.out.println("ABa and BAb are equal");
		}else {
			System.out.println("ABa and BAb are not equal");	 //prints not equal
		}
		if(a.equals(c)) {
			System.out.println("ABa and ABc are equal");
		}else {
			System.out.println("ABa and ABc are not equal"); //prints equal
		}
		System.out.println("Lets Check out it on hashmap");
		Map<Object, String> map= new HashMap<Object, String>();
		map.put(a, "Hello");
		map.put(b, "Gello");
		System.out.println("Map Values For Object a and b");
		map.forEach((K,V)->{System.out.println("Key:"+K+", value:"+V);});
		map.put(b, "Dello");
		System.out.println("Since Object a and c are equal, the map will update the object value for a");
		map.forEach((K,V)->{System.out.println("Key:"+K+", value:"+V);});


	}
}
class AB{
	public AB() {
		
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "AB [a=" + a + ", b=" + b + "]";
	}
	String a;
	int b;
	
	@Override
	public int hashCode() {
		return (a.hashCode()+b);
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		
		AB objA =obj==null||obj.getClass()!=this.getClass()?null:(AB) obj;
		return objA==null?false:(this.getA()==objA.getA()&&this.getB()==objA.getB());
	}
}
class BA{
	public BA() {
		
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "BA [a=" + a + ", b=" + b + "]";
	}
	String a;

	int b;
	
	@Override
	public int hashCode() {
		return (a.hashCode()+b);
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		AB objA =obj==null||obj.getClass()!=this.getClass()?null:(AB) obj;
		return objA==null?false:(this.getA()==objA.getA()&&this.getB()==objA.getB());
	}
}

package com.features.java8;

public class Comments {

}

//Credits JAVA4BRAIN
// Subscribe Java4Brain on youtube, content Taken from "Java 8 Lambda Basics"
// PASSING BEHAVIOUR IN JAVA
/** Issue Here is that to get a one functionality From Class, 
 * for that we need to implment a new class for different functionality
 * * Interface Greetings{
 	void perform();
}
	class GreetingsImpl implements Greetings(){
		public void perform(){
			System.out.println("Do something");
		}
	}
	class SomeOtherClass(){
		public void greet(Greetings greet){
			greet.perform();
		}
		public static void main(){
			SomeOtherClass obj = new SomeOtherClass();
			obj.greet(new GreetingsImpl());
		}
	}
****
***/
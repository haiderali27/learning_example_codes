package com.features.java8;
/*
 * A lambda has its own behavior, instead of class, just pass the action/lambda
 * A lambda doesn't belong to a class, it is totally independent
 * This can be assigned to a variable
 *
 * for multiple lines
()-> {
	System.out.println("print something");
	()-> System.out.println("print something else");
}
for one line of code
()-> System.out.println("print something else");
 */

import com.features.greetings_example.Greetings;
import com.features.greetings_example.GreetingsImpl;

public class LambaExpression {
	public void greet(Greetings gr) {
		gr.performs();
	}
	public static void main(String[] args) {
		System.out.println("LAMBDA CODE");
	
		LambaExpression obj = new LambaExpression();
		Greetings gI = new GreetingsImpl();
		obj.greet(gI); // Through Polymorphism, The draw back here is we have to implement who class just for one functionali
		gI= ()-> {
			System.out.println("Print Void");
		};
		obj.greet(gI); // We didnt have to implement a whole class now, this is one advantage of using lambda expressions, but here is a catch there, each interface can't have more than two functions otherwise, out expression will become ambigious and hence will show you error
		obj.greet(()->System.out.println("PRINT IT WITH TYPE INFERENCE"));
		//The first Greet is instance of GreetingsImpl class, the second one is just a lambda expression
		// We can also use anonymous inner class 
		Greetings gr = new Greetings() {

			@Override
			public void performs() {
				System.out.println("Anonymous inner class");
			}
			public void dologom() {
				System.out.println("Anonymous inner class dologom");
			}
			
		};
		obj.greet(gr);
		
		//Compiler does a thing caller type inference with lambda to
		VoidInterface voidInterface = ()-> {
			System.out.println("Print Void");
		};
		ParameterInterface parameterInterface = (a,b)-> {
			System.out.println("Print: "+a+b);
		};
		ParameterReturnInterface parameterReturnInterface = (a,b)-> {
			return (a*b);
		};
	}
	interface VoidInterface {
		void foo();

	}
	interface ParameterInterface{
		void print(int a, String b);
	}
	interface ParameterReturnInterface{
		int multiply(int a, int b);
	}
}

package Lambda;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Basic {

	//normal method-wher we will get a value for a and do some action in method body
	public static void print(int a) {
		System.out.println(a);
		
	}
	
	
	public static void main(String[] args) {
		
		Deque<Integer> queue=new LinkedList<>();
		queue.offer(5); //adding elements     
		queue.offer(15);
		queue.offer(35);

		for(int single:queue) {
			System.out.println(single);
		}
		
		queue.forEach(n -> System.out.println(n));//used lambda expression
		/*
		 A lambda expression is a short block of code which takes in parameters and returns a value. 
		 Lambda expressions are similar to methods, but they do not need a name and they can be 
		 implemented right in the body of a method
		 Lambda expressions basically express instances of functional interfaces 
		 (An interface with single abstract method is called functional interface. An example is java.lang.Runnable). 
		 lambda expressions implement the only abstract function and therefore implement functional interfaces
		-lambda expressions are added in Java 8*/
		
		
		
		
		

	}

}

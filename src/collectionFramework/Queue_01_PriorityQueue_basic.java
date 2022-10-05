package collectionFramework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;


/*
 In this class-we will check natural order of PriorityQueue 
 * 
 * */
public class Queue_01_PriorityQueue_basic {

	public static void main(String[] args) {
		//generi-Integer
		Queue<Integer> q=new PriorityQueue<>();
		q.add(500);
		q.add(50);
		q.offer(5);
		q.offer(25);
		q.offer(15);
		// Front 500 50 5 25 15 Rear
		System.out.println(q.size());
		System.out.println(q.peek());
		
		for(int i=0;i<5;i++) {
			System.out.println(q.poll());
			
		}
		//Output: Ascending Order 5 15 25 50 500
		
		//generic-Character
		Queue<Character> q2=new PriorityQueue<>();
		q2.add('C');
		q2.add('A');
		q2.add('D');
		q2.add('E');
		for(int i=0;i<5;i++) {
			System.out.println(q2.poll());
			
		}
		//Output: A C D E
		
		
		//generic-String
		Queue<String> q1=new PriorityQueue<>();
		q1.offer("Mithu");
		q1.add("Sanjida");
		q1.add("Abdul");
		q1.add("Salim");
		q1.add("Sohag");
		
		
		//using for each loop---dont think about the priority
//		for(String s:q1) {
//			System.out.println(s);
//		}
		
		//for each loop----taking every single element and put in a variable and print
		
		//q1.forEach(s->System.out.println(s) );
		
		
		
		for(int i=0;i<5;i++) {
			System.out.println(q1.poll());
			
		}
		// Abdul Mithu  Salim Sajida  Sohag
		
		
	}

}

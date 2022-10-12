package collectionFramework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;


/*
 In this class-we will check natural order of PriorityQueue 
 * 
 * */
public class Queue_01_PriorityQueue_basic_quiz {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<>();
		q.add(500);
		q.add(50);
		q.offer(5);
		q.offer(25);
		q.offer(15);
		
			
		for(int i=0;i<5;i++) {
			q.poll();
			System.out.print(" "+q.peek());
			
		}
		
		
	}

}

package collectionFramework;

import java.util.Deque;
import java.util.LinkedList;

/*
 *In this class we will implement Deque by LinkedList class
 *add elements, retrive elements
 *and use some methods
 **/
public class Queue_Deque_01_LinkedList {

	public static void main(String[] args) {
		//crating deque --implemetd by LinkedList class
			Deque<Integer> queue=new LinkedList<>();
			//adding elements 
			queue.offer(5);     
			queue.offer(15);
			queue.offer(35);
			queue.offer(55);
			queue.offer(155);
			queue.add(25); //add()---also add element
			queue.addFirst(20);//add element at front
			queue.addLast(200);//add element at bottom (last)
			
			//remove
			System.out.println("using removeFirst()"+queue.removeFirst());
			System.out.println("using removeFirst()"+queue.removeLast());
			
			//peek() will retrive element from front
			System.out.println("Now who is head"+queue.peek());//
			System.out.println("using peekFirst()"+queue.peekFirst());//
			System.out.println("using peekLast()"+queue.peekLast());
		
			
	}

}

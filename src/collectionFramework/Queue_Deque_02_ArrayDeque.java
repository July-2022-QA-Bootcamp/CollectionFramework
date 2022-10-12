package collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
 

/*
 *In this class demonstrated Deque implemented by ArrayDeque class*/
public class Queue_Deque_02_ArrayDeque {

	public static void main(String[] args) {
		Deque<Integer> queue=new ArrayDeque<>();
		//adding elements   
		queue.offer(5);   
		queue.offer(15);
		queue.offer(35);
		queue.offer(55);
		queue.offer(155);
		queue.add(25); //add()---also add element
		queue.addFirst(20);
		queue.addLast(200);
		
		//peek() will retrive element from front
		System.out.println("Now who is head"+queue.peek());//
		//using some other methods:
		System.out.println("using peekFirst()"+queue.peekFirst());//
		System.out.println("using peekLast()"+queue.peekLast());
		System.out.println("using removeFirst()"+queue.removeFirst());
		System.out.println("using removeFirst()"+queue.removeLast());

	}

}

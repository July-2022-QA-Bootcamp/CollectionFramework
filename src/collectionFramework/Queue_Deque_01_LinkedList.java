package collectionFramework;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Deque_01_LinkedList {

	public static void main(String[] args) {
		
			Deque<Integer> queue=new LinkedList<>();
			queue.offer(5); //adding elements     
			queue.offer(15);
			queue.offer(35);
			queue.offer(55);
			queue.offer(155);
			queue.add(25); //add()---also add element
			//peek() will retrive element from front
			
			
			queue.addFirst(20);
			queue.addLast(200);
			
			System.out.println("Now who is head"+queue.peek());//
			
			System.out.println("using peekFirst()"+queue.peekFirst());//
			System.out.println("using peekLast()"+queue.peekLast());
			System.out.println("using removeFirst()"+queue.removeFirst());
			System.out.println("using removeFirst()"+queue.removeLast());
			
			
			
			
			
			
			
			
	}

}

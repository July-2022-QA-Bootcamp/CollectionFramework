package collectionFramework;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Deque_quiz {

	public static void main(String[] args) {
		Deque<Integer> queue = new LinkedList<>();
		
		queue.add(35); 
		queue.offer(15);
		queue.offer(5);
		queue.offer(55);
		queue.addFirst(155);
	
		for(int i=0;i<5;i++) {
			System.out.print(" "+queue.remove());
		}

	}

}

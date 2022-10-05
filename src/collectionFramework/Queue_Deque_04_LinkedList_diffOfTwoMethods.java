package collectionFramework;

import java.util.Deque;
import java.util.LinkedList;

public class Queue_Deque_04_LinkedList_diffOfTwoMethods {

	public static void main(String[] args) {
		Deque<Integer> queue=new LinkedList<>();
//		queue.offer(5); //adding elements     
//		queue.offer(15);
//		queue.offer(35);
//		queue.offer(55);
		
		//when you check keep one line active and rest comment out
//		System.out.println(queue.poll());
//		//System.out.println(queue.poll());//when no element it returns null
//		System.out.println(queue.remove());//when no element it returns exception--NoSuchElementExceptio

		
		//we will check element() and peek()
		//System.out.println(queue.element());//when no element it returns ---excepton--NoSuchElementException
		System.out.println(queue.peek());//when no element it returns ---null
		
		
		
		
		
	}

}

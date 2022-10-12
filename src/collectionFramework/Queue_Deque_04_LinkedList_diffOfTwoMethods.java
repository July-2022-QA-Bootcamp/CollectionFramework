package collectionFramework;

import java.util.Deque;
import java.util.LinkedList;
/*
 *In this class we will see--we use two methods doing the same but one is giving error and one not*/
public class Queue_Deque_04_LinkedList_diffOfTwoMethods {

	public static void main(String[] args) {
		Deque<Integer> queue=new LinkedList<>();
		queue.offer(5);     //when you check keep comment out this line

		
		//poll() and remove():
		System.out.println(queue.poll());//when no element-- it returns null
		System.out.println(queue.remove());//when no element-- it returns exception--NoSuchElementExceptio

		Deque<Integer> queue1=new LinkedList<>();
		queue1.offer(5);     //when you check keep comment out this line
		
		//check element() and peek():
		System.out.println(queue1.element());//when no element it returns ---excepton--NoSuchElementException
		System.out.println(queue1.peek());//when no element it returns ---null
		
		
		//Note similarly there are other methods doing same but giving error when queue is empty some returns null
		
		
	}

}

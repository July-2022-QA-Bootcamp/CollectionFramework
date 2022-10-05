package collectionFramework;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Deque_03_removeIf {

	public static void main(String[] args) {
		//creating obj 
		Deque<Integer> queue = new LinkedList<>();
		//adding elements in Deque
		queue.offer(5); // 5%3=not 0
		queue.offer(15);// 15%3=reminder 0
		queue.offer(35);// 5%3=not 0
		queue.offer(55);// 5%3=not 0
		queue.offer(155);// 5%3=not 0

		System.out.println("Before remove");
		for (int i : queue) {
			System.out.println(i);
		}

		// we can use remove or poll()

		// using removeIf()--for conditional removing (it will check condition before
		queue.removeIf( n-> (n % 3 == 0)); 
		//in Lambda expression-- before (->) n is taking value like parameter and inside parenthesis like method body-using that value 

		System.out.println("after remove");

		for (int i : queue) {
			System.out.println(i);
		}

	}

}

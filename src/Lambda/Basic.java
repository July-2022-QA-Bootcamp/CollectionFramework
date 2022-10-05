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
		
		queue.forEach(n -> System.out.println(n));
		
		
		
		
		
		

	}

}

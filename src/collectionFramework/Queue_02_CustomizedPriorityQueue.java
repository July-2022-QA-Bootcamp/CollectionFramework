package collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_02_CustomizedPriorityQueue {
/*Here we are testing customized PriorityQueue 

 WF:1.create a class EnthrallStJul22 (name, result) ---created in same package
2. Create CompaerSt class & implements Comparator<EnthrallStJul22> so that can override compare() and compare EnthrallStJul22 obj based on result.
--created in same package

3. Here we are Creating this class and create obj of PriortyQueue by passing by new CompareSt() which will ultimately accepts CompareSt() obj >add obj of EnthrallStJul22 in priorityque
4  Finally, we will print and check priority of the obj based on result

 * 
 * 
 * 
 * */
	public static void main(String[] args) {
		//creating obj of EnthrallStJul22 class so that we put in PriorityQueue obj
		EnthrallStJul22 st1 = new EnthrallStJul22("Mithu", 3);
		EnthrallStJul22 st2 = new EnthrallStJul22("Sanjida", 4);
		EnthrallStJul22 st3 = new EnthrallStJul22("Salim", 5);
		EnthrallStJul22 st4 = new EnthrallStJul22("Sohag", 1);

		//adding EnthrallStJul22 obj in PriorityQueue obj
		Queue<EnthrallStJul22> queue = new PriorityQueue<>(new CompaerSt());
		queue.add(st1);
		queue.add(st2);
		queue.add(st3);
		queue.add(st4);
		
		
		//System.out.println(queue.peek().result);
		
		//printing name and result of the return obj (based on peek()
		for(int i=0;i<4;i++) {
			System.out.println(queue.peek().name+":"+queue.peek().result);
			//removing head element
			queue.poll();
		}
		
		
		
		
		;

	}

}

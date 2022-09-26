package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class List_LinkedList_02_AccessElements {

	public static void main(String[] args) {
		
		//creating obj of LinkedList
		LinkedList<Integer>llist=new LinkedList<>();
		//adding elements in llist (obj) by using add()
		llist.add(100);
		llist.add(10);
		llist.add(90);
		llist.add(99);
		llist.add(5);
		llist.add(5);
	
		
		//get the single element
		System.out.println(llist.get(0));
		
		//by using iterator
		System.out.println("using iterator");
		Iterator<Integer> it=llist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//using for loop
		System.out.println("using for loop");
		for(int i=0;i<llist.size();i++) {
			System.out.println(llist.get(i));
		}
	
		//using for each/advance loop
		System.out.println("using for each/advance loop");
		for(int n:llist) {
			System.out.println(n);
		}
		
		System.out.println("//using listIterator");
			
		ListIterator<Integer> lit=llist.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		//reverse checking
		ListIterator<Integer> lit1=llist.listIterator();
		while(lit1.hasPrevious()) {
			System.out.println(lit1.previous());
		}
		
		
		//for array traversing reverse way (extra for explaining reverse traversing in array)
		int arr[]= {5,8,9,20}; //4  but 4th index is not here
		
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
		
		//Output: 100    10   90  99  5
		
		

	}

}

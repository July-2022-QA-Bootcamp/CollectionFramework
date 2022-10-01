package collectionFramework;

import java.util.LinkedList;

import javax.swing.event.EventListenerList;

public class List_LinkedList_05_usingOfSomeMethods {
//using of some commonly used mehtods in Linkedlist
	public static void main(String[] args) {
		//creating obj of LinkedList
				LinkedList<Integer>llist=new LinkedList<>();
				//adding elements in llist (obj) by using add()
				llist.add(100);
				llist.add(10);
				llist.add(90);
				llist.add(99);
				llist.add(5); 
				llist.set(1, 101);
				
				//System.out.println(llist.size());//5
				
				System.out.println("Before removing--");
				for(int i=0;i<llist.size();i++) {
					System.out.println(llist.get(i));
				}
				
				
				llist.remove(); //fist one remove
				llist.remove(2);
				
				System.out.println("after removing--");
				for(int i=0;i<llist.size();i++) {
					System.out.println(llist.get(i));
				}
				
				LinkedList<Integer>llist1=new LinkedList<>();
				
				llist1.add(200);
				System.out.println("before addAll --");
				for(int i=0;i<llist1.size();i++) {
					System.out.println(llist1.get(i));
				}
				
				llist1.addAll(llist);
				
				System.out.println("after addAll --");
				for(int i=0;i<llist1.size();i++) {
					System.out.println(llist1.get(i));
				}
				
				//off topic
				System.out.println(llist1.hashCode());//it will give you an int number
				
				//we are using this mehtod to check what will be common
				System.out.println("after using retainAll() --");
				llist1.retainAll(llist);
				
				for(int i=0;i<llist1.size();i++) {
					System.out.println(llist1.get(i));
				}
				
				
			
				
				
		
	}

}

package collectionFramework;

import java.util.LinkedList;
import java.util.List;

import javax.swing.event.EventListenerList;

public class List_LinkedList_04_usingOfSomeMethods {
//using of some commonly used mehtods in Linkedlist
	public static void main(String[] args) {
		//creating obj of LinkedList
				LinkedList<Integer>llist=new LinkedList<>();
				//adding elements in llist (obj) by using add()
				llist.add(100);//0
				llist.add(10);//1
				llist.add(90);//2
				llist.add(99);//3
				llist.add(5); 
				llist.set(1, 101);
				
				//System.out.println(llist.size());//5
				
				System.out.println("*******--");
				for(int i=0;i<llist.size();i++) {
					System.out.println(llist.get(i));
				}
				
				//if we use subList()---it will return a list not ArrayList or LinkedList
				List<Integer>llist1=llist.subList(0, 3);// here 3- index will not including
				
				//to check sublist
				//System.out.println(llist.subList(0, 3));
				
				System.out.println("***after putting in a new list****--"); //100 10 90
				for(int i=0;i<llist1.size();i++) {
					System.out.println(llist1.get(i));
				}
				
				
				
			
				
				
		
	}

}

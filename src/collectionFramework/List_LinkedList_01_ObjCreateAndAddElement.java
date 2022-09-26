package collectionFramework;

import java.util.LinkedList;

public class List_LinkedList_01_ObjCreateAndAddElement {

	public static void main(String[] args) {
		
		//creating obj of LinkedList
		LinkedList<Integer>llist=new LinkedList<>();
		//adding elements in llist (obj) by using add()
		llist.add(100);
		llist.add(10);
		llist.add(90);
		llist.add(99);
		llist.add(5); 
		llist.add(5);//Duplicate is possible
		
		//printing single element:
		System.out.println(llist.size());//6
		
		
		System.out.println(llist.isEmpty());//false
		System.out.println(llist.contains(90));//true
		
		
		
		
		//get the element
		System.out.println(llist.get(0));
		
	
		
		
		
		
		//100    10   90  99  5
		
		

	}

}

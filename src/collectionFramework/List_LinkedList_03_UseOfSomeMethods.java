package collectionFramework;

import java.util.LinkedList;

public class List_LinkedList_03_UseOfSomeMethods {

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
		
		//Checking our llist is emppty or not:
		System.out.println(llist.isEmpty());//false
		
		//checking specific elemt is in the list:
		System.out.println(llist.contains(90));//true
		
		
		
		

	}

}

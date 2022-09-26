package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class List_ArrayList_07_01_AccessElements {

	public static void main(String[] args) {
		ArrayList<String> list2=new ArrayList<>();
		list2.add("Mithu");
		list2.add("Mizan");
		list2.add("Kamran");
		list2.add("Salim");
		list2.add("Salim");//duplicate is ok
		list2.add("Sohag");
		
		//get one element		
		System.out.println(list2.get(0));//Mithu
		//what is the index for one element
		System.out.println(list2.indexOf("Salim"));//3  //if we have more occurance then 1st one
		System.out.println(list2.lastIndexOf("Salim"));//6
		
		
		//to get all elements we can use iterator()
		
		for(String name:list2) {
			System.out.println(name);	
		}
		
		
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));  //i=0---> list2.get(0)  i=1---> list2.get(1)
		}
		
		
		Iterator<String> it=list2.iterator();
		while(it.hasNext()) {
			System.out.print(" "+ it.next());
		}
		
	}

}

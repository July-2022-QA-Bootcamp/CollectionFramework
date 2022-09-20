package collectionFramework;

import java.util.ArrayList;

public class List_ArrayList_03_HetrogeneousElements {

	public static void main(String[] args) {
		//HetrogeneousElements type
		
		ArrayList list=new ArrayList();
		
		list.add(5);
		list.add(5.5);
		list.add("Sohag");
		list.add('C');
		
		
		System.out.println(list.get(0));
 
	}

}

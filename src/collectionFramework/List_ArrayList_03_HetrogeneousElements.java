package collectionFramework;

import java.util.ArrayList;

public class List_ArrayList_03_HetrogeneousElements {

	public static void main(String[] args) {
		//HetrogeneousElements type	
		ArrayList list=new ArrayList(20);
		list.add(5);
		list.add(5.5);
		list.add("Sohag");
		list.add('C');
		list.add(3,'C');
		
		System.out.println(list.get(0));
 
	}

}

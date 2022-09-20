package collectionFramework;

import java.util.ArrayList;

public class List_ArrayList_04_GenericElements {

	public static void main(String[] args) {
ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(50);
		list.add(15);
		list.add(25);
		list.add(35);
		list.add(5);
		
		
ArrayList<String> list2=new ArrayList<>();

		String st1=new String("Tahira");
		
		
		
		
		
		String st2=new String("Kamran");
	
		list2.add(st1);
		list2.add(st2);
		list2.add("Mithu");
		list2.add("Mizan");
		list2.add("Kamran");
		list2.add("Salim");
		
		
		System.out.println(list2.get(0)); //Tahira
		System.out.println(list2.get(2)); //Mithu

	}

}

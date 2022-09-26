package collectionFramework;

import java.util.ArrayList;

public class List_ArrayList_10_removeElements {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList();
		list.add("Sanjida");
		list.add("Sohag");//
		list.add("Anik");
		list.add("Kamran");
		list.add("Harun");
		
		System.out.println("Before addAll------");
		for(String name:list) {
			System.out.println(name);
		}
		
		ArrayList<String> list1=new ArrayList();
		list1.add("Salim");
		list1.add("Khaleda");//
		
		list.addAll(list1);
		
		System.out.println("Before removing------");
		for(String name:list) {
			System.out.println(name);
		}
		
		
		list.remove("Sohag");
		list.remove(0);
		
		
		System.out.println("After removing------");
		for(String name:list) {
			System.out.println(name);
		}
		
		
		list.removeAll(list1);//elements which are available in List1 will be removed
		
		System.out.println("After using removeAll method------");
		for(String name:list) {
			System.out.println(name);
		}
		list.clear();
		System.out.println("After using clear method------");
		
		
		for(String name:list) {
			System.out.println(name);
		}
		
		
		
	}

}

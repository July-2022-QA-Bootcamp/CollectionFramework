package collectionFramework;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set_SortedSet_01_TreeSet_Basic {

	public static void main(String[] args) {
		
		//creating obj:
		SortedSet<String> set=new TreeSet<>();
		//inserting or adding elements
		set.add("Sanjida");
		set.add("Khaleda");
		set.add("Meena");
		set.add("Barek");
		set.add("Abdul");
		set.add("Abdul");//trying to add duplicate--will be ignored
		
		
		//using iterator()---retriving all elements--output will be --a sorted result (ascending order)
		//if String then....Elements Letter starts with A--->Z, 
		//if int then smaller to larger
		Iterator<String> it=set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	//Sorting will be  -----> A---Z or a---z
		SortedSet<Character> set2=new TreeSet<>();
		set2.add('D');
		set2.add('A');
		set2.add('Z');
		set2.add('F');
		
	
		
		Iterator<Character> it2=set2.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
			
		}
		
		
		
		
	}

}

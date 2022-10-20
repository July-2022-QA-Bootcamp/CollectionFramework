package collectionFramework;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set_SortedSet_TreeSet_2_useMethods {

	public static void main(String[] args) {

		// getting set TreeSet obj and insert String obj
		//SortedSet<String> set = new TreeSet<>();
		
		//to get celling(), lower() and higher() we created TreeSet class obj:
		TreeSet<String> set = new TreeSet<>();
		set.add("Sanjida");
		set.add("Khaleda");
		set.add("Meena");
		set.add("Barek");
		set.add("Abdul");

		System.out.println("Retriving all elements from set by using iterato()-->output will be sorted------");

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		System.out.println("Retriving all elements from set by using foreach loop-->output will be sorted--------");
		for (String name : set) {
			System.out.println(name);
		}

		System.out.println("Using some methods-------------------------------------------");
		// using some methods:
		System.out.println("first()-->" + set.first());// ---will get the first element : Abdul

		System.out.println("last()-->" + set.last());// ---will get the last element : Sanjida

		System.out.println("isEmpty()-->" + set.isEmpty());// ---will return true if empty element : here we will get
															// false because elements not empty

		System.out.println("remove()-->" + set.remove("Meena"));// ---will remove passing element and return true:

		System.out.println("size()-->" + set.size());// ---will get the size of set

		System.out.println("celling()-->" + set.ceiling("Barek")); // takes passing element and return as celling

		System.out.println("lower()-->" + set.lower("Khaleda"));// comparing with passing element return lower element
																

		System.out.println("higher()-->" + set.higher("Barek"));// comparing with passing element and return higher element
																

	}

}

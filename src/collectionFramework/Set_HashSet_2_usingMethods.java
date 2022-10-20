package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_HashSet_2_usingMethods {

	public static void main(String[] args) {
		
		// Creating set
		Set<Integer> set = new HashSet<>();
		// adding element
		set.add(5);
		set.add(15);
		set.add(55);

		System.out.println("Retring all element from set");
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Creating another set to using allAll() method
		Set<Integer> set1 = new HashSet<>();
		// adding elemen
		set1.add(5);
		set1.add(55);
		set1.add(65);
		set1.add(75);
		
		System.out.println("All elements in 2nd set before using addAll()-------");
		Iterator<Integer> it1 = set1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		// adding all elements from 1st set
		set1.addAll(set);
		
		System.out.println("All elements in 2nd set after using addAll()-------");
		Iterator<Integer> it2 = set1.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		//using remove method----
		set1.remove(75);
		set1.removeAll(set);
		
		System.out.println("*****After usiing removeAll(set) in set1---(should be removed all what we added from 1st Set****");
		Iterator<Integer> it3 = set1.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}

		//using clear() method---removing all from set1
		set1.clear();
		System.out.println("after using clear()----");
		Iterator<Integer> it4 = set1.iterator();
		if (it4.hasNext()) {
			System.out.println(it4.next());
		} else {
			System.out.println("it is empty");
		}

		
		//using isEmpty() as a checking logic----
		if (!set1.isEmpty()) {
			System.out.println(set1);
		} else {

			System.out.println("Empty");
		}

	}

}

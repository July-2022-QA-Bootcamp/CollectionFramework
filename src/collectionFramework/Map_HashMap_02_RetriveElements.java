package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 We will see how can we retrive all values---
 and some methods*/

public class Map_HashMap_02_RetriveElements {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Shimul", 101);
		map.put(null, 102);// null key is possible
		map.put("Mithu", 1091);
		map.put("Sanjida", 1801);
		map.put("Salim", 1051);
		map.put("Kamran", 121);
		map.put("Khaleda", 1010);

		// pring value by passing null key
		System.out.println(map.get(null));

		// keySet---getting all keys
		Set<String> keys = map.keySet();

		// get all values----

//		for(String key:keys) {
//			System.out.println(map.get(key));
//		}

		// if we use clear()---then all elements will be cleared
		// map.clear();

		// using isEmpty()---to check map is empty or not

		if (map.isEmpty()) {
			System.out.println("Map is empty");
		} else {
			for (String key : keys) {
				System.out.println(map.get(key));
			}
		}

		// using entrySet:
		System.out.println("using entrySet");
		//When we use entrySet() --getting a set (set's generic will be Map (so we use Map.Entry<>
		Set<Map.Entry<String, Integer>> es = map.entrySet(); // entrySet()---will return set with again a map (k v)
		//now we print set:
		System.out.println(es);

		// if we use set.iterator()----will return Iterator obj with Map generic --so we use Map.Entry<>
		Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
		//now as it is checking in while and print
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

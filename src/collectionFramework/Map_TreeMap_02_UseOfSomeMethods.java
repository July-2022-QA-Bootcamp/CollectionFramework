package collectionFramework;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map_TreeMap_02_UseOfSomeMethods {

	/*
	 * Here we will see use of some methods in TreeSet*/
	
public static void main(String[]args) {
	Map<Integer,String> map=new TreeMap<>();
	map.put(500, "Khaleda");
	map.put(50, "Salim");
	map.put(100, "Mithu");
	map.put(150, "Imran");
	
	//using putIfAbsent() to add element---it will check key exist or not if not then add element
	map.putIfAbsent(155, "Sohag");
	
	//using entry set get all key-value entry
	//One K,V---is one entry.        if we take all entry---that will be entrySet()--it will return set<map<>>
	System.out.println("using entryset");
	//as entrySet returns all entry which is map ans which will be generic of set, so need to use Map.Entry<> to make Set generic
	Set<Map.Entry<Integer,String>> s=map.entrySet(); 
	System.out.println(s);
	
	
	System.out.println("using entryset--iterator");
	//we can use iterator() from collection
	//when we use entrySet() it returns set--> so we can use iterator()----so finally will get Iterator obj, so we need to put accordingly
         Iterator<Map.Entry<Integer,String>> it=map.entrySet().iterator();
         while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	
	
	//using keySet() and using it in for each loop
	Set<Integer> k=map.keySet();
	for(int single:k) {
		System.out.println("Key: "+single+" Value: "+map.get(single));
	}
	
	
}
	
}

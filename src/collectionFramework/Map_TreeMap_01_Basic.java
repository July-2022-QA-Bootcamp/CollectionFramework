package collectionFramework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map_TreeMap_01_Basic {
/*
 * Here we use TreeMap class to implement Map interface
 *--we will check it returns sorted result
 * 
 * */
	
	
	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<>();
		map.put(500, "Khaleda");
		map.put(50, "Salim");
		map.put(100, "Mithu");
		map.put(150, "Imran");
		
		//if we get all keys by keySet() and print--can see all sorted way:
		System.out.println(map.keySet()); // [50, 100, 150, 500]
		
		//key set using in for eachloop
		Set<Integer> k=map.keySet();
		for(int single:k) {
			System.out.println("Key: "+single+" Value: "+map.get(single));
		}
				
	}

}

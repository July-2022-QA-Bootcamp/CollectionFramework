package collectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Map_LinkdHashMap_01_Basic {
	
	/*
	 Here we use LinkedHasMap Class which implements Map Interface
	 *
	 */


	public static void main(String[] args) {
		
		//1st map
		Map<Integer,String> map=new LinkedHashMap<>();
		map.put(100, "Mithu");
		map.put(105, "Mohammad");
		map.put(109, "Kabir");
		
		
		//2nd Map
		Map<Integer,String> map1=new LinkedHashMap<>();
		map1.put(101, "Sanjida");
		map1.put(101, "Salim");
		map1.put(102, "Sohag");
		//System.out.println(map.get(101));//Salim
		
		//using getOrDefault()---it will check key is there or not if ther then get value, otherwise by default return passing value
		System.out.println(map1.getOrDefault(101, "Sohag"));
		
		//putAll()---will add all elements from one map to another map
		map.putAll(map1); //all elements from map1 will add in map
		
		//getting all keys
		Set<Integer> keys=map.keySet();
		//using foreach loop to get all values corresponding key
		for(int k:keys) {
			System.out.println(map.get(k));
		}
		
	
		
		//we can get key from user input and get value by passing that in get()
		System.out.println("Write the id number");
		Scanner scanner=new Scanner(System.in);
		int roll=scanner.nextInt();
		System.out.println(map.get(roll));
		
		
	

	}

}

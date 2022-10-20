package collectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_LinkedHashSet_01_Basic {

	public static void main(String[] args) {
		
		
		/*LinkedHashSet implemented LinkedList +  HashTable
		 * 
		 * When we use HashSet-----no insertion order
		 * but when we use LinkedHashSet--->following insertion order
		 * 
		 * */
		
		//creating obj
		Set<String> set=new LinkedHashSet<>();
		//adding elements
		set.add("Mithu");
		set.add("Meena");
		set.add("Sohag");
		set.add("Parrot");
		set.add("Parrot");//duplicate is not possible
		
		//getting all --should have as we inserted-->  Mithu  Meena Sohag Parrot and duplicate Parrot will be ignored

		Iterator<String> it=set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());		
		}
		
		//removing passing element
		set.remove("Sohag");
		
		//checking passing element is ther or not
		System.out.println(set.contains("Meena"));
		
		
		//having two set and check they are equal or not
		//1st set
		Set<String> set1=new LinkedHashSet<>();
		//adding elements:
		set1.add("Raihan");
		set1.add("Sohag");
		set1.add("Mithu");
		
		//checking size of the set
		System.out.println(set1.size());
		
		//2nd set
		Set<String> set2=new LinkedHashSet<>();
		set2.add("Khan");
		System.out.println(set2.size());
		
		//checking both are equal or not
		System.out.println(set1.equals(set2));
		
		
		
		
		
		
		
		
		
	}

}

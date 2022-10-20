package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_HashSet_1_Basic {

	public static void main(String[] args) {
		/*
		 * In Set duplicate is not possible--->when we create set internally HashMap obj
		 * will be created and when we call add()--it will call put() of HashMap and
		 * confirms key is unique (here what element we insert by using add() considered
		 * as a key of HashMap) this way in set only unique element gets inserted
		 * 
		 * in HashSet we will get elements as per insertion (not following insertion order)
		 * 
		 */
	
		
		Set<Integer> set=new HashSet<>();
		set.add(5); //add() will call put(5,"PRESENT")--will confirm it is unique or not
		set.add(15);
		set.add(50);
		set.add(25);
		set.add(35); 
		set.add(35);//duplicate--/add() will call put(5,"PRESENT")--will confirm it is NOT unique 
		
		//our order was [5,15,50,25,35]
		System.out.println(set);
		
		//there is not method to get element by index number like set.get()
		
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
	}

}

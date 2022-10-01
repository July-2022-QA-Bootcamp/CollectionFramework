package collectionFramework;

import java.util.Iterator;
import java.util.Vector;

public class List_Vector_02_Basic {

	public static void main(String[] args) {
		//creating Vecotor obj
		
		Vector<Integer> vector=new Vector<>();
		vector.add(5);
		vector.add(5);//duplicate possible
		vector.add(1,50);
		vector.addElement(100);//new method to add element
		
		//get element
		System.out.println(vector.get(0));
		
		//get all elements
		Iterator<Integer> it=vector.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

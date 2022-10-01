package collectionFramework;

import java.util.Iterator;
import java.util.Vector;

public class List_Vector_02_CheckingCapacity {

	public static void main(String[] args) {
		//creating Vecotor obj
		
		Vector<Integer> vector=new Vector<>();
		vector.add(5);
		vector.add(5);//duplicate possible
		vector.add(1,50);
		vector.addElement(100);
		vector.addElement(100);
		vector.addElement(100);
		vector.addElement(100);
		vector.addElement(100);
		vector.addElement(100);
		vector.addElement(100);//up to this element---capacity will be 10 (0-9 index)
		vector.addElement(100);//when we insert 11th element it capacity will be double (20) --> 0-19 index
		//note: if we add more after reaching 20th index then capacity will be doble again..and so on
		
		//checking element at 0th index
		System.out.println(vector.get(0));
		
		//retriving all by using iterator()
		Iterator<Integer> it=vector.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		

	}

}

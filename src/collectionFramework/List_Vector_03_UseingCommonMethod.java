package collectionFramework;

import java.util.Iterator;
import java.util.Vector;

public class List_Vector_03_UseingCommonMethod {

	public static void main(String[] args) {
		//creating Vecotor obj
		
		Vector<Integer> vector=new Vector<>();
		vector.add(5);
		vector.add(5);//duplicate possible
		vector.add(1,50);
		vector.addElement(100);
		vector.addElement(100); //to add element we can use this
		System.out.println("First element"+vector.firstElement()); //it returns first item
		System.out.println("last element"+vector.lastElement()); //it returns last item
		System.out.println("at mentioned index- element"+vector.elementAt(1)); //it returns  item at mentioned index
		
		
		
		System.out.println(vector.get(0));
		System.out.println(vector.capacity()); //confused --it is not the objects indexes
		System.out.println(vector.size());
		
		
		
		
		
		
		Iterator<Integer> it=vector.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		

	}

}

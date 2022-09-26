package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class List_ArrayList_09_ChangeElements {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList();
		list.add("Sanjida");
		list.add("Sohag");//
		list.add("Anik");
		list.add("Kamran");
		list.add("Harun");
		
		list.set(1, "Boby");//replacing the existing element
		//list.add(1, "Boby");//it is adding in mentioned index position
		
		//System.out.println(list.indexOf("Sohag"));
		
		Iterator<String> it=list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());   //Sanjida Boby Anik Kamran Harun
			
		}
		
		
		
		
		
		

	}

}

package collectionFramework;

import java.util.ArrayList;

public class List_ArrayList_11_isEmptyProgram {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList();
		list.add("Sanjida");
		list.add("Sohag");//
		list.add("Anik");
		list.add("Kamran");
		list.add("Harun");
		list.add("Harun");
		list.add("Harun");
		list.add("Harun");
		list.add("Harun");
		list.add("Harun");
		list.add("Harun");
		list.add("Harun");
		list.add("Harun");
		list.add("Harun");
		list.add("Harun");
		list.add("Harun");
		list.add("Harun");
		
		//System.out.println(list.isEmpty());//false
		//System.out.println(!list.isEmpty());//true
		
		if(!list.isEmpty()) {
			
			for(String name:list) {
				System.out.println(name);
			}
		}else {
			System.out.println("List is not empty");
		}
		
		
	}

}

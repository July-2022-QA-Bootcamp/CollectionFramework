package syncronizationConcept;

import java.util.LinkedList;

public class AddingObjInListCallingMethod {
	
	//creating LinkedLIst obj--we make static so that we can call from static method
	static LinkedList<String> list=new LinkedList<>();
	
	//creating a method which will call add() to insert obj in our list--we make static so that we can call from static main method
	public static void insertElement() {
		list.add("Sohag");
	}
	

	public static void main(String[] args) {
		
		
		for(int i=100;i<110;i++) {
			insertElement();
			
		
		}
		
		
		
		
		System.out.println(list);
		
		
		
		
		
	}

}

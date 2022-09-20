package collectionFramework;

import java.util.ArrayList;

public class List_ArrayList_01_CreateArrayList {

	public static void main(String[] args) {
		//creating obj of ArrayList
		
		ArrayList list1=new ArrayList();//using default constructor--capacity is 10
		list1.add(5);
		list1.add("String");
		list1.add(5.5);
		list1.add(5.5);
		list1.add(5.5);
		list1.add(5.5);
		list1.add(5.5);
		list1.add(5.5);
		list1.add(5.5);
		list1.add(5.5);
		
		
		ArrayList list2=new ArrayList(15);//using parameterized constructor--capacity is 15
		list1.add(5);
		list1.add("String");
		list1.add(5.5);
		
	}

}

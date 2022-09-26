package collectionFramework;

import java.util.ArrayList;

public class List_ArrayList_06_AddElement {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(5);//index? 2
		list.add(50);//33
		//list.add(1,15); //explicitly it is holding the index position
		list.add(25);//3
		list.add(35);//4
		list.add(0,55);//0
		
		System.out.println(list.get(2));
		//addAll()---we are adding whole objects in an exting arrayList
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(102); 
		list2.add(103);
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(65); 
		list1.add(165); 
		list1.addAll(list2); //from where it will start adding? if we dont mention index then it will start after existing element
		list1.addAll(1,list2); //from where it will start adding? if we mention index then it will start from that index
	
		
		
		System.out.println(list1.get(6)); //65
		
		
		

	}

}

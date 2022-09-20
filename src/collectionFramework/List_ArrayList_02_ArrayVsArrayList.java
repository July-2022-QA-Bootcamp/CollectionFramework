package collectionFramework;

import java.util.ArrayList;

public class List_ArrayList_02_ArrayVsArrayList {

	public static void main(String[] args) {
		//how to create array
		int[]arr=new int[10];
		int[]arr1= {5,10,5,80,100};
		
		
		
		//how create ArrayList
		ArrayList list=new ArrayList();

		
		//how to add element in array
		arr[0]=50;
		arr[1]=150;
		arr[2]=500;
		
		//how to add element in arrayList
		
		list.add(50);
		list.add(500);
		list.add(150);
		list.add(150);
		list.add(150);
		list.add(150);
		list.add(150);
		list.add(150);
		list.add(150);
		list.add(150);
		list.add(150);
		list.add(150);
		list.add(150);
		list.add(150);
		list.add(150);
		list.add(150);
		
		
		//how to retrive in array
		System.out.println("array--"+arr[0]);
		
		//how to get element in arrayList
		System.out.println("arrayList--"+list.get(0));
		
		//how to get the size in array--total indexes
		System.out.println(arr.length);
		System.out.println(arr1.length);
		
		//how to get the size in --how many elements adde
				System.out.println(list.size());
		
	}

}

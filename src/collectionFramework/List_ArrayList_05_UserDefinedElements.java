package collectionFramework;

import java.util.ArrayList;

//user defined class
class Student_July22{
	String name;
	
	//constructor
	Student_July22(String name){
		this.name=name;
	}
}


//class to create arrayList obj and insert Student_July22 type obj in it
public class List_ArrayList_05_UserDefinedElements {

	public static void main(String[] args) {
		
		//creating some objects of Student_July22 class
		Student_July22 st1=new Student_July22("Tahira");
		System.out.println(st1.name);
		
		
		
		Student_July22 st2=new Student_July22("Khaleda");
		Student_July22 st3=new Student_July22("Mithu");
		Student_July22 st4=new Student_July22("Salim");
		Student_July22 st5=new Student_July22("Mizan");
		
		
		//creating arraylist obj which <Student_July22> type
		ArrayList<Student_July22> list=new ArrayList<Student_July22>();
		list.add(st1); //0 index
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		
		//Retrieving element from arrayList then get the name field's value
		System.out.println(list.get(0).name); //obj.name value
		System.out.println(list.get(1).name); //obj.name value
		System.out.println(list.get(2).name); //obj.name value
		System.out.println(list.get(3).name); //obj.name value
		

	}

}

package collectionFramework;

import java.util.HashMap;
import java.util.Map;

/*
 Here we will create HashMap obj and add some key value pair elements
 and get one value by passing ine key
 * 
 * */
public class Map_HashMap_01_Basic {

	public static void main(String[] args) {
		
		//Key--Integer   Value--string
		Map<Integer,String> map=new HashMap<>();
		map.put(5, "Kamran");// one entry=one k and one value
		map.put(0, "Salim");// one entry
		map.put(45, "Sohag");// one entry
		map.put(15, "Mithu");// one entry
		map.put(55, "Sanjida");// one entry
		map.put(13, "Matiur");// one entry
		
		//when put() used---> hashCode() method will be invoked--which will give hashcode (int)--> will be use to choose index 
		
		
		System.out.println(map.get(0));
		//when used get()---will call hascode()--will get hashcod number and equal() method will beuse to check prev hashcod this hash same or not
		

	}

}

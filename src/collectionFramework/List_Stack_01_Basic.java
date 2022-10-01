package collectionFramework;

import java.util.ListIterator;
import java.util.Stack;

public class List_Stack_01_Basic {

	public static void main(String[] args) {
		//creating obj of Stack
		Stack<String> st=new Stack<>();
		
		//adding elements	
		st.add("Imran");
		st.push("Kamran");
		st.push("Kamran");//new method to add in Stack 
		st.push("Salim"); //adding duplicate
		
		ListIterator<String> li=st.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
			
		}
		
		
		

	}

}

package collectionFramework;

import java.util.ListIterator;
import java.util.Stack;

import javax.swing.plaf.synth.SynthSliderUI;


/*
 In this class-we are checking which element at top and which at bottom
 We will see how to remove the top/head element
 search()--we can chaek position of the element*/

public class List_Stack_02_HeadTailElements {

	public static void main(String[] args) {
		//creating obj of Stack
		Stack<String> st=new Stack<>();
		
		//adding elements
		st.add("Imran");
		st.push("Kamran");
		st.push("Kamran");//adding duplicate
		st.push("Salim"); 
		
		//cheking which one at top position
		System.out.println(st.peek()); //it will retun head element
		
		//pop()---will pop up/remove the peek
		System.out.println(st.pop());
		
		//checking position of the element
		System.out.println(st.search("Imran")); //3
		
		
		
		
		
		
	
		
		
		
		
		
		

	}

}

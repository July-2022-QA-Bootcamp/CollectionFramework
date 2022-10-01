package collectionFramework;

import java.util.ListIterator;
import java.util.Stack;

import javax.swing.plaf.synth.SynthSliderUI;

public class List_Stack_03_UseCommonMethod {

	public static void main(String[] args) {
		//creating obj of Stac
		Stack<String> st=new Stack<>();
		
		//adding elements
		
		st.add("Imran");//Tail
		st.push("Kamran");
		st.push("Kamran");//ducplicate
		st.push("Salim"); //Head
		
		
		//System.out.println(st.peek()); //it will retun head element
		
		//pop()---will pop up/remove the peek
		//System.out.println(st.pop(););
		
		
		
		
		
		for(int i=0;i<4;i++) {
			System.out.println(st.peek()+" You got a job");
			st.pop(); 
		}
		
		
		
		
		
		

	}

}

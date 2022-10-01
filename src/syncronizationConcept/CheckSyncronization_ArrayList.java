package syncronizationConcept;

import java.util.ArrayList;
import java.util.LinkedList;

public class CheckSyncronization_ArrayList {

	/*
	 * WF: 
	 * 1. Create obj of Collection make static so that we can use in static method
	 * 2. Create static method which will use add() to add element-if we calll this method each time it will add one element
	 * 3. In main method we will create (2 or more) Thread class obj 
	 * 		-inside the constructor we will implement Runnable interface so that we can override run() which is in Runnable interface
	 * 		Note: everything will be inside the constructor of Theread---new Thread (--------); so we put semicolon at the last.
	 *  	-newly created Threads we will  use same obj (list obj)concurrently to modify (Concurrent modification/modify obj at the same time) 
	 * 		-need to override run()where we will call our method to add elements (we will use for loop to call methods many times)
	 * 4. Same thing we will do for creating 2nd Thread...and so on.
	 * 5. we will call start() of Thread class to start Thread-which internally call run()
	 * 6. we will call join()-which will tell to wait so that thread can be died.
	 *  ---------upto this part...in list obj elements should added alread
	 * 7. now we will call size() of our list to check how many items got inserted.
	 * If output as expected (for exampl...if our mehtod called 1000 by each thread and if we have 2 Threads
	 * that means 1000x2-2000 so if our size() methods return 2000 each execution means it is syncronize/threadsafe
	 * (means modificaiton of obj was safe) if output less than 2000 then we can say it is not sycronized/threadsaft
	 * 
	 * 
	 */
	// creating LinkedLIst obj--we make static so that we can call from static
	// method
	static ArrayList<String> list = new ArrayList<>();

	// creating a method which will call add() to insert obj in our list--we make
	// static so that we can call from static main method
	public static void insertElement() {
		list.add("Imran");
	}

	public static void main(String[] args) throws Throwable {
		//creating new Threads
		 Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				
				for(int i=0;i<1000;i++) {
					insertElement();
					
				}
			}
		});
		 	 
		 
		 Thread t2=new Thread(new Runnable() {
				@Override
				public void run() {
					
					for(int i=0;i<1000;i++) {
						insertElement();
						
					}
				}
			});
		 
		 Thread t3=new Thread(new Runnable() {
				@Override
				public void run() {
					
					for(int i=0;i<1000;i++) {
						insertElement();
						
					}
				}
			});
		 
		 
		 //we start our thread---it will call run()
		 t1.start();
		 t2.start();
		 t3.start();
		 //wait to kill threat
		 t1.join(); 
		 t2.join(); 
		 t3.join(); 
		 
		 
		 
		 System.out.println(list.size()); //2000
		
		 
		 

	}

}

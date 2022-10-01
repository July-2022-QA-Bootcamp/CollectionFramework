package syncronizationConcept;

import java.util.LinkedList;

public class CheckSyncronization_LinkedList {

	/*
	 * WF: 
	 * 1. We will add element by calling a method. To do that we create a static
	 * method so that we can call from main 
	 * 2. We will create some Threads so that those Threads can use same obj (list obj)concurrently to modify (Concurrent
	 * modificaito/modify obj at the same time) How will create Threads --by creating Thread class obj (new
	 * Thread()) and we will implement Runnable interface so that we can use run()--need to override run()(run method is available in Runnable
	 * interface
	 * 3. in the body of run() we will call our method.
	 * 4. we will start our threads
	 * 5. finally we will check our list size
	 * 
	 * 
	 */

	// creating LinkedLIst obj--we make static so that we can call from static
	// method
	static LinkedList<String> list = new LinkedList<>();

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

package collectionFramework;

import java.util.Comparator;

/*
 * Cereating this class to implement Comparator and override compare method where we will compare EnthrallStJul22 obj*/

public class CompaerSt implements Comparator<EnthrallStJul22>{ //implements Comparator interface which generic will be EnthrallStJul22

	@Override
	public int compare(EnthrallStJul22 st1, EnthrallStJul22 st2) {   //Getting EnthrallStJul22 obj1 and obj2
		if(st1.result>st2.result) { //comparing
		return -1;
	}return 1;
		}
	

}

package collectionFramework;

import java.util.Comparator;

public class CompaerSt implements Comparator<EnthrallStJul22>{

	@Override
	public int compare(EnthrallStJul22 st1, EnthrallStJul22 st2) {   
		if(st1.result>st2.result) {
		return -1;
	}return 1;
		}
	

}

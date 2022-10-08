package AssignmentOOPS;

import java.util.ArrayList;
import java.util.Iterator;

public class arraycollection {

	@SuppressWarnings("unchecked")
	public static void main(String args[]){

		@SuppressWarnings("rawtypes")
		ArrayList al=new ArrayList(); // creating array list
		al.add("Jack"); // adding elements
		al.add("Tyler");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
		}
		}
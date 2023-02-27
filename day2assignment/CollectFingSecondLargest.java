package week3.day2assignment;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectFingSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//       output= 7;

		
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
	*/
	
		int[] data= {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> dataset=new TreeSet<Integer>();
		for(int i=0;i<=data.length-1;i++) {
			dataset.add(data[i]);
		}
		List<Integer> datalist=new ArrayList<Integer>(dataset);
//		System.out.println(datalist);
//		System.out.println(datalist.get(datalist.size()-2));
		int a=datalist.size();
	    System.out.println(datalist.get(a-2));	
	}

}

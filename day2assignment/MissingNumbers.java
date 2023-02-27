package week3.day2assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem 
		 * 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 * 
		 * 
		 */
		
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		int[] data= {3,2,11,4,6,7,8,3,3,6,8};
		Set<Integer> dataset=new TreeSet<Integer>();
		for (Integer data1 : data) {
			dataset.add(data1);
		}
		List<Integer> outputlist=new ArrayList<Integer>(dataset);
		for(int i=0;i<outputlist.size();i++) {
		if(outputlist.get(i)!=i+1) {
			System.out.println(i+1);
		}
			
		}
	}

}

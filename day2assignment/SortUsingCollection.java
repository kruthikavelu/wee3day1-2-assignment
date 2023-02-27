package week3.day2assignment;

import java.util.Arrays;

public class SortUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

		// get the length of the array		

		// sort the array			

		// Iterate it in the reverse order

		// print the array
			
		// Required Output: Wipro, HCL , CTS, Aspire Systems
		String[] company= {"HCL","Wipro","Aspire Systems"};
		int length=company.length;
		System.out.println("The Length of the String "+ length);
		Arrays.sort(company);
		for(int i=length-1;i>=0;i--) {
			System.out.print(company[i]+",");
		}
	}
	

}

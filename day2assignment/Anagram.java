package week3.day2assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		String text1="stops";
		String text2="potss";
		if(text1.length()==text2.length()) {
			char[] ch1=text1.toCharArray();
			char[] ch2=text2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println("Both Strings Are Same AnaGram");
			}else
			{
				System.out.println("Both Strings Are not AnaGram");
			}
					}
	}

}

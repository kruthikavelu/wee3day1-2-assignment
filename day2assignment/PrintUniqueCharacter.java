package week3.day2assignment;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		
		String str="babu";
		char[] chararr=str.toCharArray();
		Set<Character> charset=new HashSet<Character>();
		for (Character c : chararr) {
			if(!charset.add(c))
			{
				charset.remove(c);
				System.out.println(c);
			}
		}
		System.out.println(charset);
	}

}

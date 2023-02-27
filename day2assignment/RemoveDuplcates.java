package week3.day2assignment;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplcates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Declare a String as "PayPal India"

//		Convert it into a character array

//		Declare a Set as charSet for Character

//		Declare a Set as dupCharSet for duplicate Character

//		Iterate character array and add it into charSet

//		if the character is already in the charSet then, add it to the dupCharSet

//		Check the dupCharSet elements and remove those in the charSet

//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

//		print it
String str="PayPal India";
char[] chararr=str.toLowerCase().toCharArray();
Set<Character> charset=new HashSet<Character>();
Set<Character> dupset=new HashSet<Character>();
for (Character character : chararr) {
	if(!charset.add(character)) {
		dupset.add(character);
		System.out.println(dupset);
	}
}
charset.removeAll(dupset);
for (Character character : charset) {
	if(character!=' ')
	{
		System.out.println(character);
	}
}
	}

}

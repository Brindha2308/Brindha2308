package feb06week3.day2;
//Declare a String as PayPal India

import java.util.LinkedHashSet;
import java.util.Set;

//Convert it into a character array

//Declare a Set as charSet for Character

//Declare a Set as dupCharSet for duplicate Character

//Iterate character array and add it into charSet

//if the character is already in the charSet then, add it to the dupCharSet

//Check the dupCharSet elements and remove those in the charSet

//Iterate using charSet

//Check the iterator variable isn't equals to an empty space

//print each character for charSet

public class RemoveDuplicates {
public static void main(String[] args) {
	String pay=" PayPal India";
	char[] charArray = pay.toCharArray();
	Set<Character> charSet=new LinkedHashSet<Character>();
	Set<Character> dupSet=new LinkedHashSet<Character>();
			for(int i=0;i<charArray.length;i++) {
	if(charSet.contains(charArray[i]))
	{
					
		System.out.println(dupSet.add(charArray[i]));
	}
	
}

}
}
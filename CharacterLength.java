package com.Challenge;

/*
 * create a class to take name in constructor and write a method to count the number of characters in the name
 */
public class CharacterLength {

	// attributes
	String name1;
	String name2;
	int letterLength1;
	int letterLength2;
	private int letterLegth2;

	// creating constructor with one argument
	public CharacterLength(String firstName,String secondName) {
		name1 = firstName;
		name2=secondName;
	}

	// method
	void count() {

		for (int charIndex = 0; charIndex < name1.length(); charIndex++) {

			// charAt(index) is method which returns the specified index in a string.
			if (Character.isLetter(name1.charAt(charIndex)))// to identify the length of the string, if there character is present in the string.
															
				letterLength1++;
		}
		System.out.println("The lenghth of the letter in a character of a name " + name1 + " is : " + letterLength1);
	}
	
	public void count2() {
		
		for(int charIndex1=0;charIndex1 <name2.length();charIndex1++) {
		
		if(Character.isLetter(name2.charAt(charIndex1)))
			letterLength2++;
	}
		System.out.println("The lenghth of the letter in a character of a name " + name2 + " is : " + letterLength2);
	}
	
	public void findGreater() {
		if(letterLength1 > letterLength2) {
			System.out.println("The Largest character is :"+name1+ " and the legth of that character is :"+letterLength1 );
		}
		else if(letterLength1==letterLength2)
			System.out.println(name1+" 'Both the characters are equal' "+name2);
		else { 
			System.out.println("The Largest character is :"+name2+" and the legth of that character is :"+letterLength2);
		}
	}
	

	public void difference() {
		if(letterLength1 > letterLength2) {
			System.out.println("The difference between "+name1+" is "+(letterLength1-letterLength2)+ " count greater than "+name2);
		}
		else {
			System.out.println("The difference between "+name2+" is "+(letterLength2-letterLength1)+ " count greater than "+name1);
		}
		
	}

}

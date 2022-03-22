package application;

import java.util.Arrays;

public class PlayWithStrings {
	public static void main(String[] args) {
		System.out.println("Hello String World");
		printIntitials("Oliver", "Straberger");
		if (areAnagrams("hel .?lo", "olhel")) {
			System.out.println("Strings are anagram");
		} else {
			System.out.println("Strings are not anagram");
		}

		if (isPalindrome("Helloolleh")) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}
	}

	/**
	 * TODO: print initials
	 * 
	 * This method should print out the initials of a name to standard out.
	 * 
	 * @param firstname
	 * @param lastname
	 */
	public static void printIntitials(String firstname, String lastname) {
		System.out.println(firstname.charAt(0) + " " + lastname.charAt(0));
	}

	/**
	 * TODO: check for anagrams
	 * 
	 * This method should determine if two strings are anagrams or not An anagram is
	 * a word or a phrase made by transposing the letters of another word or phrase.
	 * For example, "parliament" is an anagram of "partial men," and "software" is
	 * an anagram of "swear oft." The program should ignore white space and
	 * punctuation.
	 * 
	 * @param value1
	 * @param value2
	 * @return true if the values are anagrams, false otherwise.
	 */
	public static boolean areAnagrams(String value1, String value2) {

		char myValue1[] = value1.replaceAll("[^a-zA-Z]", "").toCharArray();
		char myValue2[] = value2.replaceAll("[^a-zA-Z]", "").toCharArray();

		Arrays.sort(myValue1);
		Arrays.sort(myValue2);

		if (Arrays.equals(myValue1, myValue2)) {
			return true;
		}
		return false;
	}

	/**
	 * TODO: palindrone checker
	 * 
	 * This method should find out if a string value is a palindrome or not. A
	 * palindrome is a sequence of characters (can also be a number) which reads the
	 * same backwards as forwards. Some palindromes are: Anna; wow; Eva can I see
	 * bees in a cave?
	 * 
	 * Upper or lower case should not matter, but keep the white spaces, tabs and
	 * punctuation in mind.
	 * 
	 * @param value
	 * @return true if it is a palindrome, false otherwise.
	 */
	public static boolean isPalindrome(String value) {
		String myValue1 = value.replaceAll("[^a-zA-Zäöü1-9]", "");

		StringBuilder builder = new StringBuilder();
		builder.append(myValue1);
		builder.reverse();
		String secondStr = builder.toString();

		if (myValue1.equalsIgnoreCase(secondStr)) {
			return true;
		}

		return false;
	}
}

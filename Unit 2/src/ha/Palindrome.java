package ha;

import java.util.Scanner;

/**
 * Palindrome.java
 * This program determines whether or not a word is a palindrome or not.
 * Created April 13, 2017
 * @author Julie Ha
 */

public class Palindrome {

	/**
	 * This method determines whether or not word is a palindrome or not
	 * @param word The word that the user inputs 
	 * @return true or false
	 */
	// isPalindrome method
	public static boolean isPalindrome(String word){
		for (int i = 0; i < word.length(); i++){

			// compare letter at index i with letter that's i indexes away from the last letter in word
			if (word.charAt(i) != word.charAt(word.length()-1-i)){
				return false;
			}
			
		}
		return true;
	} // isPalindrome method end



	// main method
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String answer;
		do{
			System.out.println("Enter a word.");
			String word = scan.nextLine(); // get word
			System.out.println(isPalindrome(word));
			System.out.println("Do you want to enter another word?");
			answer = scan.nextLine();
			while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
				System.out.println("Invalid input. Please enter 'yes' or 'no'");
				answer = scan.nextLine();
			}
		} while (answer.equalsIgnoreCase("yes"));
	} // main method end
}

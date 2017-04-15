package ha;

import java.util.Scanner;

/**
 * ReverseSentence.java
 * This program reverses the order of the words and the characters in each word in a sentence
 * Created April 10, 2017
 * @author Julie Ha
 */

public class ReverseSentence {

	// main method
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String answer; //user's response to entering another sentence
		do{
			System.out.println("Enter a sentence.");
			 //splits sentence between spaces (each word) and sends to string array.
			String [] sentence = scan.nextLine().split(" ");

			for (int i = 0; i < sentence.length; i++){
				for (int j = sentence[i].length()-1; j>=0; j--){
					char letters = sentence[i].charAt(j);

					System.out.print(Character.toLowerCase(letters));
				}
				System.out.print(" ");
			}
			System.out.println("");
			/*
			char firstLetter = sentence[sentence.length-1].charAt(0);
			System.out.print(Character.toUpperCase(firstLetter));
			 */
			System.out.println("Do you want to enter another sentence?");
			answer = scan.nextLine();
		} while (answer.equalsIgnoreCase("yes"));
	} // main method end
}

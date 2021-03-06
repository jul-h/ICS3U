package ha;

import java.util.Scanner;

/**
 * 
 * LargestNumber.java
 * This program determines what the largest number in a set of numbers is.
 * Created March 31, 2017
 * @author Julie Ha
 *
 */

public class LargestNumber {
	
	//main method
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("How many numbers do you want to input?");
		int amount = scan.nextInt(); // get the number of numbers that the user will input
		int[] numbers = new int[amount];
		System.out.println("Please enter the numbers.");
		for (int i = 0; i < amount; i++){
			numbers[i] = scan.nextInt(); 
		}
		System.out.println(largestNum(numbers) + " is the largest number.");
	} //main method end
	
	/**
	 * This method finds and determines the largest number in a set of numbers.
	 * @param values
	 * @return The largest number in array
	 */
	//largestNum method
	public static int largestNum(int[] values){
		int highestNum = values[0];
		for(int i = 1; i < values.length; i++){
			if (values[i] > highestNum){
				highestNum = values[i];
			}
		}
		return highestNum;
	} //largestNum method end
}
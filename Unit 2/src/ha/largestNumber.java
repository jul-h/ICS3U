package ha;

import java.util.Scanner;

/**
 * 
 * largestNumber.java
 * This program determines what the largest number in a set of numbers is.
 * Created March 31, 2017
 * @author Julie Ha
 *
 */

public class largestNumber {
	public static int largestNum(int[] values){
		int highestNum = values[0];
		for(int i = 1; i<values.length;i++){
			if (values[i]>highestNum){
				highestNum = values[i];
			}
		}
		return highestNum;
	}

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to input?");
		int amount = s.nextInt(); // get the number of numbers that the user will input
		int[] numbers = new int[amount];
		System.out.println("Please enter the numbers.");
		for (int i=0; i<amount; i++){
			numbers[i] = s.nextInt(); 
		}
		System.out.println(largestNum(numbers));

	}
}
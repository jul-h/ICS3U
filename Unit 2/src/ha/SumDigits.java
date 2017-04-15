package ha;

import java.util.Scanner;

/**
 * 
 * SumDigits.java
 * This program determines the sum of the digits of a number.
 * Created March 31, 2017
 * @author Julie Ha
 *
 */

public class SumDigits {
	//main method
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a number.");
		int x = scan.nextInt(); //get a number from user
		System.out.println(sumDigits(x) + " is the sum of the digits of " + x + ".");
	} //main method end

	
/**
 * This method calculates the sum of the digits of the number that the user inputs
 * @param x The number that the user inputs to find the sum of the digits of 
 * @return The sum of the digits of the number
 */
	//sumDigits method
	public static int sumDigits(int x){
		int total = 0; 
		while (x > 0){
			total = total + x % 10;
			x = x / 10;
		}
		return total;
	} //sumDigits method end
}

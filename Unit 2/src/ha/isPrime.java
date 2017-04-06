package ha;

import java.util.Scanner;

/**
 * 
 * isPrime.java
 * This program determines whether a number is a prime number or not.
 * Created March 31, 2017
 * @author Julie Ha
 *
 */

public class isPrime {

	// main method
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to see if it is a prime number or not."); 
		int num = s.nextInt(); //gets user input
		System.out.println(isPrime(num));
	} // main method end

	/**
	 * This method determines if a number is divisible by another number
	 * @param a First number that user inputs 
	 * @param b Second number that user inputs
	 * @return true or false
	 */
	// isDivisble method
	public static boolean isDivisible(int a, int b){
		if (a % b == 0){
			return true;
		}
		return false;
	} // isDivisible method end

	/**
	 * This method determines if number is a prime number or not.
	 * @param num the number that the user inputs (the number that get checked to see if it's prime or not)
	 * @return true or false
	 */
	// isPrime method
	public static boolean isPrime(int num){
		for (int i = 2; i < num; i++){
			if (isDivisible(num, i)){
				return false;
			}
		}
		return true;
	} // isPrime method end

}

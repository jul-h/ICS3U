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
		System.out.println("Enter a number."); 
		int num = s.nextInt(); //gets user input
		System.out.println(isPrime(num));
	} // main method end
	
	/**
	 * This method determines if number is a prime number or not.
	 * @param num the number that the user inputs (the number that get checked to see if it's prime or not)
	 * @return "true" or "false"
	 */
	// isPrime method
	public static boolean isPrime(int num){
		for (int i = 2; i < num; i++){
			if (num % i == 0){
				return false;
			}
		}
		return true;
	} // isPrime method end

}

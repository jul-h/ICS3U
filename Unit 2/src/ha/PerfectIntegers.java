package ha;

import java.util.Scanner;

/**
 * PerfectIntegers.java
 * This program outputs perfect integers between 1 and 100.
 * Created April 20, 2017
 * @author Julie Ha
 */
public class PerfectIntegers {

	// main method
	public static void main(String[] args) {
		for (int num = 1; num < 100; num++){
			if(isPerfect(num)){
				System.out.println(num);
			}
		}
	} //main method end

	/**
	 * This method determines whether or not 
	 * @param num Number to check if it's a perfect integer or not
	 * @return The number if true (if number is indeed a perfect integer)
	 */
	// isPerfect Method
	public static boolean isPerfect(int num){
		int sum = 0;
		for (int i = 1; i < num; i++){
			if (isDivisible(num, i))
				sum += i;
		}
		if (sum == num){
			return true;
		}
		return false;
	} // isPerfect Method end
	
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

}

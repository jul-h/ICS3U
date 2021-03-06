package ha;

import java.util.Scanner;

/**
 * 
 * GCF.java
 * This program determines the GCF of two numbers.
 * Created March 31, 2017
 * @author Julie Ha
 *
 */

public class GCF {

	// main method
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a number.");
		int x = scan.nextInt(); // get first number from user
		System.out.println("Please enter another number.");
		int y = scan.nextInt(); // get second number from user
		System.out.println("The GCF of these two numbers are: " + gcf(x, y) + ".");
	}// main method end

	/**
	 * This method determines if a number is divisible by another number
	 * @param a First number that user inputs 
	 * @param b Second number that user inputs
	 * @return true or false
	 */
	// isDivisble method
	public static boolean isDivisible(int a, int b){
		if (a%b==0){
			return true;
		}
		return false;
	} // isDivisible method end

	/**
	 * This method calculates the GCF of two numbers
	 * @param a First number that user inputs
	 * @param b Second number that user inputs
	 * @return The GCF of the two numbers
	 */
	// gcf method
	public static int gcf(int a, int b){
		int high = 0;
		int low = 0;
		int num;

		if (a>b){
			high = a;
			low = b;
		} else if (a<b){
			low = a;
			high = b;
		} else if (a==b){
			num = a;
			return num;
		}

		for (int i=low; i>0; i--){
			if (isDivisible(high, i) && isDivisible(low, i)){
				return i;
			}
		}
		return 1;
	} // gcf method end
}

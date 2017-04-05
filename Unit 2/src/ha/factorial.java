package ha;

import java.util.Scanner;

/**
 * 
 * factorial.java
 * This program determines the factorial of a number.
 * Created March 31, 2017
 * @author Julie Ha
 *
 */

public class factorial {
	// main method
	public static void main (String[] args){
		Scanner s = new Scanner (System.in);
		System.out.println("Please enter a number.");
		int x = s.nextInt(); // get a number from user
		System.out.println(factorial(x));
	} // main method end
	
	// factorial method
	public static int factorial (int x){
		if (x<0){
			return -1;
		} else if (x==0){
			return 1;
		} else{
			int product = x;
			while (x>1){
				product = product*(x-1);
				x--;
			}
			return product;
		}
	} // factorial method end
}
package ha;

import java.util.Scanner;

/**
 * 
 * sumDigits.java
 * This program determines the sum of the digits of a number.
 * Created March 31, 2017
 * @author Julie Ha
 *
 */

public class sumDigits {
	//main method
	public static void main(String[] args){
		Scanner s = new Scanner (System.in);
		System.out.println("Please enter a number.");
		int x = s.nextInt(); //get a number from user
		System.out.println(sumDigits(x));
	} //main method end
	
	//sumDigits method
	public static int sumDigits(int x){
		int total = 0; 
		while (x>0){
			total = total + x % 10;
			x = x/10;
		}
		return total;
	} //sumDigits method end
}

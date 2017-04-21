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
			if (num % i == 0)
				sum += i;
		}
		if (sum == num){
			return true;
		}
		return false;
	} // isPerfect Method end

}

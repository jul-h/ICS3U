package ha;

import java.util.Scanner;

/**
 * 
 * gcf.java
 * This program determines the GCF of two numbers.
 * Created March 31, 2017
 * @author Julie Ha
 *
 */

public class gcf {
	
	// main method
	public static void main(String[] args){
		Scanner s = new Scanner (System.in);
		System.out.println("Please enter a number.");
		int x = s.nextInt(); // get first number from user
		System.out.println("Please enter another number.");
		int y = s.nextInt(); // get second number from user
		System.out.println("The GCF of these two numbers are: " + gcf(x, y) + ".");
	}// main method end
	
	// isDivisble method
	public static boolean isDivisible(int a, int b){
		if (a%b==0){
			return true;
		}
		return false;
	} // isDivisible method end
	
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
		
		for (int i=low;i>0;i--){
			if (high % i == 0 && low % i == 0){
				return i;
			}
		}
		return 1;
	} // gcf method end
}

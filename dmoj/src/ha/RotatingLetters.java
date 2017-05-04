package ha;


import java.util.Scanner;

/**
 * This program determines whether or not a word will look the same after being rotated 180 degrees.
 * Created April 28, 2017
 * @author Julie Ha
 */

public class RotatingLetters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		int count = 0;

		for (int i = 0; i < word.length(); i++){
			if (word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'S' || word.charAt(i) == 'H' || word.charAt(i) == 'Z' || word.charAt(i) == 'X' || word.charAt(i) == 'N'){
				count++;
			}
		}
		
		// if all letters include I, O, S, H, Z, X, or N
		if (count == word.length())
			System.out.println("YES");
		
		// if not all letters include I, O, S, H, Z, X, or N
		if (count < word.length())
			System.out.println("NO");
		
	} // main method end

}

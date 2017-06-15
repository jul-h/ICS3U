package ha;

import java.util.Scanner;

public class NextInLine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		int age2 = scan.nextInt();
		System.out.println(age2 + (age2-age));
	}

}

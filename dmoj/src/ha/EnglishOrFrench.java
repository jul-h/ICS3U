package ha;


import java.util.Scanner;

public class EnglishOrFrench {

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		String num = scan.nextLine();
		int numLines = Integer.parseInt(num);
		int i = 0;
		int tCount = 0;
		int sCount = 0;
		while (i < numLines){
			String input = scan.nextLine();
			char[] inputArr = input.toCharArray();
			for (int n = 0; n < inputArr.length; n++){
				if (inputArr[n] == 't' || inputArr[n] == 'T'){
					tCount += 1;
				} 
				else if (inputArr[n] == 's' || inputArr[n] == 'S'){
					sCount += 1;
				}
				i++;
			}
			if (tCount > sCount){
				System.out.println("English");
			}
			else if (sCount > tCount){
				System.out.println("French");
			}
			else if (sCount == tCount){
				System.out.println("French");
			}
		}
	}
}

package ha;

import java.util.Scanner;

public class reverseSentence {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String word = s.nextString();
		String [] sentence = s.nextLine().split(" "); //splits sentence between spaces (each word) and sends to string array.
		for (int i = 0; i < sentence.length; i++){
			for (int j = sentence[i].length()-1; j>=0; j--){	//if the length is 7, indexes go from 0 to 6
				System.out.print(sentence[i].charAt(j));
			}
			System.out.print(" ");
		}
	}
}

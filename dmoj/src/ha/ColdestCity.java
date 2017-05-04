package ha;


import java.util.Scanner;

public class ColdestCity {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String city = null, coldestCity = null;
		int temp, coldestTemp = 0;
		
		do {
			city = scan.next();
			temp = scan.nextInt();
			if (temp < coldestTemp){
				coldestTemp = temp;
				coldestCity = city;
			}
		} while (!city.equals("Waterloo"));
		System.out.println(coldestCity);
		
	}

}

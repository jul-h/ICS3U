package ha;
import java.util.Scanner;

public class DigitalDigit {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num == 0)
			System.out.print(" * * * \n"
						   + "*     *\n"
						   + "*     *\n"
						   + "*     *\n"
						   + "*     *\n"
						   + "*     *\n"
						   + "*     *\n"
						   + " * * * ");
		else if (num == 1)
			System.out.print("     *\n"
						   + "     *\n"
						   + "     *\n"
						   + "     *\n"
						   + "     *\n"
						   + "     *");
		else if (num == 2)
			System.out.print(" * * * \n"
						   + "      *\n"
						   + "      *\n"
						   + "      *\n"
						   + " * * * \n"
						   + "*\n"
						   + "*\n"
						   + "*\n"
						   + " * * *");
		else if (num == 3)
			System.out.print(" * * * \n"
						   + "      *\n"
						   + "      *\n"
						   + "      *\n"
						   + " * * * \n"
						   + "      *\n"
						   + "      *\n"
						   + "      *\n"
						   + " * * *");
		else if (num == 4)
			System.out.print("*     *\n"
						   + "*     *\n"
						   + "*     *\n"
						   + " * * * \n"
						   + "      *\n"
						   + "      *\n"
						   + "      *");
		else if (num == 5)
			System.out.print(" * * * \n"
						   + "*\n"
						   + "*\n"
						   + "*\n"
						   + " * * * \n"
						   + "      *\n"
						   + "      *\n"
						   + "      *\n"
						   + " * * * ");
		else if (num == 6)
			System.out.print(" * * * \n"
						   + "*\n"
						   + "*\n"
						   + "*\n"
						   + " * * * \n"
						   + "*     *\n"
						   + "*     *\n"
						   + "*     *\n"
						   + " * * * ");
		else if (num == 7)
			System.out.print(" * * * \n"
						   + "      *\n"
						   + "      *\n"
						   + "      *\n"
						   + "      *\n"
						   + "      *\n"
						   + "      *");
		else if (num == 8)
			System.out.print(" * * * \n"
					   	   + "*     *\n"
					   	   + "*     *\n"
					   	   + "*     *\n"
					   	   + " * * * \n"
					   	   + "*     *\n"
					   	   + "*     *\n"
					   	   + "*     *\n"
					   	   + " * * * ");
		else if (num == 9)
			System.out.print(" * * * \n"
						   + "*     *\n"
						   + "*     *\n"
						   + "*     *\n"
						   + " * * * \n"
						   + "      *\n"
						   + "      *\n"
						   + "      *\n"
						   + " * * * ");
	}
}

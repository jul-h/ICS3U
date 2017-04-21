package ha;

/**
 * PythagoreanTriple.java
 * This program outputs pythagorean triples between 1 and 100.
 * Created April 20, 2017
 * @author Julie Ha
 */
public class PythagoreanTriple {
	public static void main(String[] args) {
		//double c = 0;
		int num = 0;
		for (int a = 1; a < 100; a++){
			for (int b = 1; b < 100; b++){
				for (int c = 1; c < Math.pow(a, 2) + Math.pow(b,  2); c++){
					if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c,  2) && perfectSquare(num)){
						System.out.println(a + " " + b + " " + c);
					}
					/*
					cSquare = (int) (Math.pow(a, 2) + Math.pow(b, 2));
					c = Math.sqrt(cSquare);
						if (perfectSquare(cSquare) == true){
							System.out.println(a + " " + b + " " + c);
						}
					 */
				}
			}
		}
	}


	public static boolean perfectSquare(int num){
		int srt = (int)Math.sqrt(num);
		double check = Math.pow(num, 2);
		if (num == check){
			return true;
		}
		return false;
	}
}

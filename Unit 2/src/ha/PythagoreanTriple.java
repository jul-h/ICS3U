package ha;

/**
 * PythagoreanTriple.java
 * This program outputs pythagorean triples between 1 and 100.
 * Created April 20, 2017
 * @author Julie Ha
 */
public class PythagoreanTriple {

	public static void main(String[] args) {
		System.out.println("Pythagorean triples are:");
		
		for (int a = 1; a < 100; a++){
			for (int b = 1; b < 100; b++){
				
				int cSquare = (int) (Math.pow(a, 2) + Math.pow(b, 2));
				int c = (int) (Math.sqrt(cSquare));
				
				if ((Math.pow(a,  2) + Math.pow(b,  2) == Math.pow(c,  2)) && perfectSquare(cSquare)){
					System.out.println(a + " " + b + " " + c);
				}
			}
		}
	}

	/**
	 * This method determines of c is a perfect square
	 * @param num
	 * @return true or false
	 */
	//perfectSquare method
	public static boolean perfectSquare(int num){
		int x = (int)Math.sqrt(num);
		double check = Math.pow(x, 2);
		
		if (num == check){
			return true;
		}
		return false;
	}
}

package ha;

import java.util.Scanner;

/**
 * Life.java
 * This program is a game that has a grid of cells and displays which cells are alive/dead depending on the number of neighbouring cells they have. (The Game of Life program by John Conway)
 * Created April 24, 2017
 * @author Julie Ha
 */

public class Life {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		char[][] grid = new char [20][20];
		char[][] changeGrid = new char [20][20];
		String input;

		System.out.println("Welcome to the Game of Life.");

		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++){
				grid[i][j] = 'o'; // o are dead cells
				changeGrid[i][j] = 'o';
			}
		} 

		System.out.println("How many cells would you like to have on the first day?");
		int numCells = scan.nextInt();

		while (numCells < 1 || numCells > 20){
			System.out.println(numCells + " is an invalid response. Please enter a number between 1 an 20 inclusive.");
			numCells = scan.nextInt();
		}

		System.out.println("Please enter the row and the column (separated by a single space) for where you want to have living cells on a 20 by 20 grid.");

		for (int count = 1; count <= numCells; count++) {

			int row = scan.nextInt()-1;
			int column = scan.nextInt()-1;

			while (row < 0 || column < 0 || row > 20 || column > 20){
				System.out.println((row + 1) + " " + (column + 1) + " is an invalid row/column. Your numbers for the row/column greater than 1 and less than 20 for the row/column. Try again.");
				row = scan.nextInt()-1;
				column = scan.nextInt()-1;
			}

			grid[row][column] = 'x'; // x are live cells
		}

		int day = 1; 

		System.out.println("Day " + day + ":");
		// prints out the world on the first day
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++){

				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}

		do {
			int neighbours = 0;
			day++;
			System.out.println();
			System.out.println("Day " + day + ":");

			for (int i = 0; i < grid.length; i++){
				neighbours = 0; // reset number of alive neighbours

				for (int j = 0; j < grid[i].length; j++){
					neighbours = 0; // reset number of alive neighbours

					// check if there is a neighbour on top left
					if (i > 0 && j > 0 && grid[i-1][j-1] == 'x')
						neighbours++;

					// check if there is a neighbour on top middle
					if (i > 0 && grid[i-1][j] == 'x')
						neighbours++;

					// check if there is a neighbour on top right
					if (i > 0 && j < 19 && grid[i-1][j+1] == 'x')
						neighbours++;

					// check if there is a neighbour on left
					if (j > 0 && grid[i][j-1] == 'x')
						neighbours++;

					// check if there is a neighbour on right
					if (j < 19 && grid[i][j+1] == 'x')
						neighbours++;

					// check if there is a neighbour on bottom left
					if (i < 19 && j > 0 && grid[i+1][j-1] == 'x')
						neighbours++;

					// check if there is a neighbour on bottom middle
					if (i < 19 && grid[i+1][j] == 'x')
						neighbours++;

					// check if there is a neighbour on bottom right
					if (i < 19 && j < 19 && grid[i+1][j+1] == 'x')
						neighbours++;


					// check number of neighbours
					if (grid[i][j] == 'x'){
						if (neighbours == 2 || neighbours == 3){
							changeGrid[i][j] = 'x';
						}
						else {
							changeGrid[i][j] = 'o';
						}
					} // if end

					else if (grid[i][j] == 'o'){
						if (neighbours == 3){
							changeGrid[i][j] = 'x';
						}
						else{
							changeGrid[i][j] = 'o';
						}
					} // else if end

				} // 2nd for loop end
			} // 1st for loop end


			int dead = 0; // counter to determine if all the cells are dead
			
			for(int i = 0; i < grid.length; i++){
				for(int j = 0; j < grid[i].length; j++){

					if (changeGrid[i][j] == 'x'){
						grid[i][j] = 'x';
						System.out.print(grid[i][j] + " ");
					}
					else{
						grid[i][j] = 'o';
						System.out.print(grid[i][j] + " ");
						dead++;
						if (dead == 400){
							System.out.println("\n\nAll the cells have died. \nThe Game of Life has ended.");
							System.exit(0); //terminate the program
						}
					}
				} // 2nd for loop end
				System.out.println();
			} // 1st for loop end
			
			System.out.println("\nDo you want to see the next day (yes or no)?");
			input = scan.next();

			// check if input is correct, avoid crashing/errors
			while (!(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no"))){
				System.out.println('\n' + "\"" + input+ "\"" + " is an invalid response. Please enter \"yes\" or \"no\".");
				input = scan.next();
			}

		} while (!(input.equalsIgnoreCase("no")));


		System.out.println("\nThe Game of Life has ended.");
	} // main method end

}


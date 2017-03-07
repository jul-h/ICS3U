package ha;

import java.awt.Color;

import hsa_new.Console;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * StrangerGame.java This program is a decision-based game. 
 * Created February 27, 2017
 * @author Julie Ha
 * @author Lachlan Gray
 *
 */
public class StrangerGame {

	public static void main(String[] args) throws InterruptedException {
		Console c = new Console();
		String input;
		// String a; //variable to see if the user pressed the space bar to
		// continue with the game
		do {
			c.println("It's a cold winter night...");
			/*
			 * a = c.readLine(); if (a.equals(" ")){
			 * 
			 * }
			 */
			// pause after every time program continues to tell the story, get
			// user to press space to continue with the game/story

			// Thread.sleep(2000);
			c.println(
					"You and your friend were just on your way home from a movie, when suddenly, you realize that you guys need bus fare.");
			// Thread.sleep(5000);
			c.println("You and your friend need bus fare. Ask the mysterious man nearby for bus fare, or find an ATM?");
			input = c.readLine(); // stores the response of the user
			while (!(input.equalsIgnoreCase("ask") || input.equalsIgnoreCase("atm"))) {
				c.setTextColor(Color.red);
				c.println("Invalid answer, please try again.");
				c.setTextColor(Color.black);
				input = c.readLine();
			}
			if (input.equalsIgnoreCase("atm")) {
				c.clear();
				c.print("The mysterious man follows you. Do you ");
				c.setTextColor(new Color(80, 145, 180)); // change text color to blue
				c.print("address him ");
				c.setTextColor(Color.black);
				c.print("or ");
				c.setTextColor(new Color(80, 145, 180));
				c.println("ignore him?");
				c.setTextColor(Color.black);
				input = c.readLine();
				// prevents program from crashing if user enters invalid
				// response
				while (!(input.equalsIgnoreCase("address him") || input.equalsIgnoreCase("ignore him"))) {
					c.setTextColor(Color.red);
					c.println("Invalid answer, please try again.");
					c.setTextColor(Color.black);
					input = c.readLine();
				}

				if (input.equalsIgnoreCase("ignore him")) {
					c.println("You and your friend get killed by the man.");
					Thread.sleep(1000);
				} else {
					c.print("He invites you both to his apartment. Do you accept his invitation? (");
					c.setTextColor(new Color(80, 145, 180));
					c.print("yes ");
					c.setTextColor(Color.black);
					c.print("or ");
					c.setTextColor(new Color(80, 145, 180));
					c.print("no");
					c.setTextColor(Color.black);
					c.println(")");
					input = c.readLine();
					while (!(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no"))) {
						c.setTextColor(Color.red);
						c.println("Invalid answer, please try again.");
						c.setTextColor(Color.black);
						input = c.readLine();
					}
					if (input.equalsIgnoreCase("yes")) {
						c.println("You and your friend go to his apartment and have an awesome time!");
						Thread.sleep(1000);
					} else {
						c.print("He robs both of you and leaves you on the street. Do you ");
						c.setTextColor(new Color(80, 145, 180));
						c.print("follow ");
						c.setTextColor(Color.black);
						c.print("him or ");
						c.setTextColor(new Color(80, 145, 180));
						c.print("find help");
						c.setTextColor(Color.black);
						c.println("?");
						input = c.readLine();
						while (!(input.equalsIgnoreCase("follow") || input.equalsIgnoreCase("find help"))) {
							c.println("Invalid answer, please try again.");
							input = c.readLine();
						}
						if (input.equalsIgnoreCase("follow")) {
							c.clear();
							c.print("You end up at his apartment. The door is unlocked. Do you enter? (");
							c.setTextColor(new Color(80, 145, 180));
							c.print("yes ");
							c.setTextColor(Color.black);
							c.print("or ");
							c.setTextColor(new Color(80, 145, 180));
							c.print("no");
							c.setTextColor(Color.black);
							c.println(")");
							input = c.readLine();
							while (!(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no"))) {
								c.setTextColor(Color.red);
								c.println("Invalid answer, please try again.");
								c.setTextColor(Color.black);
								input = c.readLine();
							}
							if (input.equalsIgnoreCase("yes")) {
								int x = (int) (Math.random() * 2 + 1);
								if (x == 2) {
									c.println(
											"You and your friend are devoured by the biggest rottweiler you've ever seen.");
									Thread.sleep(1000);
								} else {
									c.println("You find your stuff and get away safely.");
									Thread.sleep(1000);
								}
							} else {
								c.println("You give up and go home defeated.");
								Thread.sleep(1000);
							}
						} else {
							int x = (int) (Math.random() * 2 + 1);
							if (x == 1) {
								c.println("The man is apprehended, and you get your stuff back.");
								Thread.sleep(1000);
							} else {
								c.println("You wake up in the hospital");
								Thread.sleep(1000);
							}
						}
					}
				}
				c.print("Play again? (");
				c.setTextColor(new Color(80, 145, 180));
				c.print("yes ");
				c.setTextColor(Color.black);
				c.print("or ");
				c.setTextColor(new Color(80, 145, 180));
				c.print("no");
				c.setTextColor(Color.black);
				c.println(")?");
				input = c.readLine();
				c.clear();
			}
		} while (input.equalsIgnoreCase("yes"));
		c.clear();
		c.close(); //close the console
	}
}

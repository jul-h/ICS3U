package ha;

import java.awt.Color;

import hsa_new.Console;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.xml.crypto.Data;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 *
 * StrangerGame.java This program is a decision-based game. 
 * Created February 27, 2017
 * @author Julie Ha
 * @author Lachlan Gray
 *
 */
public class StrangerGame { 
	static Console c = new Console(30,100);
	static String input;
	
	// print each letter one by one
	public static void text(String data) throws InterruptedException{
		for (int i = 0; i < data.length(); i++) {
			//c.setTextBackgroundColor(Color.);
			c.print(data.charAt(i));
			Thread.sleep(50);
			/*
			String sentenceEnd = ". ";
			if (data.contains(sentenceEnd)){
				Thread.sleep(1000);
			} else {
				Thread.sleep(60);
			}
			*/
		}
	}

	// check if input is valid
	public static void checkInput() throws InterruptedException{
		while (!(input.equalsIgnoreCase("a") || input.equalsIgnoreCase("b"))) {
			c.setTextColor(Color.red);
			text("Invalid answer, please try again." + '\n');
			c.setTextColor(Color.black);
			input = c.readLine();
		}
	}

	// main method
	public static void main(String[] args) throws InterruptedException {
		Boolean flag = false; // used in int checks
	
		BufferedImage jpgStreet = null;
		BufferedImage jpgDog = null;
		BufferedImage pngScrewdriver = null;
		BufferedImage png2x4 = null;
		BufferedImage pngBaseballBat = null;
		// String a; //variable to see if the user pressed the space bar
		// continue with the game
		do { 
			c.clear();
			 try{ 
				 jpgStreet = ImageIO.read(new File("resources/images/snowyStreet.jpg")); 
			 } catch (IOException e) {
			 System.err.println("There was an error loading the image.");
			 e.printStackTrace(); 
			 } 
			 c.drawImage(jpgStreet, -100, -50, 1067, 711, null);
			text("It's a cold winter night... "
					+ "You and your friend were just on your way home from a movie, when suddenly, you realize that you guys need bus fare. What do you do?" 
					+ '\n');
			c.setTextColor(new Color(80, 145, 180));
			text("a)");
			c.setTextColor(Color.black);
			text(" Find an ATM." + '\n');
			c.setTextColor(new Color(80, 145, 180));
			text("b)");
			c.setTextColor(Color.black);
			text(" Ask the mysterious man nearby for bus fare." + '\n');
			
			// pause after every time program continues to tell the story, get
			// user to press space to continue with the game/story???
			input = c.readLine(); // stores the response of the user
			checkInput();
			if (input.equalsIgnoreCase("a")) {
				c.clear();
				text("The mysterious man follows you. What do you do?" + '\n');
				c.setTextColor(new Color(80, 145, 180)); // change text color to blue
				text("a)");
				c.setTextColor(Color.black);
				text(" Ignore him." + '\n');
				c.setTextColor(new Color(80, 145, 180));
				text("b)");
				c.setTextColor(Color.black); 
				text(" Address him." + '\n');
				input = c.readLine();
				// prevents program from crashing if user enters invalid response
				checkInput();
				if (input.equalsIgnoreCase("a")) {
					c.clear();
					text("You and your friend get killed by the man." + '\n');
					Thread.sleep(1000);
				} else {
					text("He invites you both to his apartment. Do you accept his invitation?" + '\n');
					c.setTextColor(new Color(80, 145, 180));
					text("a)");
					c.setTextColor(Color.black);
					text(" Yes" + '\n');
					c.setTextColor(new Color(80, 145, 180));
					text("b)");
					c.setTextColor(Color.black);
					text(" No" + '\n');
					input = c.readLine();
					checkInput();
					if (input.equalsIgnoreCase("a")) {
						c.clear();
						text("You and your friend go to his apartment and have an awesome time!" + '\n');
						Thread.sleep(1000);
					} else {
						text("He robs both of you and leaves you on the street. What do you do?" + '\n');
						c.setTextColor(new Color(80, 145, 180));
						text("a)");
						c.setTextColor(Color.black);
						text(" Follow him." + '\n');
						c.setTextColor(new Color(80, 145, 180));
						text("b)");
						c.setTextColor(Color.black);
						text(" Find help." + '\n');
						input = c.readLine();
						checkInput();
						if (input.equalsIgnoreCase("a")) {
							c.clear();
							text("You end up at his apartment. The door is unlocked. Do you enter?" + '\n');
							c.setTextColor(new Color(80, 145, 180));
							text("a)");
							c.setTextColor(Color.black);
							text(" Yes." + '\n');
							c.setTextColor(new Color(80, 145, 180));
							text("b)");
							c.setTextColor(Color.black);
							text(" No." +'\n');
							input = c.readLine();
							checkInput();
							if (input.equalsIgnoreCase("a")) {
								int x = (int) (Math.random() * 2 + 1);
								if (x == 2) {
									try{
										jpgDog = ImageIO.read(new File("resources/images/dog.jpg"));
									} catch (IOException e) {
										System.err.println("There was an error loading the image.");
										e.printStackTrace();
									}
									c.drawImage(jpgDog, 0, 0, null);
									text("You and your friend are devoured by the biggest rottweiler you've ever seen." + '\n');
									Thread.sleep(1000);
								} else {
									text("You find your stuff and get away safely." + '\n');
									Thread.sleep(1000);
								}
							} else {
								text("You give up and go home defeated." + '\n');
								Thread.sleep(1000);
							}
						} else {
							int x = (int) (Math.random() * 2 + 1);
							if (x == 1) {
								text("The man is apprehended, and you get your stuff back." + '\n');
								Thread.sleep(1000);
							} else {
								text("You wake up in the hospital" + '\n');
								Thread.sleep(1000);
							}
						}
					}
				}
			} else {
				int x = (int) (Math.random() * 3);
				if (x == 1) {
					text("You and your friend get your bus fare and go home." + '\n');
				} else {
					c.clear();
					text("The man pulls a knife on you and your friend. What do you do?" + '\n');
					c.setTextColor(new Color(80, 145, 180));
					text("a)");
					c.setTextColor(Color.black);
					text(" Fight." + '\n');
					c.setTextColor(new Color(80, 145, 180));
					text("b)");
					c.setTextColor(Color.black);
					text(" Run." + '\n');
					input = c.readLine();
					checkInput();
					if (input.equalsIgnoreCase("a")) {
						c.clear();
						text("You die tragically, but your friend escapes safely" + '\n'); // ending
					} else {
						c.clear();
						text("You get away but the man apprehends your friend. What do you do?" + '\n');
						c.setTextColor(new Color(80, 145, 180));
						text("a)");
						c.setTextColor(Color.black);
						text(" Run." + '\n');
						c.setTextColor(new Color(80, 145, 180));
						text("b)");
						c.setTextColor(Color.black);
						text(" Help your friend." + '\n');
						input = c.readLine();
						checkInput();
						if (input.equalsIgnoreCase("a")) {
							c.clear();
							text("You escape safely but your friend is slain." + '\n'); // ending

						} else {
							text("Do you try to negotiate or fight?" + '\n');
							c.setTextColor(new Color(80, 145, 180));
							text("a)");
							c.setTextColor(Color.black);
							text(" Negotiate." + '\n');
							c.setTextColor(new Color(80, 145, 180));
							text("b)");
							c.setTextColor(Color.black);
							text(" Fight." + '\n');
							input = c.readLine();
							checkInput();
							if (input.equalsIgnoreCase("a")) {
								x = (int) (Math.random() * 11);
								System.err.println(x); // for testing purposes
								text("Guess a number from ");
								c.setTextColor(new Color(80, 145, 180));
								text("1 to 10");
								c.setTextColor(Color.black);
								text(", you have 3 chances to guess correctly." + '\n');
								int guess = 0;
								for (int i = 0; i < 3; i++) {
									flag = true;

									while (flag.equals(true)) {
										try {
											guess = Integer.parseInt(c.readLine());
											if (guess < 1 || guess > 10) {
												text("Invalid answer, please try again." + '\n');

												flag = true;
											} else {
												flag = false;
											}
										} catch (NumberFormatException e) {
											text("Invalid answer, please try again." + '\n');
											System.err.println(e.getMessage());
											flag = true;
										} // try/catch end
									} // while structure end
									if (guess == x) {
										i = 4;
										c.clear();
										text("You negotiated successfully, you and your friend go home safely" + '\n'); // ending
									} else {
										text("You guessed incorrectly. Try again." + '\n');
										if (i == 2){
											c.clear();
											text("You failed to negotiate and the man kills both of you." + '\n'); // ending
										}
									}
								} // for loop end
							} else {
								text("Do you fight immediately or find a weapon?" + '\n');
								c.setTextColor(new Color(80, 145, 180));
								text("a)");
								c.setTextColor(Color.black);
								text(" Fight immediately." + '\n');
								c.setTextColor(new Color(80, 145, 180));
								text("b)");
								c.setTextColor(Color.black);
								text(" Find a weapon." + '\n');
								input = c.readLine();
								checkInput();
								if (input.equalsIgnoreCase("a")) {
									c.clear();
									text("You and your friend die because you attacked an armed man without a weapon." +'\n'); // ending
								} else {
									c.clear();
									String[] weapons = { " a screwdriver", " a 2x4", " a baseball bat" };
									for (int i = 0; i < 3; i++) {
										if (i == 0){
											try{
												pngScrewdriver = ImageIO.read(new File("resources/images/screwdriver.png"));
											} catch (IOException e) {
												System.err.println("There was an error loading the image.");
												e.printStackTrace();
											}
											c.drawImage(pngScrewdriver, 0, 55, 200, 200, null);
										}
										else if (i == 1) {
											c.clear();
											try{
												png2x4 = ImageIO.read(new File("resources/images/2x4.png"));
											} catch (IOException e) {
												System.err.println("There was an error loading the image.");
												e.printStackTrace();
											}
											c.drawImage(png2x4, 0, 55, 200, 200, null);
										}
										else if (i == 2){
											c.clear();
											try{
												pngBaseballBat = ImageIO.read(new File("resources/images/baseballBat.png"));
											} catch (IOException e) {
												System.err.println("There was an error loading the image.");
												e.printStackTrace();
											}
											c.drawImage(pngBaseballBat, 0, 55, 200, 200, null);
										}
										text("There is");
										c.setTextColor(Color.green);
										text(weapons[i]);
										c.setTextColor(Color.black);
										text(". Do you pick it up or find a better weapon?" + '\n');
										c.setTextColor(new Color(80, 145, 180));
										text("a)");
										c.setTextColor(Color.black);
										text(" Pick it up." + '\n');
										c.setTextColor(new Color(80, 145, 180));
										text("b)");
										c.setTextColor(Color.black);
										text(" Find a better weapon." + '\n');
										input = c.readLine();
										checkInput();
										if (input.equalsIgnoreCase("a")) {
											c.clear();
											int weaponStrength = (i + 1) * 2; // determines likelihood of success
											x = (int) (Math.random() * 9);
											if (x <= weaponStrength) {
												text("You overpower the man, you and your friend escape safely." +'\n'); // ending
												i = 3;
											} else {
												text("You fail your attack, and you both die." + '\n'); // ending
												i = 3;
											}

										} else {
											c.clear();
											text("Your friend died because you took too long to decide on a weapon to use." + '\n');
										}
									} // for end

								} // if/else end

							}

						}

					}

				}

			}
			text("Play again?" + '\n');
			c.setTextColor(new Color(80, 145, 180));
			text("a)");
			c.setTextColor(Color.black);
			text(" Yes." + '\n');
			c.setTextColor(new Color(80, 145, 180));
			text("b)");
			c.setTextColor(Color.black);
			text(" No." + '\n');
			input = c.readLine();
			checkInput();
		} while (input.equalsIgnoreCase("a"));
		c.clear();
		c.close(); // close the console
	}
}
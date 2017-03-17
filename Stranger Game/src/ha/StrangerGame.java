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

	public static void text(String data) throws InterruptedException{
		// print each letter one by one
		for (int i = 0; i < data.length(); i++) {
			//c.setTextBackgroundColor(Color.);
			c.print(data.charAt(i));
			Thread.sleep(60);
			/*
			String sentenceEnd = ". ";
			if (data.contains(sentenceEnd)){
				Thread.sleep(1000);
			} else {
				Thread.sleep(60);
			}
			*/
		}
		c.println("");
	}

	public static void main(String[] args) throws InterruptedException {
		Boolean flag = false; // used in int checks
		String input;

		// String a; //variable to see if the user pressed the space bar
		// continue with the game
		do {
			BufferedImage jpgStreet = null; 
			 try{ 
				 jpgStreet = ImageIO.read(new File("resources/images/snowyStreet.jpg")); 
			 } catch (IOException e) {
			 System.err.println("There was an error loading the image.");
			 e.printStackTrace(); 
			 } 
			 c.drawImage(jpgStreet, -100, -50, 1067, 711, null);
			text("It's a cold winter night... " + '\n'
					+ "You and your friend were just on your way home from a movie, when suddenly, you realize that you guys need bus fare. "
					+ '\n' + "Ask the mysterious man nearby for bus fare, or find an ATM?");
			// pause after every time program continues to tell the story, get
			// user to press space to continue with the game/story

			input = c.readLine(); // stores the response of the user
			while (!(input.equalsIgnoreCase("ask") || input.equalsIgnoreCase("atm"))) {
				c.setTextColor(Color.red);
				text("Invalid answer, please try again." + '\n');
				c.setTextColor(Color.black);
				input = c.readLine();
			}
			if (input.equalsIgnoreCase("atm")) {
				c.clear();
				text("The mysterious man follows you. Do you ");
				c.setTextColor(new Color(80, 145, 180)); // change text color to blue
				text("address him ");
				c.setTextColor(Color.black);
				text("or ");
				c.setTextColor(new Color(80, 145, 180));
				text("ignore him?" + '\n');
				c.setTextColor(Color.black); 
				input = c.readLine();
				// prevents program from crashing if user enters invalid
				// response
				while (!(input.equalsIgnoreCase("address him") || input.equalsIgnoreCase("ignore him"))) {
					c.setTextColor(Color.red);
					text("Invalid answer, please try again." +'\n');
					c.setTextColor(Color.black);
					input = c.readLine();
				}

				if (input.equalsIgnoreCase("ignore him")) {
					text("You and your friend get killed by the man." + '\n');
					Thread.sleep(1000);
				} else {
					text("He invites you both to his apartment. Do you accept his invitation? (");
					c.setTextColor(new Color(80, 145, 180));
					text("yes ");
					c.setTextColor(Color.black);
					text("or ");
					c.setTextColor(new Color(80, 145, 180));
					text("no");
					c.setTextColor(Color.black);
					text(")" + '\n');
					input = c.readLine();
					while (!(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no"))) {
						c.setTextColor(Color.red);
						text("Invalid answer, please try again." + '\n');
						c.setTextColor(Color.black);
						input = c.readLine();
					}
					if (input.equalsIgnoreCase("yes")) {
						text("You and your friend go to his apartment and have an awesome time!" + '\n');
						Thread.sleep(1000);
					} else {
						text("He robs both of you and leaves you on the street. Do you ");
						c.setTextColor(new Color(80, 145, 180));
						text("follow ");
						c.setTextColor(Color.black);
						text("him or ");
						c.setTextColor(new Color(80, 145, 180));
						text("find help");
						c.setTextColor(Color.black);
						text("?" + '\n');
						input = c.readLine();
						while (!(input.equalsIgnoreCase("follow") || input.equalsIgnoreCase("find help"))) {
							text("Invalid answer, please try again." + '\n');
							input = c.readLine();
						}
						if (input.equalsIgnoreCase("follow")) {
							c.clear();
							text("You end up at his apartment. The door is unlocked. Do you enter? (");
							c.setTextColor(new Color(80, 145, 180));
							text("yes ");
							c.setTextColor(Color.black);
							text("or ");
							c.setTextColor(new Color(80, 145, 180));
							text("no");
							c.setTextColor(Color.black);
							text(")" +'\n');
							input = c.readLine();
							while (!(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no"))) {
								c.setTextColor(Color.red);
								text("Invalid answer, please try again." + '\n');
								c.setTextColor(Color.black);
								input = c.readLine();
							}
							if (input.equalsIgnoreCase("yes")) {
								int x = (int) (Math.random() * 2 + 1);
								if (x == 2) {
									BufferedImage jpgDog = null; 
									try{
										jpgDog = ImageIO.read(new File("resources/angry dog.jpg"));
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
					text("The man pulls a knife on you and your friend. Do you ");
					c.setTextColor(new Color(80, 145, 180));
					text("fight");
					c.setTextColor(Color.black);
					text(", or do you ");
					c.setTextColor(new Color(80, 145, 180));
					text("run");
					c.setTextColor(Color.black);
					text("?" + '\n');
					input = c.readLine();
					while (!(input.equalsIgnoreCase("run") || input.equalsIgnoreCase("fight"))) {
						text("Invalid answer, please try again." + '\n');
						input = c.readLine();
					} // checks for valid input
					if (input.equalsIgnoreCase("fight")) {
						text("You die tragically, but your friend escapes safely" + '\n'); // ending
					} else {
						text("You get away but the man apprehends your friend. Do you ");
						c.setTextColor(new Color(80, 145, 180));
						text("run");
						c.setTextColor(Color.black);
						text(", or ");
						c.setTextColor(new Color(80, 145, 180));
						text("help");
						c.setTextColor(Color.black);
						text("?" + '\n');
						input = c.readLine();
						while (!(input.equalsIgnoreCase("run") || input.equalsIgnoreCase("help"))) {
							text("Invalid answer, please try again." + '\n');
							input = c.readLine();
						}
						if (input.equalsIgnoreCase("run")) {
							text("You escape safely but your friend is slain." + '\n'); // ending

						} else {
							text("do you try to ");
							c.setTextColor(new Color(80, 145, 180));
							text("negotiate");
							c.setTextColor(Color.black);
							text(", or ");
							c.setTextColor(new Color(80, 145, 180));
							text("fight");
							c.setTextColor(Color.black);
							text("?" + '\n');
							input = c.readLine();
							while (!(input.equalsIgnoreCase("negotiate") || input.equalsIgnoreCase("fight"))) {
								text("Invalid answer, please try again." + '\n');
								input = c.readLine();
							}
							if (input.equalsIgnoreCase("negotiate")) {
								x = (int) (Math.random() * 11);
								System.err.println(x); // for testing purposes
								text("Guess a number from ");
								c.setTextColor(new Color(80, 145, 180));
								text("1 to 10");
								c.setTextColor(Color.black);
								text(", you have 3 chances to guess right" + '\n');
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
										text("You negotiated successfully, you and your friend go home safely" + '\n'); // ending
									} else {
										text("you guessed wrong" + '\n');
										if (i == 2)
											text("You failed to negotiate" + '\n'); // ending
									}
								}

								// for loop end
							} else {

								text("Do you ");
								c.setTextColor(new Color(80, 145, 180));
								text("pick up a weapon");
								c.setTextColor(Color.black);
								text(", or ");
								c.setTextColor(new Color(80, 145, 180));
								text("fight immediately");
								c.setTextColor(Color.black);
								text("?" + '\n');
								input = c.readLine();
								while (!(input.equalsIgnoreCase("pick up a weapon") || input.equalsIgnoreCase("fight immediately"))) {
									text("Invalid answer, please try again." + '\n');
									input = c.readLine();
								}
								if (input.equalsIgnoreCase("fight immediately")) {
									text("You and your friend die because you attacked an armed man without a weapon." +'\n'); // ending
								} else {
									String[] weapons = { " a screwdriver", " a 2x4", " a baseball bat" };
									for (int i = 0; i < 3; i++) {
										text("There is");
										c.setTextColor(Color.green);
										text(weapons[i]);
										c.setTextColor(Color.black);
										text(". Do you ");
										c.setTextColor(new Color(80, 145, 180));
										text("pick it up");
										c.setTextColor(Color.black);
										text(", or ");
										c.setTextColor(new Color(80, 145, 180));
										text("find a better weapon");
										c.setTextColor(Color.black);
										text("?" + '\n');
										input = c.readLine();
										while (!(input.equalsIgnoreCase("pick it up") || input.equalsIgnoreCase("find a better weapon"))) {
											text("Invalid answer, please try again." + '\n');
											input = c.readLine();
										}
										if (input.equalsIgnoreCase("pick it up")) {
											int weaponStrength = (i + 1) * 2; // determines likelihood of success
											x = (int) (Math.random() * 9);
											if (x <= weaponStrength) {
												text("You overpower the man, you and your friend escape safely." +'\n'); // ending
												i = 3;
											} else {
												text("You fail your attack, and you both die." + '\n'); // ending
												i = 3;
											}

										}
									} // for end

								} // if/else end

							}

						}

					}

				}

			}
			text("Play again? (");
			c.setTextColor(new Color(80, 145, 180));
			text("yes ");
			c.setTextColor(Color.black);
			text("or ");
			c.setTextColor(new Color(80, 145, 180));
			text("no");
			c.setTextColor(Color.black);
			text(")?" + '\n');
			input = c.readLine();
			c.clear();
		} while (input.equalsIgnoreCase("yes"));
		c.clear();
		c.close(); // close the console
	}
}
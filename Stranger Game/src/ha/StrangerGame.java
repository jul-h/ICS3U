package ha;

import java.awt.Color;

import hsa_new.Console;

import javax.xml.crypto.Data;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 *
 * StrangerGame.java 
 * This program is a decision-based game. 
 * Created February 27, 2017
 * @author Julie Ha & Lachlan Gray
 *
 */
public class StrangerGame { 
	static Console c = new Console(39, 95, 13, "S T R A N G E R"); // The output console
	static String input; // variable to store user input

	//text method
	public static void text(String data) throws InterruptedException{
		char[] stringToCharArray = data.toCharArray();
		// print each letter one by one
		for (int i = 0; i < stringToCharArray.length; i++){
			c.print(stringToCharArray[i]);
			Thread.sleep(50); // pause program for specified amount of time in milliseconds
			if (stringToCharArray[i]== '.'){
				Thread.sleep(500);
			} else if (stringToCharArray[i] == '?'){
				Thread.sleep(700);
			}
		}
	} // text method end

	// check if input is valid
	public static void checkInput() throws InterruptedException{
		while (!(input.equalsIgnoreCase("a") || input.equalsIgnoreCase("b"))) {
			c.setTextColor(Color.red); // change text color to red
			text("Invalid answer, please try again." + '\n');
			c.setTextColor(Color.black);
			input = c.readLine();
		}
	} // checkInput method end

	// main method
	public static void main(String[] args) throws InterruptedException {
		Boolean flag = false; // used in int checks

		// load images
		BufferedImage jpgStreet = null;
		BufferedImage pngTwoFriends = null;
		BufferedImage jpgTwoFriends2 = null;
		BufferedImage jpgStranger = null;
		BufferedImage jpgStrangerKnife = null;
		BufferedImage jpgStrangerKnife2 = null;
		BufferedImage jpgStrangerKnife3 = null;
		BufferedImage jpgStrangerKnife4 = null;
		BufferedImage jpgFriends = null;
		BufferedImage pngMan = null;
		BufferedImage pngScrewdriver = null;
		BufferedImage png2x4 = null;
		BufferedImage pngBaseballBat = null;
		BufferedImage jpgDoor = null;
		BufferedImage jpgDog = null;
		BufferedImage jpgCoats = null;
		BufferedImage jpgHostage = null;
		BufferedImage jpgHospital = null;
		BufferedImage jpgStairs = null;
		BufferedImage jpgHandcuffed = null;

		do { 
			c.clear(); // clear console
			try{ 
				jpgStreet = ImageIO.read(new File("resources/images/snowyStreet.jpg")); 
			} catch (IOException e) {
				System.err.println("There was an error loading the image.");
				e.printStackTrace(); 
			} 
			c.drawImage(jpgStreet, -100, 100, 941, 628, null); // shows image
			try {
				Clip wind = AudioSystem.getClip(); // create the clip object
				wind.open(AudioSystem.getAudioInputStream(new File("resources/audio/wind.wav"))); // open the given file for the clip
				wind.start(); // start sound
				text("It's a cold winter night. You and your friend were just on your way home from a movie, when "
						+ '\n'+ "suddenly, you realize that you guys need bus fare. What do you do?" 
						+ '\n');
				wind.loop(Clip.LOOP_CONTINUOUSLY); // loop sound
				c.setTextColor(new Color(15, 152, 152));
				text("a)");
				c.setTextColor(Color.black);
				text(" Find an ATM." + '\n');
				c.setTextColor(new Color(15, 152, 152));
				text("b)");
				c.setTextColor(Color.black);
				text(" Ask the mysterious man nearby for bus fare." + '\n');
				input = c.readLine(); // gets and stores the response of the user
				checkInput(); // prevents program from crashing if user enters invalid response
				wind.stop(); // stop sound
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (input.equalsIgnoreCase("a")) {
				c.clear();
				try{ 
					jpgStranger = ImageIO.read(new File("resources/images/stranger.jpg")); 
				} catch (IOException e) {
					System.err.println("There was an error loading the image.");
					e.printStackTrace(); 
				} 
				c.drawImage(jpgStranger, 0, 100, 782, 722, null);
				try {
					Clip footsteps = AudioSystem.getClip(); 
					footsteps.open(AudioSystem.getAudioInputStream(new File("resources/audio/footsteps.wav")));
					footsteps.start(); //start sound
					footsteps.loop(Clip.LOOP_CONTINUOUSLY);
					text("The mysterious man follows you. What do you do?" + '\n');
					c.setTextColor(new Color(15, 152, 152));
					text("a)");
					c.setTextColor(Color.black);
					text(" Ignore him." + '\n');
					c.setTextColor(new Color(15, 152, 152));
					text("b)");
					c.setTextColor(Color.black); 
					text(" Address him." + '\n');
					input = c.readLine();
					checkInput(); 
					footsteps.stop(); 
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (input.equalsIgnoreCase("a")) {
					c.clear();
					try{ 
						jpgStrangerKnife = ImageIO.read(new File("resources/images/strangerKnife.jpg")); 
					} catch (IOException e) {
						System.err.println("There was an error loading the image.");
						e.printStackTrace(); 
					} 
					c.drawImage(jpgStrangerKnife, 0, 100, 782, 722, null);
					try {
						Clip stabbing = AudioSystem.getClip(); 
						stabbing.open(AudioSystem.getAudioInputStream(new File("resources/audio/stabbing.wav"))); 
						Clip scream1 = AudioSystem.getClip();
						scream1.open(AudioSystem.getAudioInputStream(new File("resources/audio/scream1.wav")));
						Clip scream2 = AudioSystem.getClip(); 
						scream2.open(AudioSystem.getAudioInputStream(new File("resources/audio/scream2.wav"))); 
						stabbing.start(); 
						stabbing.loop(Clip.LOOP_CONTINUOUSLY);
						scream1.start();
						scream2.start();
						text("You and your friend get killed by the man." + '\n'); //ending
						Thread.sleep(3000);
						stabbing.stop();
						scream1.stop();
						scream2.stop();
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else {
					c.clear();
					try{ 
						pngMan = ImageIO.read(new File("resources/images/man.png")); 
					} catch (IOException e) {
						System.err.println("There was an error loading the image.");
						e.printStackTrace(); 
					} 
					c.drawImage(pngMan, 0, 100, 782, 722, null);
					text("He invites you both to his apartment. Do you accept his invitation?" + '\n');
					c.setTextColor(new Color(15, 152, 152));
					text("a)");
					c.setTextColor(Color.black);
					text(" Yes." + '\n');
					c.setTextColor(new Color(15, 152, 152));
					text("b)");
					c.setTextColor(Color.black);
					text(" No." + '\n');
					input = c.readLine();
					checkInput();
					if (input.equalsIgnoreCase("a")) {
						c.clear();
						try{ 
							jpgFriends = ImageIO.read(new File("resources/images/friends.jpg")); 
						} catch (IOException e) {
							System.err.println("There was an error loading the image.");
							e.printStackTrace(); 
						} 
						c.drawImage(jpgFriends, 0, 100, 782, 722, null);
						try {
							Clip footsteps = AudioSystem.getClip(); 
							footsteps.open(AudioSystem.getAudioInputStream(new File("resources/audio/footsteps.wav"))); 
							footsteps.start(); //start sound
							text("You and your friend go to his apartment and have an awesome time!" + '\n'); //ending
							Thread.sleep(3000);
							footsteps.stop();
						} catch (Exception e) {
							e.printStackTrace();
						}
					} else {
						c.clear();
						try{ 
							jpgStranger = ImageIO.read(new File("resources/images/stranger.jpg")); 
						} catch (IOException e) {
							System.err.println("There was an error loading the image.");
							e.printStackTrace(); 
						} 
						c.drawImage(jpgStranger, 0, 100, 782, 722, null);
						try {
							Clip running2 = AudioSystem.getClip(); 
							running2.open(AudioSystem.getAudioInputStream(new File("resources/audio/running2.wav"))); 
							running2.start();
							text("He robs both of you and leaves you in the alley. What do you do?" + '\n');
							Thread.sleep(1500);
							running2.stop();
						} catch (Exception e) {
							e.printStackTrace();
						}
						c.setTextColor(new Color(15, 152, 152));
						text("a)");
						c.setTextColor(Color.black);
						text(" Follow him." + '\n');
						c.setTextColor(new Color(15, 152, 152));
						text("b)");
						c.setTextColor(Color.black);
						text(" Find help." + '\n');
						input = c.readLine();
						checkInput();
						if (input.equalsIgnoreCase("a")) {
							c.clear();
							try{ 
								jpgDoor = ImageIO.read(new File("resources/images/door.jpg")); 
							} catch (IOException e) {
								System.err.println("There was an error loading the image.");
								e.printStackTrace(); 
							} 
							c.drawImage(jpgDoor, 150, 75, 429, 644, null);
							text("You end up at his apartment. The door is unlocked. Do you enter?" + '\n');
							c.setTextColor(new Color(15, 152, 152));
							text("a)");
							c.setTextColor(Color.black);
							text(" Yes." + '\n');
							c.setTextColor(new Color(15, 152, 152));
							text("b)");
							c.setTextColor(Color.black);
							text(" No." +'\n');
							input = c.readLine();
							checkInput();
							if (input.equalsIgnoreCase("a")) {
								int x = (int) (Math.random() * 2 + 1); // chooses a random number between 1 and 2 
								if (x == 2) {
									c.clear();
									try{
										jpgDog = ImageIO.read(new File("resources/images/dog.jpg"));
									} catch (IOException e) {
										System.err.println("There was an error loading the image.");
										e.printStackTrace();
									}
									c.drawImage(jpgDog, -105, 95, null);
									try {
										Clip dog = AudioSystem.getClip(); 
										dog.open(AudioSystem.getAudioInputStream(new File("resources/audio/dog.wav"))); 
										dog.start(); 
										text("You and your friend are devoured by the biggest rottweiler you've ever seen." + '\n'); //ending
										Thread.sleep(5000);
										dog.stop(); 
									} catch (Exception e) {
										e.printStackTrace();
									}
								} else {
									c.clear();
									try{ 
										jpgCoats = ImageIO.read(new File("resources/images/coats.jpg")); 
									} catch (IOException e) {
										System.err.println("There was an error loading the image.");
										e.printStackTrace(); 
									} 
									c.drawImage(jpgCoats, 170, 75, 429, 644, null);
									text("You find your stuff and get away safely." + '\n'); //ending
									Thread.sleep(1000);
								}
							} else {
								c.clear();
								try{ 
									jpgStairs = ImageIO.read(new File("resources/images/stairs.jpg")); 
								} catch (IOException e) {
									System.err.println("There was an error loading the image.");
									e.printStackTrace(); 
								} 
								c.drawImage(jpgStairs, -100, 100, 941, 628, null);
								text("You give up and go home defeated." + '\n');
								Thread.sleep(1000);
							}
						} else {
							int x = (int) (Math.random() * 2 + 1);
							if (x == 1) {
								c.clear();
								try{ 
									jpgHandcuffed = ImageIO.read(new File("resources/images/handcuffed.jpg")); 
								} catch (IOException e) {
									System.err.println("There was an error loading the image.");
									e.printStackTrace(); 
								} 
								c.drawImage(jpgHandcuffed, 0, 110, 770, 705, null);
								try {
									Clip handcuffs = AudioSystem.getClip(); 
									handcuffs.open(AudioSystem.getAudioInputStream(new File("resources/audio/handcuffs.wav"))); 
									handcuffs.start(); 
									text("The man is apprehended, and you get your stuff back." + '\n'); //ending
									Thread.sleep(3000);
									handcuffs.stop();
								} catch (Exception e) {
									e.printStackTrace();
								}
							} else {
								c.clear();
								try{
									jpgHospital = ImageIO.read(new File("resources/images/hospital.jpg"));
								} catch (IOException e) {
									System.err.println("There was an error loading the image.");
									e.printStackTrace();
								}
								c.drawImage(jpgHospital, 0, 110, 774, 617, null);
								try {
									Clip heart = AudioSystem.getClip();
									heart.open(AudioSystem.getAudioInputStream(new File("resources/audio/heart.wav")));
									heart.start(); 
									text("You wake up in the hospital. You had passed out from hypothermia, since the stranger took your jacket." + '\n'); //ending
									Thread.sleep(6000);
									heart.stop();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						}
					}
				}
			} else {
				int x = (int) (Math.random() * 3);
				if (x == 1) {
					c.clear();
					try{ 
						pngTwoFriends = ImageIO.read(new File("resources/images/twoFriends.png")); 
					} catch (IOException e) {
						System.err.println("There was an error loading the image.");
						e.printStackTrace(); 
					} 
					c.drawImage(pngTwoFriends, -100, 100, 941, 628, null);
					try {
						Clip wind = AudioSystem.getClip(); 
						wind.open(AudioSystem.getAudioInputStream(new File("resources/audio/wind.wav"))); 
						Clip footsteps = AudioSystem.getClip();
						footsteps.open(AudioSystem.getAudioInputStream(new File("resources/audio/footsteps.wav")));
						wind.start(); 
						footsteps.start();
						text("You and your friend get your bus fare and go home." + '\n'); //ending
						Thread.sleep(4000);
						wind.stop();
						footsteps.stop();
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else {
					c.clear();
					try{ 
						jpgStrangerKnife2 = ImageIO.read(new File("resources/images/strangerKnife2.jpg")); 
					} catch (IOException e) {
						System.err.println("There was an error loading the image.");
						e.printStackTrace(); 
					} 
					c.drawImage(jpgStrangerKnife2, -110, 80, 1500, 660, null);
					try{
						Clip knife = AudioSystem.getClip();
						knife.open(AudioSystem.getAudioInputStream(new File("resources/audio/knife.wav"))); 
						knife.start();
					} catch (Exception e) {
						e.printStackTrace();
					}
					text("The man pulls a knife on you and your friend.");
					text(" What do you do?" + '\n');
					c.setTextColor(new Color(15, 152, 152));
					text("a)");
					c.setTextColor(Color.black);
					text(" Fight." + '\n');
					c.setTextColor(new Color(15, 152, 152));
					text("b)");
					c.setTextColor(Color.black);
					text(" Run." + '\n');
					input = c.readLine();
					checkInput();
					if (input.equalsIgnoreCase("a")) {
						c.clear();
						try{ 
							jpgStrangerKnife3 = ImageIO.read(new File("resources/images/strangerKnife3.jpg")); 
						} catch (IOException e) {
							System.err.println("There was an error loading the image.");
							e.printStackTrace(); 
						} 
						c.drawImage(jpgStrangerKnife3, 0, 100, 782, 722, null);
						try {
							Clip stabbing = AudioSystem.getClip();
							stabbing.open(AudioSystem.getAudioInputStream(new File("resources/audio/stabbing.wav"))); 
							Clip scream1 = AudioSystem.getClip();
							scream1.open(AudioSystem.getAudioInputStream(new File("resources/audio/scream1.wav")));
							Clip running2 = AudioSystem.getClip();
							running2.open(AudioSystem.getAudioInputStream(new File("resources/audio/running2.wav"))); 
							stabbing.start(); 
							stabbing.loop(Clip.LOOP_CONTINUOUSLY);
							scream1.start();
							running2.start();
							text("You die tragically, but your friend escapes safely." + '\n'); 
							Thread.sleep(3000);
							stabbing.stop();
							scream1.stop();
							running2.stop();
						} catch (Exception e) {
							e.printStackTrace();
						}
					} else {
						c.clear();
						try{
							jpgHostage = ImageIO.read(new File("resources/images/hostage.jpg"));
						} catch (IOException e) {
							System.err.println("There was an error loading the image.");
							e.printStackTrace();
						}
						c.drawImage(jpgHostage, 0, 80, 782, 722, null);
						try {
							Clip running = AudioSystem.getClip(); 
							running.open(AudioSystem.getAudioInputStream(new File("resources/audio/running.wav"))); 
							running.start();
							text("You get away but the man holds your friend hostage. What do you do?" + '\n');
							Thread.sleep(1500);
							running.stop();
						} catch (Exception e) {
							e.printStackTrace();
						}
						c.setTextColor(new Color(15, 152, 152));
						text("a)");
						c.setTextColor(Color.black);
						text(" Run." + '\n');
						c.setTextColor(new Color(15, 152, 152));
						text("b)");
						c.setTextColor(Color.black);
						text(" Help your friend." + '\n');
						input = c.readLine();
						checkInput();
						if (input.equalsIgnoreCase("a")) {
							c.clear();
							try{ 
								jpgStrangerKnife3 = ImageIO.read(new File("resources/images/strangerKnife3.jpg")); 
							} catch (IOException e) {
								System.err.println("There was an error loading the image.");
								e.printStackTrace(); 
							} 
							c.drawImage(jpgStrangerKnife3, 0, 100, 782, 722, null);
							try {
								Clip stabbing = AudioSystem.getClip(); 
								stabbing.open(AudioSystem.getAudioInputStream(new File("resources/audio/stabbing.wav"))); 
								Clip scream2 = AudioSystem.getClip();
								scream2.open(AudioSystem.getAudioInputStream(new File("resources/audio/scream2.wav")));
								Clip running2 = AudioSystem.getClip();
								running2.open(AudioSystem.getAudioInputStream(new File("resources/audio/running2.wav"))); 
								stabbing.start();
								stabbing.loop(Clip.LOOP_CONTINUOUSLY);
								scream2.start();
								running2.start();
								text("You escape safely but your friend is slain." + '\n'); // ending
								Thread.sleep(3000);
								stabbing.stop();
								scream2.stop();
								running2.stop();
							} catch (Exception e) {
								e.printStackTrace();
							}
						} else {
							text("Do you try to negotiate or fight?" + '\n');
							c.setTextColor(new Color(15, 152, 152));
							text("a)");
							c.setTextColor(Color.black);
							text(" Negotiate." + '\n');
							c.setTextColor(new Color(15, 152, 152));
							text("b)");
							c.setTextColor(Color.black);
							text(" Fight." + '\n');
							input = c.readLine();
							checkInput();
							if (input.equalsIgnoreCase("a")) {
								c.clear();
								try{ 
									pngMan = ImageIO.read(new File("resources/images/man.png")); 
								} catch (IOException e) {
									System.err.println("There was an error loading the image.");
									e.printStackTrace(); 
								} 
								c.drawImage(pngMan, 0, 100, 782, 722, null);
								x = (int) (Math.random() * 10 + 1);
								System.err.println(x); // for testing purposes
								text("Guess a number from ");
								c.setTextColor(new Color(15, 152, 152));
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
												c.setTextColor(Color.red);
												text("Invalid answer, please try again." + '\n');
												c.setTextColor(Color.black);
												flag = true;
											} else {
												flag = false;
											}
										} catch (NumberFormatException e) {
											c.setTextColor(Color.red);
											text("Invalid answer, please try again." + '\n');
											c.setTextColor(Color.black);
											System.err.println(e.getMessage());
											flag = true;
										} // try/catch end
									} // while structure end
									if (guess == x) {
										c.clear();
										try{ 
											jpgTwoFriends2 = ImageIO.read(new File("resources/images/twoFriends2.jpg")); 
										} catch (IOException e) {
											System.err.println("There was an error loading the image.");
											e.printStackTrace(); 
										} 
										c.drawImage(jpgTwoFriends2, 0, 100, 782, 722, null);
										i = 4;
										try {
											Clip footsteps = AudioSystem.getClip(); 
											footsteps.open(AudioSystem.getAudioInputStream(new File("resources/audio/footsteps.wav"))); 
											footsteps.start(); //start sound
											text("You negotiated successfully, you and your friend go home safely." + '\n'); // ending
											Thread.sleep(3000);
											footsteps.stop();
										} catch (Exception e) {
											e.printStackTrace();
										}
									} else {
										if (i == 0 || i == 1 ) {
											text("You guessed incorrectly. Try again." + '\n');
										}
										else if (i == 2){
											c.clear();
											try{ 
												jpgStrangerKnife = ImageIO.read(new File("resources/images/strangerKnife.jpg")); 
											} catch (IOException e) {
												System.err.println("There was an error loading the image.");
												e.printStackTrace(); 
											} 
											c.drawImage(jpgStrangerKnife, 0, 100, 782, 722, null);
											try {
												Clip stabbing = AudioSystem.getClip(); 
												stabbing.open(AudioSystem.getAudioInputStream(new File("resources/audio/stabbing.wav"))); 
												Clip scream1 = AudioSystem.getClip();
												scream1.open(AudioSystem.getAudioInputStream(new File("resources/audio/scream1.wav")));
												Clip scream2 = AudioSystem.getClip(); 
												scream2.open(AudioSystem.getAudioInputStream(new File("resources/audio/scream2.wav"))); 
												stabbing.start();
												stabbing.loop(Clip.LOOP_CONTINUOUSLY);
												scream1.start();
												scream2.start();
												text("You failed to negotiate and the man kills both of you." + '\n'); // ending
												Thread.sleep(3000);
												stabbing.stop();
												scream1.stop();
												scream2.stop();
											} catch (Exception e) {
												e.printStackTrace();
											}
										}
									}
								} // for loop end
							} else {
								text("Do you fight immediately or find a weapon?" + '\n');
								c.setTextColor(new Color(15, 152, 152));
								text("a)");
								c.setTextColor(Color.black);
								text(" Fight immediately." + '\n');
								c.setTextColor(new Color(15, 152, 152));
								text("b)");
								c.setTextColor(Color.black);
								text(" Find a weapon." + '\n');
								input = c.readLine();
								checkInput();
								if (input.equalsIgnoreCase("a")) {
									c.clear();
									try{ 
										jpgStrangerKnife = ImageIO.read(new File("resources/images/strangerKnife.jpg")); 
									} catch (IOException e) {
										System.err.println("There was an error loading the image.");
										e.printStackTrace(); 
									} 
									c.drawImage(jpgStrangerKnife, 0, 100, 782, 722, null);
									try {
										Clip stabbing = AudioSystem.getClip(); 
										stabbing.open(AudioSystem.getAudioInputStream(new File("resources/audio/stabbing.wav"))); 
										Clip scream1 = AudioSystem.getClip();
										scream1.open(AudioSystem.getAudioInputStream(new File("resources/audio/scream1.wav")));
										Clip scream2 = AudioSystem.getClip(); 
										scream2.open(AudioSystem.getAudioInputStream(new File("resources/audio/scream2.wav"))); 
										stabbing.start(); 
										stabbing.loop(Clip.LOOP_CONTINUOUSLY);
										scream1.start();
										scream2.start();
										text("You and your friend die because you attacked an armed man without a weapon." +'\n'); // ending
										Thread.sleep(3000);
										stabbing.stop();
										scream1.stop();
										scream2.stop();
									} catch (Exception e) {
										e.printStackTrace();
									}
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
											c.drawImage(pngScrewdriver, 0, 80, 800, 800, null);
										}
										else if (i == 1) {
											c.clear();
											try{
												png2x4 = ImageIO.read(new File("resources/images/2x4.png"));
											} catch (IOException e) {
												System.err.println("There was an error loading the image.");
												e.printStackTrace();
											}
											c.drawImage(png2x4, 0, 80, 800, 800, null);
										}
										else if (i == 2){
											c.clear();
											try{
												pngBaseballBat = ImageIO.read(new File("resources/images/baseballBat.png"));
											} catch (IOException e) {
												System.err.println("There was an error loading the image.");
												e.printStackTrace();
											}
											c.drawImage(pngBaseballBat, 0, 80, 800, 800, null);
										}
										text("There is");
										c.setTextColor(Color.green);
										text(weapons[i]);
										c.setTextColor(Color.black);
										text(". Do you pick it up or find a better weapon?" + '\n');
										c.setTextColor(new Color(15, 152, 152));
										text("a)");
										c.setTextColor(Color.black);
										text(" Pick it up and attack." + '\n');
										c.setTextColor(new Color(15, 152, 152));
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
												c.clear();
												try{ 
													jpgTwoFriends2 = ImageIO.read(new File("resources/images/twoFriends2.jpg")); 
												} catch (IOException e) {
													System.err.println("There was an error loading the image.");
													e.printStackTrace(); 
												} 
												c.drawImage(jpgTwoFriends2, 0, 100, 782, 722, null);
												try {
													Clip footsteps = AudioSystem.getClip();
													footsteps.open(AudioSystem.getAudioInputStream(new File("resources/audio/footsteps.wav")));
													footsteps.start(); //start sound
													text("You overpower the man, you and your friend escape safely." +'\n'); // ending
													Thread.sleep(3000);
													footsteps.stop();
												} catch (Exception e) {
													e.printStackTrace();
												}
												i = 3;
											} else {
												try{ 
													jpgStrangerKnife = ImageIO.read(new File("resources/images/strangerKnife.jpg")); 
												} catch (IOException e) {
													System.err.println("There was an error loading the image.");
													e.printStackTrace(); 
												} 
												c.drawImage(jpgStrangerKnife, 0, 100, 782, 722, null);
												try {
													Clip stabbing = AudioSystem.getClip(); 
													stabbing.open(AudioSystem.getAudioInputStream(new File("resources/audio/stabbing.wav"))); 
													Clip scream1 = AudioSystem.getClip();
													scream1.open(AudioSystem.getAudioInputStream(new File("resources/audio/scream1.wav")));
													Clip scream2 = AudioSystem.getClip(); 
													scream2.open(AudioSystem.getAudioInputStream(new File("resources/audio/scream2.wav"))); 
													stabbing.start(); 
													stabbing.loop(Clip.LOOP_CONTINUOUSLY);
													scream1.start();
													scream2.start();
													text("You fail your attack, and you both die." + '\n'); // ending
													Thread.sleep(3000);
													stabbing.stop();
													scream1.stop();
													scream2.stop();
												} catch (Exception e) {
													e.printStackTrace();
												}
												i = 3;
											}

										} else {
											if (i==2) {
												c.clear();
												try{ 
													jpgStrangerKnife4 = ImageIO.read(new File("resources/images/strangerKnife4.jpg")); 
												} catch (IOException e) {
													System.err.println("There was an error loading the image.");
													e.printStackTrace(); 
												} 
												c.drawImage(jpgStrangerKnife4, 0, 100, 782, 722, null);
												try {
													Clip stabbing = AudioSystem.getClip(); 
													stabbing.open(AudioSystem.getAudioInputStream(new File("resources/audio/stabbing.wav"))); 
													Clip scream2 = AudioSystem.getClip(); 
													scream2.open(AudioSystem.getAudioInputStream(new File("resources/audio/scream2.wav"))); 
													stabbing.start(); 
													stabbing.loop(Clip.LOOP_CONTINUOUSLY);
													scream2.start();
													text("Your friend died because you took too long to decide on a weapon to use." + '\n');
													Thread.sleep(3000);
													stabbing.stop();
													scream2.stop();
												} catch (Exception e) {
													e.printStackTrace();
												}
											}

										}

									} // for loop end

								}

							}

						}

					}

				}

			}
			text("Play again?" + '\n');
			c.setTextColor(new Color(15, 152, 152));
			text("a)");
			c.setTextColor(Color.black);
			text(" Yes." + '\n');
			c.setTextColor(new Color(15, 152, 152));
			text("b)");
			c.setTextColor(Color.black);
			text(" No." + '\n');
			input = c.readLine();
			checkInput();
		} while (input.equalsIgnoreCase("a"));
		c.clear(); // clears console
		c.close(); // closes console
	} // main method end
} // StrangerGame class end
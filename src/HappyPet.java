import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		int pet = JOptionPane.showOptionDialog(null, "what pet do you wanna buy?", "Pet options", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Dragon", "Horse", "Dog", "Cat" }, null);
		String petName = "";
		if (pet == 0) {
			petName = "Dragon";
		} else if (pet == 1) {
			petName = "Horse";
		} else if (pet == 2) {
			petName = "Dog";
		} else if (pet == 3) {
			petName = "Cat";
		}

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		// if (pet == 0) {
		for (int i = 0; i < 20; i++) {
			if (pet == 2) {
				int task = JOptionPane.showOptionDialog(null, "What do you want to do with your " + petName,
						"Pet activity", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "cuddle", "feed", "walk" }, null);
				if (task == 0) {
					cuddle();
				} else if (task == 1) {
					feed();
				} else if (task == 2) {
					walk();
				}
			}

			else if (pet == 0) {
				int task = JOptionPane.showOptionDialog(null, "What do you want to do with your " + petName,
						"Pet activity", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "fly", "feed", "play" }, null);
				if (task == 0) {
					fly();
				} else if (task == 1) {
					feed();
				} else if (task == 2) {
					play();
				}
			}

			else if (pet == 1) {
				int task = JOptionPane.showOptionDialog(null, "What do you want to do with your " + petName,
						"Pet activity", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "bath", "feed", "groom" }, null);
				if (task == 0) {
					bath();
				} else if (task == 1) {
					feed();
				} else if (task == 2) {
					groom();
				}
			}

			else if (pet == 3) {
				int task = JOptionPane.showOptionDialog(null, "What do you want to do with your " + petName,
						"Pet activity", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "cuddle", "feed", "pet" }, null);
				if (task == 0) {
					cuddle();
				} else if (task == 1) {
					feed();
				} else if (task == 2) {
					pet();
				}
			}
			if (happinessLevel > 10) {
				JOptionPane.showMessageDialog(null, "wow you must really love your pet");
				System.exit(0);
			}
		}
		// 5. Use user input to call the appropriate method created in step 4.

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
		

	}

	public static void feed() {
		JOptionPane.showMessageDialog(null, "you fill a bowl up with food");
		happinessLevel += 2;
	}

	public static void cuddle() {
		JOptionPane.showMessageDialog(null, "*cuddling noises*?????");
		happinessLevel++;
	}

	public static void groom() {
		JOptionPane.showMessageDialog(null, "you brushed a brsuh against your horses hair");
		happinessLevel++;
	}

	public static void fly() {
		JOptionPane.showMessageDialog(null, "WHEEEEEEE");
		happinessLevel++;
	}

	public static void pet() {
		JOptionPane.showMessageDialog(null, "PURRRRRRRRRR");
		happinessLevel++;
	}

	public static void walk() {
		JOptionPane.showMessageDialog(null, "you took your dog for a walk");
		happinessLevel++;
	}

	public static void bath() {
		JOptionPane.showMessageDialog(null, "your giving you're horse a bath");
		happinessLevel++;
	}

	public static void play() {
		JOptionPane.showMessageDialog(null, "you threw a ball and your baby dragon went to fetch it");
		happinessLevel++;
	}
	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
}
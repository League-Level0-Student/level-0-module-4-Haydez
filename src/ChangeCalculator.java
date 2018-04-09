
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String back = JOptionPane.showInputDialog("how many nicklebacks do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int nickles = Integer.parseInt(back);
		// Ask the user how many dimes they have, and convert their answer
		String ok = JOptionPane.showInputDialog("how many dimes do you have?");
		int dimes = Integer.parseInt(ok);
		// Ask the user how many quarters they have, and convert their answer
		String alright = JOptionPane.showInputDialog("how many quarters do you have?");
		int quarters = Integer.parseInt(alright);
		// Calculate how much money the user has and save it in a double variable
		double muny = (quarters * 0.25) + (dimes * 0.10) + (nickles * 0.05);
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "you have " + muny + " dollars");
	}
}

package com.github.MichaelJBradley.util.Menu;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public abstract class Menu implements List<Option> {

	//-- Static Members --\\
	protected static Scanner STDIN = new Scanner(System.in);

	//-- Instance Members --\\
	protected int choice;


	//-- Constructors --\\
	public Menu() {
		setChoice(-1);
	}


	//-- Output --\\
	/**
	 * @return a String consisting of a numbered list of Options
	 */
	@Override
	public String toString() {
		StringBuilder ret = new StringBuilder();

		//add option.toString()'s to ret

		return ret.toString();
	}

	/**
	 * Prints the Menu to the standard output.
	 * @return a reference to this object.
	 */
	public Menu display() {
		System.out.println(toString());
		return this;
	}

	//-- Input --\\
	/**
	 * Prompts user to enter an int from standard input. Handles invalid inputs by prompting user again.
	 * @return a user entered int.
	 */
	public static int getInputRaw() {
		boolean valid;
		int input = -1;
		do {
			valid = true;
			System.out.print("Enter: ");
			try {
				input = STDIN.nextInt();
			} catch (InputMismatchException e) {
				STDIN.next();
				valid = false;
			}
		} while (!valid);
		
		return input;
	}

	/**
 	 * Prompts user to enter an option number. 
 	 * Sets choice to user inputed value. 
 	 * Prompts user until a valid option is entered.
	 * @return a reference to this object.
	 */
	public Menu getInput() {
		int c;
		do {
			c = getInputRaw();
		} while (!isValid(c));
		
		setChoice(c);
		
		return this;
	}
	
	/**
	 * A choice is valid if:
	 * <br>
	 * - the size of the Menu is 0
	 * <br>
	 * - it is greater than or equal to 1 (the first choice) and less than or equal to size (the last choice) 
	 * @param choice the int to be validated.
	 * @return true if conditions are met
	 */
	public boolean isValid(int choice) {
		return size() == 0 || (1 <= choice && choice <= size());
	}
	
	//-- Choice --\\
	public int getChoice() {
		return choice;
	}
	
	public Menu setChoice(int c) {
		choice = c;
		return this;
	}
}

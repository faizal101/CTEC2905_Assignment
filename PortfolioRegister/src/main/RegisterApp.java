package main;

import lib.Name;
import lib.Register;

/**
 * 
 * @author Faizal
 *
 */
public class RegisterApp {

	/**
	 * RegisterApp does the following things: 
	 * Removes the name from the Register at position 1.
	 * Adds name `n` to the Register.
	 * Iterates through the Register and gets the list of names where the length of the family name is 5 or greater.
	 * @param reg The Register
	 * @param n The name.
	 * @return A String of all the names where the length of the family name is 5 or greater in the following format:
	 * "BLOGGS, J", where the family name is in upper case, followed by a comma and space (, ) and gets the initial of the first name, followed by a new line.
	 */
	public static String execute(Register reg, Name n) {	
		
		reg.removeName(1);
		reg.addName(n);
		
		String word = "";
		for (Name name : reg) {
			if (name.getFamilyName().length() >= 5) {
				String p = name.getFamilyName().toUpperCase() + ", " + name.getFirstName().charAt(0) + "\n";
				word += p;
			}
		}
		
		return word;
	}
}
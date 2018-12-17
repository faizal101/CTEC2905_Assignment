package lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Register implements Iterable<Name>{
	
	// Fields
	
	private ArrayList<Name> Name = new ArrayList<Name>();
		
	// Constructors
	
	/**
	 * Default constructor that will a create a Register ArrayList of Name.
	 */
	public Register() {
		Name = new ArrayList<Name>();
	}
	
	// Methods
	
	/**
	 * Adds the name to the Register.
	 * @param name The name of the person.
	 */
	public void addName(Name name) {
		this.Name.add(name);
	}
	
	/**
	 * Removes the name from the Register at position `i`
	 * @param i The position in the Register that should be removed.
	 * @return Removes the name in position `i` from the ArrayList.
	 */
	public Name removeName(int i) {
		return Name.remove(i);
	}
	
	/**
	 * Clears all the entries in the ArrayList.
	 */
	public void clearRegister() {
		Name.clear();
	}
	
	/**
	 * Searches for the family name in the Register.
	 * @param search The family name that it should search for.
	 * @return True if the name is found, otherwise False if it doesn't exist.
	 */
	public boolean searchRegisterByFamilyName(String search) {
		boolean found = false;
		for (Name n : Name) {
			if (n.getFamilyName().equals(search)) {
				found = true;
			}
			}
		return found;
	}
	
	/**
	 * Iterates through the Register and counts how many occurrences of the first name ending with `c`
	 * @param c The character that the first name should end with.
	 * @return The number of times the first name ended with `c`.
	 */
	public int countFirstNameOccurrences(char c) {
		int i = 0;
		for (Name n : Name) {
			if (n.getFirstName().endsWith(Character.toString(c))) {
				i++;
			}
		}
		return i;
	}
	
	/**
	 * Gets the name from the Register at position `i`.
	 * @param i The position on the Register.
	 * @return The name at position `i`.
	 */
	public Name getName(int i) {
		return Name.get(i);
	}
	
	/**
	 * Gets the length of the Register.
	 * @return The length of the Register.
	 */
	public int registerSize() {
		return Name.size();
	}
	
	/**
	 * Checks if the Register is empty.
	 * @return True if the Register is empty, otherwise False if it's not empty.
	 */
	public boolean isRegisterEmpty() {
		return (Name.isEmpty()) ? true : false;
	}
	/**
	 * Sorts the Register alphabetically.
	 */
	public void sortRegister() {
		Collections.sort(Name);;
	}
	/**
	 * Returns the textual representation of the name from the Register.
	 * @return The textual representation of the name from the Register.
	 */
	@Override
	public String toString() {
		return "Register:[" + Name + "]";
	}
	
	/**
	 * Access each element in the Register in turn.
	 * @return An element in the Register.
	 */
	@Override
	public Iterator<Name> iterator() {
		return Name.iterator();
	}
	
}

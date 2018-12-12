package lib;

import java.util.ArrayList;

public class Register {
	
	// Fields
	
	private ArrayList<Name> Name = new ArrayList<Name>();
		
	// Constructors
	
	public Register() {
		Name = " ";
	}
	
	// Methods
	
	public void addName(Name name) {
		this.Name.add(Name.size()+1, name);
	}
	
	public void removeName(int i) {
		Name.remove(i);
	}
	
	public void clearRegister() {
		Name.clear();
	}
	
	public boolean searchRegisterByFamilyName(String search) {
		boolean found = false;
		for (Name n : Name) {
			if (n.getFamilyName() == search) {
				found = true;
			} 
			}
		return found;
	}
	
	public int countFirstNameOccurrences(char c) {
		int i = 0;
		for (Name n : Name) {
			if (n.getFirstName().endsWith(Character.toString(c))) {
				i++;
			}
		}
		return i;
	}
	
	public Name getName(int i) {
		return Name.get(i);
	}
	
	public int registerSize() {
		return Name.size();
	}
	
	public boolean isRegisterEmpty() {
		return (Name.isEmpty()) ? true : false;
	}
	
	// TODO toString() method override
	
}

package lib;

import java.util.ArrayList;
import java.util.Iterator;

public class Register implements Iterable<Name>{
	
	// Fields
	
	private ArrayList<Name> Name = new ArrayList<Name>();
		
	// Constructors
	
	public Register() {
		Name = new ArrayList<Name>();
	}
	
	// Methods
	
	public void addName(Name name) {
		this.Name.add(name);
	}
	
	public Name removeName(int i) {
		return Name.remove(i);
	}
	
	public void clearRegister() {
		Name.clear();
	}
	
	public boolean searchRegisterByFamilyName(String search) {
		boolean found = false;
		for (Name n : Name) {
			if (n.getFamilyName().equals(search)) {
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
	
	@Override
	public String toString() {
		return "Register:[" + Name + "]";
	}

	@Override
	public Iterator<Name> iterator() {
		return Name.iterator();
	}
	
}

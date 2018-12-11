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
	
	public void setAddRegister(ArrayList<Name> name) {
		this.Name = name;
	}
	
	public void setRemoveRegister() {
		// TODO
	}
	
	public void setRegisterEmpty() {
		Name.clear();
	}
	
	public Name getRegisterName() {
		return Name.get(0);
	}
	
	public int getRegisterSize() {
		return Name.size();
	}
	
	public boolean getRegisterEmpty() {
		return (Name.isEmpty()) ? true : false;
	}
	
	// TODO toString() method override
	
}

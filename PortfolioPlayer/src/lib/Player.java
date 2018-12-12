package lib;
import lib.Name;

public class Player {
	
	// Fields
	
	private Name name;
	private Rollable PairOfDice;
	
	// Constructors
	
	public Player() {
		this.name = "";
		this.PairOfDice = 0;
	}
	
	/** 
	 * Default constructor that accepts a name. 
	 * @param The name that will be given.  
	 */
	
	public Player(Name name) {
		this.name = name;
	}
	/**
	 * Default constructor that accepts a name and a dice.
	 * @param name The name that will be given.
	 * @param PairOfDice Consists of 2 die. (?)
	 */
	public Player(Name name, Rollable PairOfDice) {
		this.name = name;
		this.PairOfDice = PairOfDice;
	}
	
	// Methods
	
	/**
	 * Sets the variable of `Name` to the inputed parameter.
	 * @param name The name the Player should have. (?)
	 */
	public void setName(Name name) {
		this.name = name;
	}
	
	/**
	 * Sets the number of pair of dice.
	 * @param PairOfDice number.
	 */
	public void setPairOfDice(PairOfDice PairOfDice) {
		this.PairOfDice = PairOfDice;
	}
	
	/**
	 * Sets the full name of a player.
	 * @param Name Full name of player.
	 */
	public void setFullPlayerName(String Name) {
		// TODO
		String out[] = Name.split(Name, ' ');
		Name name = new Name();
		name.setFirstName(out[0]);
		name.setFamilyName(out[1]);
	}
	
	/**
	 * Returns the name of the player.
	 * @return Name
	 */
	public Name getName() {
		return name;
	}
	
	/**
	 * Returns the pair of dice.
	 * @return PairOfDice
	 */
	public Rollable getRollable() {
		return PairOfDice;
	}
	
	public void rollDice() {
		// TODO 
	}
	
	public Rollable getDiceScore() {
		// TODO
		return this.PairOfDice;
	}
	
	@Override
    public String toString() {
    	return "Player:[" + name + ", Dice=" + PairOfDice + "]";
    }
	
}

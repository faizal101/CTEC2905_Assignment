package lib;
import lib.Name;

public class Player {
	
	// Fields
	
	private Name name;
	private PairOfDice PairOfDice;
	
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
	public Player(Name name, PairOfDice PairOfDice) {
		this.name = name;
		this.PairOfDice = PairOfDice;
	}
	
	// Methods
	
	/**
	 * Sets the variable of `Name` to the inputed parameter.
	 * @param Name The name the Player should have. (?)
	 */
	public void setName(Name Name) {
		this.name = Name;
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
	public void setFullPlayerName(String name) {
		// TODO
		// Name fn = new Name();
		// this.name = fn.setFirstName("Joe");
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
	public PairOfDice getPairOfDice() {
		return PairOfDice;
	}
	
	@Override
    public String toString() {
    	return "Name:[name=" + name + ", Dice=" + PairOfDice + "]";
    }
	
}

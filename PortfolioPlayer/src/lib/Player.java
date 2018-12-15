package lib;

import lib.Name;

public class Player implements Comparable<Player>{
	
	// Fields
	
	private Name name;
	private Rollable dice;
	
	// Constructors
	
	public Player() {
		this.name = new Name();
		this.dice = new Die();
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
		this.dice = PairOfDice;
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
		this.dice = PairOfDice;
	}
	
	/**
	 * Sets the full name of a player.
	 * @param Name Full name of player.
	 */
	public void setFullPlayerName(String Name) {
		String[] out = Name.split(" ");
		this.name.setFirstName(out[0]);
		this.name.setFamilyName(out[1]);
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
		return dice;
	}
	
	public void rollDice() {
		Die die = new Die();
		//die = x -- issue with this is that rollDice takes in no params, per UML
		die.roll();
	}
	
	public int getDiceScore() {
		Die die = new Die();
		return die.getScore();
	}
	
	@Override
    public String toString() {
    	return "Player:[" + name + ", Dice=" + dice + "]";
    }

	@Override
	public int compareTo(Player o) {
		return this.name.compareTo(o.name);
	}
	
}

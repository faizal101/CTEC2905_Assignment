package lib;

import lib.Name;

public class Player implements Comparable<Player>{
	
	// Fields
	
	private Name name;
	private Rollable dice;
	
	// Constructors
	
	/**
	 * Default constructor that creates an empty name and dice.
	 */
	public Player() {
		this.name = new Name();
		this.dice = new Die();
	}
	
	/** 
	 * Creates a player with the given name. 
	 * @param name The name the player will have.  
	 */
	public Player(Name name) {
		this.name = name;
		this.dice = new Die();
	}
	
	/**
	 * Creates a player with the given name and dice.
	 * @param name The name the player will have.
	 * @param dice The dice that is given to the player.
	 */
	public Player(Name name, Rollable dice) {
		this.name = name;
		this.dice = dice;
	}
	
	// Methods
	
	/**
	 * Sets the name of the player from the parameter passed.
	 * @param name The name the player will have.
	 */
	public void setName(Name name) {
		this.name = name;
	}
	
	/**
	 * Sets the number of dice from the parameter passed.
	 * @param dice The number of dice the player will have.
	 */
	public void setPairOfDice(PairOfDice dice) {
		this.dice = dice;
	}
	
	/**
	 * Sets the full name of the player.
	 * The string is split with a space (" ").
	 * @param Name the full name the player should have.
	 */
	public void setFullPlayerName(String Name) {
		String[] out = Name.split(" ");
		this.name.setFirstName(out[0]);
		this.name.setFamilyName(out[1]);
	}
	
	/**
	 * Returns the name of the player.
	 * @return name The name of the player.
	 */
	public Name getName() {
		return name;
	}
	
	/**
	 * Returns the dice of the player.
	 * @return dice Returns the dice of the player.
	 */
	public Rollable getRollable() {
		return dice;
	}
	
	/**
	 * Rolls the dice.
	 */
	public void rollDice() {
		this.dice.roll();
	}
	
	/**
	 * Gets the dice score.
	 * @return The dice score
	 */
	public int getDiceScore() {
		return this.dice.getScore();
	}
	
	/**
	 * Returns the textual representation of the Player's name and dice.
	 * @return The textual representation of the Player's name and dice.
	 */
	@Override
    public String toString() {
    	return "Player:[" + name + ", Dice=" + dice + "]";
    }
	
	/**
	 * Compares the name of the player to another player, that is passed.
	 * @param other The player that should be compared to.
	 * @return A negative integer if player is less than, a positive integer if greater or zero if equal.
	 */
	@Override
	public int compareTo(Player other) {
		return this.name.compareTo(other.name);
	}
	
}

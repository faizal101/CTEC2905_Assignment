package main;

import java.util.ArrayList;
import lib.Player;

/**
 * 
 * @author Faizal
 *
 */
public class PlayerApp {

	/**
	 * PlayerApp does the following:
	 * Gets the player at index 0 of the Player ArrayList and sets the full name of the player of `fullName`
	 * Iterates through the Player and gets the list of the full name where it contains an 'a'  
	 * @param players The Player.
	 * @param fullName The full name.
	 * @return A String of all the names where it contains "a" in the following format:
	 * "joe, Bloggs", where the first name is in lower case, followed by a comma and space (, ) add the family name in upper case, followed by a new line.  
	 */
	public static String execute(ArrayList<Player> players, String fullName) {
		
		players.get(0).setFullPlayerName(fullName);
		String word = "";
		ArrayList<String> names = new ArrayList<String>();
		for (Player player : players) {
			names.add(player.getName().getFullName());
		}
		for (String player : names) {
			if(player.contains("a")) {
				String[] out = player.split(" ");
				String p = out[0].toLowerCase() + ", " + out[1].toUpperCase() + "\n";
				word += p;
			}
		}
		return word;
	}
}

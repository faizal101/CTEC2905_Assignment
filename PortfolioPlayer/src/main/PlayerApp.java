package main;

import java.util.ArrayList;

//import lib.Name;
import lib.Player;

public class PlayerApp {

	public static String execute(ArrayList<Player> players, String fullName) {
		
		players.get(0).setFullPlayerName(fullName);
		String word = "";
		ArrayList<String> names = new ArrayList<String>();
		for (Player player : players) {
			names.add(player.getName().getFullName());
		}
		for (String player : names) {
			if(player.contains("a")) {
				String name = player.trim();
				int space = player.indexOf(" ");
				String first = name.substring(0, space);
				String last = name.substring(space);
				
				String p = first.toLowerCase() + "," + last.toUpperCase() + "\n";
				word += p;
			}
		}
		return word;
	}
}

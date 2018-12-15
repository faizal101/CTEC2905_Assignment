package main;

import java.util.ArrayList;

//import lib.Name;
import lib.Player;

public class PlayerApp {

	public static String execute(ArrayList<Player> players, String fullName) {
		
		players.get(0).setFullPlayerName(fullName);
		System.out.println(players.get(0).getName());
		//String name = fullName;
		//String[] out = name.split(" ");
		
		//players.add(0, new Player(new Name (out[0], out[1])));
		//players.add(0, fullName);
		
		String word = "";
		for (Player player : players) {
			word = player.getName().getFirstName().toLowerCase() + ", " + player.getName().getFamilyName().toUpperCase() 
					+ "\n";
			//word += p;
		}
		return word;
	}
	
}

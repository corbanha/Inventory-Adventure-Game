import java.util.ArrayList;

/**
 * This class holds a list of enemies and objects in the current room that the player is in.
 * @author Corban
 * @version 6/12/14
 */
public class Room {
	private String name;
	private ArrayList<Enemy> enemies;
	//private Neutral[] neutrals;
	private ArrayList<Chest> chests;
	
	public Room(String name, ArrayList<Enemy> enemies, ArrayList<Chest> chests){
		this.name = name;
		this.enemies = enemies;
		this.chests = chests;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the enemies
	 */
	public ArrayList<Enemy> getEnemies() {
		return enemies;
	}

	/**
	 * @return the chests
	 */
	public ArrayList<Chest> getChests() {
		return chests;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}

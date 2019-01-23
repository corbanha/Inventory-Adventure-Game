/**
 * A chest holds different items. Chests will be fold in different rooms.
 * @author Corban
 * @version 6/12/14
 */
public class Chest {
	private String name;
	private Stuffs[] items;
	
	public Chest(String name, Stuffs[] items){
		this.name = name;
		this.items = items;
	}
	
	public Chest(){
		this.name = "";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the items
	 */
	public Stuffs[] getItems() {
		return items;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAttributes(){
		String str = "\n";
		str += this.name + "\n";
		for(int i = 0; i < this.items.length; i++){
			str += "<" + (i + 1) + "> " + this.items[i].getName() + "\n";
		}
		return str;
	}
}

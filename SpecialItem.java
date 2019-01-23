
/**
 * This class is going to be used for special objects that only affect the player's health, etc. and the Max health, etc. of
 * the player. These objects will be used for upgrading the players' max stats, and max inventory, etc. and should be kept 
 * really quite rare and costly.
 * @author Corban Anderson
 *@version 1/16/13
 */
public class SpecialItem extends Edible {
	//Gets name, description, weight, cost, from stuffs
	//Gets health return, stamina, radiation and fullness from Edible
	double maxHealthGain = 0;
	double maxStaminaGain = 0;
	double maxRadiationGain = 0;
	double maxFullnessGain = 0;
	double maxInventoryGain = 0;
	
	/**
	 * Constructor for SpecialItem
	 */
	public SpecialItem(){
		maxHealthGain = 0;
		maxStaminaGain = 0;
		maxRadiationGain = 0;
		maxFullnessGain = 0;
		maxInventoryGain = 0;
	}
	
	/**
	 * Constructor for SpecialItem
	 * @param name the name of the object
	 * @param description the description of the object
	 * @param weight the weight of the object
	 * @param mana the cost in mana for the object
	 * @param gold the cost in gold for the object
	 * @param health the health that the user gains from using the object
	 * @param stamina the stamina gain from using the object
	 * @param radiation the radiation gain from using the object
	 * @param fulness the fullness gain from using the object
	 * @param maxHealth the amount gain of the max health of the player
	 * @param maxStamina the amount gain of the max Stamina of the player
	 * @param maxRadiation the amount gain of the max Radiation of the player
	 * @param maxFullness the amount gain of the max fullness of the player
	 * @param maxInventory the amount gain of the max inventory of the player
	 */
	public SpecialItem(String name, String description, double weight, double mana, double gold, double health,
			double stamina, double radiation, double fullness, double maxHealth, double maxStamina, double maxRadiation,
			double maxFullness, double maxInventory){
		super(name, description, weight, mana, gold, health, stamina, radiation, fullness);
		maxHealthGain = maxHealth;
		maxStaminaGain = maxStamina;
		maxRadiationGain = maxRadiation;
		maxFullnessGain = maxFullness;
		maxInventoryGain = maxInventory;
	}
	
	/**
	 * Returns the change the to max health of the player
	 * @return the gain of max health of the player
	 */
	public double getMaxHealthGain(){
		return maxHealthGain;
	}
	
	/**
	 * Returns the change the to max stamina of the player
	 * @return the gain of max stamina of the player
	 */
	public double getMaxStaminaGain(){
		return maxStaminaGain;
	}
	
	/**
	 * Returns the change the to max radiation of the player
	 * @return the gain of max radiation of the player
	 */
	public double getMaxRadiationGain(){
		return maxRadiationGain;
	}
	
	/**
	 * Returns the change the to max fullness of the player
	 * @return the gain of max fullness of the player
	 */
	public double getMaxFullnessGain(){
		return maxFullnessGain;
	}
	
	/**
	 * Returns the change the to max inventory of the player
	 * @return the gain of max inventory of the player
	 */
	public double getMaxInventoryGain(){
		return maxInventoryGain;
	}
	
	/**
	 * Sets the change the to max health of the player
	 * @param health the gain of max health of the player
	 */
	public double setMaxHealthGain(double health){
		return maxHealthGain;
	}
	
	/**
	 * Sets the change the to max stamina of the player
	 * @param stamina the gain of max stamina of the player
	 */
	public double setMaxStaminaGain(double stamina){
		return maxStaminaGain;
	}
	
	/**
	 * Sets the change the to max radiation of the player
	 * @param radiation the gain of max radiation of the player
	 */
	public double setMaxRadiationGain(double radiation){
		return maxRadiationGain;
	}
	
	/**
	 * Sets the change the to max fullness of the player
	 * @param fullness the gain of max fullness of the player
	 */
	public double setMaxFullnessGain(double fullness){
		return maxFullnessGain;
	}
	
	/**
	 * Sets the change the to max inventory of the player
	 * @param inventory the gain of max inventory of the player
	 */
	public double setMaxInventoryGain(double inventory){
		return maxInventoryGain;
	}
	
	/**
	 * Returns a string representation of the item
	 * @return a string representation of the item
	 */
	public String getAttributes() {
		String string = super.getAttributes();
		string = string + "\nMax Health Gain:         " + maxHealthGain + "\nMax Stamina Gain:        " + maxStaminaGain + "\nMax Radiation Gain:      " +
				maxRadiationGain + "\nMax Fullness Gain:       " + maxFullnessGain + "\nMax Inventory Gain:      " + maxInventoryGain;
		return string;
	}
}

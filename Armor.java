/**
 * This is a class that acts a set of Armor. Armor has all of the characteristics of a weapon, including attributes of resistance of the health, etc.
 * It is only used separately to make fighting and such easier to control
 * @author Corban
 * @version 6/12/14
 */
public class Armor extends Weapon {
	private double healthResistance;
	private double staminaResistance;
	private double radiationResistance;
	private double fullnessResistance;
	
	public Armor(){
		super();
		setHealthResistance(0);
		staminaResistance = 0;
		radiationResistance = 0;
		fullnessResistance = 0;
	}
	
	/**
	 * Make a piece of Armor
	 * @param name the name of the Armor
	 * @param description the description of the Armor
	 * @param weight the weight of the Armor
	 * @param mana the cost in mana for the item
	 * @param gold the cost in gold for the item
	 * @param health the user health gain each time the Armor is used
	 * @param stamina the user stamina gain each time the Armor is used
	 * @param radiation the user radiation gain each time the Armor is used
	 * @param hunger the fullness gain each time the Armor is used
	 * @param enemyHealth the enemy health gain each time the Armor is used
	 * @param enemyStamina the enemy stamina gain each time the Armor is used
	 * @param enemyRadiation the enemy Radiation gain each time the Armor is used
	 * @param max the max number of uses for the Armor
	 * @param uses the current number of uses that the Armor has been used
	 * @param healthResistance the health resistance, a number usually between 0 and 1 of how much attack affects the player
	 * @param staminaResisance the stamina resistance, a number usually between 0 and 1 of how much attack affects the player
	 * @param radiationResistance the radiation resistance, a number usually between 0 and 1 of how much attack affects the player
	 * @param fullnessResistance the fullness resistance, a number usually between 0 and 1 of how much attack affects the player
	 * 
	 * Note that having the resistance above 1, will cause the player to gain health.<br>The health param always gives health no matter the enemy attack
	 * Example of Resistance:<br> ( (enemy attack) 10 - ( (enemy attack) 10 * (health resistance) .23 ) = 7.7 (user lost health instead of 10)<br>
	 * ( (enemy attack) 7 - ( (enemy attack) 7 * (health resistance) .67 ) = 2.31 (user lost health instead of 7)
	 */
	
	
	public Armor(String name, String description, double weight, double mana, double gold, double health,
			double stamina, double radiation, double hunger, double enemyHealth, double enemyStamina,
			double enemyRadiation, int max, int uses, double healthResistance, double staminaResisance, double radiationResistance, double fullnessResistance){
		super(name, description, weight, mana, gold, health, stamina, radiation, hunger, enemyHealth, enemyStamina, enemyRadiation, max, uses);
		this.setHealthResistance(healthResistance);
		this.staminaResistance = staminaResisance;
		this.radiationResistance = radiationResistance;
		this.fullnessResistance = fullnessResistance;
		//There's got to be a better way to do this
	}

	/**
	 * @return the healthResistance
	 */
	public double getHealthResistance() {
		return healthResistance;
	}

	/**
	 * @return the staminaResistance
	 */
	public double getStaminaResistance() {
		return staminaResistance;
	}

	/**
	 * @return the radiationResistance
	 */
	public double getRadiationResistance() {
		return radiationResistance;
	}

	/**
	 * @return the fullnessResistance
	 */
	public double getFullnessResistance() {
		return fullnessResistance;
	}

	/**
	 * @param healthResistance the healthResistance to set
	 */
	public void setHealthResistance(double healthResistance) {
		this.healthResistance = healthResistance;
	}

	/**
	 * @param staminaResistance the staminaResistance to set
	 */
	public void setStaminaResistance(double staminaResistance) {
		this.staminaResistance = staminaResistance;
	}

	/**
	 * @param radiationResistance the radiationResistance to set
	 */
	public void setRadiationResistance(double radiationResistance) {
		this.radiationResistance = radiationResistance;
	}

	/**
	 * @param fullnessResistance the fullnessResistance to set
	 */
	public void setFullnessResistance(double fullnessResistance) {
		this.fullnessResistance = fullnessResistance;
	}
	
	/**
	 * Converts the object to a viewable String
	 */
	public String getAttributes(){
		String str = "";
		str += super.getAttributes();
		str += "\nHealth Resistance        " + this.healthResistance + "\nStamina Resistance       " + this.staminaResistance +
				"\nRadiation Resistance     " + this.radiationResistance + "\nFullness Resistance      " + this.fullnessResistance;
		return str;
	}
	
	public String toString(){
		return super.getName();
	}
}

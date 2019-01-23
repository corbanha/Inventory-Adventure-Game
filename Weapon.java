/**
 * This implements a simple weapon.<br>
 * <b> Weapons can affect the player and the enemy</b> <br>
 * Attributes from Stuffs class:<br>
 * -Name<br>
 * -Description<br>
 * -Weight<br>
 * -Mana cost<br>
 * -Gold cost<br>
 * <br>
 * 
 * @author Corban Anderson
 * @version 2/11/14
 */
public class Weapon extends Edible {
	private double enemyHealthGain;
	private double enemyStaminaGain;
	private double enemyRadiationGain;
	private double enemyFullnessGain;
	private int maxUses;
	private int numUses;

	/**
	 * Constructor for objects of class Weapons
	 */
	public Weapon() {
		enemyHealthGain = 0;
		enemyStaminaGain = 0;
		enemyRadiationGain = 0;
		maxUses = 0;
		numUses = 0;
	}

	/**
	 * Constructor for objects of class Weapon. This sets all of the attributes not related with weapon.<br>
	 * 
	 * @param name name of the item
	 * @param description description of the item
	 * @param weight weight of the item
	 * @param mana price in mana for the item
	 * @param gold price in gold for the item
	 * @param health health gain when item used
	 * @param stamina stamina gain for when item used
	 * @param radiation radiation gain for when item used
	 * @param hunger hunger gain for when item used
	 * @param enemyHealth
	 * @param enemyStamina
	 * @param enemyRadiaion
	 * @param max
	 * @param uses
	 */
	public Weapon(String name, String description, double weight, double mana, double gold, double health,
			double stamina, double radiation, double hunger, double enemyHealth, double enemyStamina,
			double enemyRadiation, int max, int uses) {
		super(name, description, weight, mana, gold, health, stamina, radiation, hunger);
		enemyHealthGain = enemyHealth;
		enemyStaminaGain = enemyStamina;
		enemyRadiationGain = enemyRadiation;
		maxUses = max;
		numUses = uses;
	}


	/**
	 * Sets the amount of health gained by the enemy when hit
	 * @param health the health that is gained by enemy
	 */
	public void setEnemyHealthGain(double health) {
		enemyHealthGain = health;
	}

	/**
	 * Sets the amount of stamina gained by the enemy when hit
	 * @param stamina the stamina that is gained by enemy
	 */
	public void setEnemyStaminaGain(double stamina) {
		enemyStaminaGain = stamina;
	}

	/**
	 * Sets the amount of radiation gained by the enemy when hit
	 * @param radiation the radiation that is gained by enemy
	 */
	public void setEnemyRadiationGain(double radiation) {
		enemyRadiationGain = radiation;
	}

	/**
	 * Sets the amount of fullness gained by the enemy when hit
	 * @param fullness the fullness that is gained by enemy
	 */
	public void setEnemyFullnessGain(double fullness) {
		enemyFullnessGain = fullness;
	}

	/**
	 * Returns the amount of health gained by enemy when hit
	 * @return the amount of health gained by enemy when hit
	 */
	public double getEnemyHealthGain() {
		return enemyHealthGain;
	}

	/**
	 * Returns the amount of stamina gained by enemy when hit
	 * @return the amount of stamina gained by enemy when hit
	 */
	public double getEnemyStaminaGain() {
		return enemyStaminaGain;
	}

	/**
	 * Returns the amount of radiation gained by enemy when hit
	 * @return the amount of radiation gained by enemy when hit
	 */
	public double getEnemyRadiationGain() {
		return enemyRadiationGain;
	}

	/**
	 * Returns the amount of fullness gained by enemy when hit
	 * @return the amount of fullness gained by enemy when hit
	 */
	public double getEnemyFullnessGain() {
		return enemyFullnessGain;
	}

	/**
	 * Sets the max number of uses on the weapon
	 * 
	 * @param uses
	 *            the max number of uses of the item
	 */
	public void setMaxUses(int uses) {
		maxUses = uses;
	}

	/**
	 * Sets the number of uses on the weapon
	 * 
	 * @param uses
	 *            the number of uses that the weapon has been used
	 */
	public void setNumUses(int uses) {
		numUses = uses;
	}

	/**
	 * Returns the max number of uses of the weapon
	 * 
	 * @return the max number of uses of the weapon
	 */
	public int getMaxUses() {
		return maxUses;
	}

	/**
	 * Returns the number of times that the item has been used
	 * 
	 * @return the number of times that the item has been used
	 */
	public int getNumUses() {
		return numUses;
	}

	/**
	 * Returns a string representation of the Weapon
	 * 
	 * @return a string representation of the Weapon
	 */
	public String getAttributes() {
		String string = super.getAttributes();
		string = string + "\nEnemy Health Gain:       " + enemyHealthGain + "\nEnemy Stamina Gain:      " + enemyStaminaGain
				+ "\nEnemy Radiation Gain:    " +
				enemyRadiationGain + "\nEnemy Fullness Gain:     " + enemyFullnessGain + 
				"\nMax Uses:                " + maxUses + "\nNumber Times Used:       " + numUses + "\nUses left:               " +
				(maxUses - numUses);
		return string;
	}
}

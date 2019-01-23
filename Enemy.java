/**
 * This is the enemy that the player will fight
 * @author Corban Anderson
 * @version 2/18/14
 */
public class Enemy {
	String enemyName = "";
	String enemyDescription = "";
	double enemyHealth = 0;
	double enemyStamina = 0;
	double enemyRadiation = 0;
	double enemyFullness = 0;
	double attackHealth = 0;
	double attackStamina = 0;
	double attackRadiation = 0;
	double attackFullness = 0;
	
	public Enemy(){
		enemyName = "Default Enemy";
		enemyDescription = "A Default Enemy.";
	}
	
	public Enemy(String name, String des, double health, double stamina, double rad, double fullness, double attackHealth,
			double attackStamina, double attackRadiation, double attackFullness){
		enemyName = name;
		enemyDescription = des;
		enemyHealth = health;
		enemyStamina = stamina;
		enemyRadiation = rad;
		enemyFullness = fullness;
		this.attackHealth = attackHealth;
		this.attackStamina = attackStamina;
		this.attackRadiation = attackRadiation;
		this.attackFullness = attackFullness;
	}
	
	public String getName(){
		return enemyName;
	}
	
	public String getDescription(){
		return enemyDescription;
	}
	
	public double getHealth(){
		return enemyHealth;
	}
	
	public double getStamina(){
		return enemyStamina;
	}
	
	public double getRadiation(){
		return enemyRadiation;
	}
	
	public double getFullness(){
		return enemyFullness;
	}
	
	public double getAttackHealth(){
		return attackHealth;
	}
	
	public double getAttackStamina(){
		return attackStamina;
	}
	
	public double getAttackRadiation(){
		return attackRadiation;
	}
	
	public double getAttackFullness(){
		return attackFullness;
	}
	
	public void setHealth(double health){
		enemyHealth = health;
	}
	
	public void setStamina(double stamina){
		enemyStamina = stamina;
	}
	
	public void setRadiation(double radiation){
		enemyRadiation = radiation;
	}
	
	public void setFullness(double fullness){
		enemyFullness = fullness;
	}
	
	public String getAttributes(){
		String str = "";
		str += String.format("Name:               %s\nDescription:        %s\nHealth:             %.2f\nStamina:            %.2f\nRadiation:          %.2f\nFullness:           %.2f\nAttack Health:      %.2f\nAttack Stamina:     %.2f\n" + 
				"Attack Radiation:   %.2f\nAttack Fullness:    %.2f", this.enemyName, this.enemyDescription, this.enemyHealth, this.enemyStamina, this.enemyRadiation,
				this.enemyFullness, this.attackHealth, this.attackStamina, this.attackRadiation, this.attackFullness);
		return str;
	}
}

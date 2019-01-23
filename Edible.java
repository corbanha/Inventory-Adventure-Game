//Note: Edible just means that the item affects the user in some way(give more health) not necessarily is edible
/**
 * The basis for and edible object in Corban's Adventure Game<br>
 * <b>An edible is an object that can only affect the player, in any way.</b><br>
 * Edible items extend the Stuffs class, meaning, any edible object also has these attributes:<br>
 * -Name<br>
 * -Description<br>
 * -Weight<br>
 * -Mana Cost<br>
 * -Gold Cost<br><br>
 * Not to mention these attributes added in this class:<br>
 * -Health Gain<br>
 * -Stamina Gain<br>
 * -Radiation Gain<br>
 * -fullness Gain
 * 
 * @author Corban Anderson 
 * @version 2/11/14
 */
public class Edible extends Stuffs{
    // name, description, weight, mana cost, gold cost are taken care of in Stuffs class
    private double healthGain;
    private double staminaGain;
    private double radiationGain;
    private double fullnessGain;//if number reaches 0 yo begin to starve
    
    /**
     * Simple constructor for objects of class Edible.
     * Default values:<br>Health gain = 0<br>Stamina gain = 0<br>Radiation gain = 0<br>fullness gain = 0
     */
    public Edible(){
        healthGain = 0;
        staminaGain = 0;
        radiationGain = 0;
        fullnessGain = 0;
    }
    
    /**
     * Constructor for objects of class Edible.
     * @param name name of the item
     * @param description description of the item
     * @param weight weight of the item
     * @param mana price in mana for the item
     * @param gold price in gold for the item
     * @param health health gain when item used
     * @param stamina stamina gain for when item used
     * @param radiation radiation gain for when item used
     * @param fullness fullness gain for when item used
     */
    public Edible(String name, String description, double weight, double mana, double gold, double health, double stamina, double radiation, double fullness){
        super(name, description, weight, mana, gold);
        healthGain = health;
        staminaGain = stamina;
        radiationGain = radiation;
        fullnessGain = fullness;
    }
    
    /**
     * Sets the health gain from the object
     * @param health health gained from the object
     */
    public void setHealthGain(double health){
        healthGain = health;
    }
    
    /**
     * Sets the stamina gain of the object
     * @param  stamina the stamina gain from the object
     */
    public void setStaminaGain(double stamina){
        staminaGain = stamina;
    }
    
    /**
     * Sets the radiation gain of the object
     * @param  radiation the radiation gain of the object(bare in mind that this number is usually negative)
     */
    public void setRadiationGain(double radiation){
        radiationGain = radiation;
    }
    
    /**
     * Sets the fullness gain of the object
     * @param  fullness fullness gain from the object
     */
    public void setFullnessGain(double fullness){
        fullnessGain = fullness;
    }
    
    /**
     * Sets the health gain from the object
     * @return the health gain from the obbject
     */
    public double getHealthGain(){
        return healthGain;
    }
    
    /**
     * Sets the stamina gain of the object
     * @return the stamina gain from the object
     */
    public double getStaminaGain(){
        return staminaGain;
    }
    
    /**
     * Sets the radiation gain of the object
     * @return the radiation gain from the object
     */
    public double getRadiationGain(){
        return radiationGain;
    }
    
    /**
     * Sets the fullness gain of the object
     * @return the fullness gain from the object
     */
    public double getFullnessGain(){
        return fullnessGain;
    }
    
    /**
     * Returns a string representation of the object
     * @return Name: a string representation of the object
     */
    public String getAttributes(){
        String string = super.getAttributes();
        string = string + "\nHealth gain:             " + healthGain + "\nStamina gain:            " + staminaGain + 
        		"\nRadiation gain:          " + radiationGain + "\nFullness gain:           " + fullnessGain;
        return string;
    }
}

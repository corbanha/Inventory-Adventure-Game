import java.util.Comparator;

/*
 * This code is copyright Corban Anderson 2/11/14 under the Creative Commons License.
 * By using this code you understand that you have to give full recognition to Corban Anderson, and that you understand that 
 * there is probabaly a better implmentation of this code on the internet by someone else.
 * Thank you.
 */
/**
 * This is the basis of an object in Corban's Adventure Game.<br>
 * The very basic object in Corban's Adventure Game includes the following attributes:<br>
 * -Name<br>
 * -Description<br>
 * -Weight<br>
 * -Cost in Mana<br>
 * -Cost in Gold
 * 
 * @author Corban Anderson
 * @version 2/11/14
 */
public class Stuffs implements Comparator<Stuffs>{
    private String name;
    private String description;
    private double weight;
    private double manaCost;
    private double goldCost;

    /**
     * Simple constructor for an object.
     * By default name and description are empty strings, and weight, manaCost, and goldCost is set to 0.
     */
    public Stuffs(){
        name = "";
        description = "";
        weight = 0;
        manaCost = 0;
        goldCost = 0;
    }

    /**
     * Simple constructor for an object.
     * @param name the name of the object
     * @param description the description of the object
     * @param weight the weight of the object
     * @param mana the cost in mana for the object
     * @param gold the cost in gold fot the object
     */
    public Stuffs(String name, String description, double weight, double mana, double gold){
        this.name = name;
        this.description = description;
        this.weight = weight;
        manaCost = mana;
        goldCost = gold;
    }

    /**
     * Sets the name of the object
     * @param  name the for the object
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Sets the description of the object
     * @param  description the description for the object
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * Sets the weight of the object
     * @param  weight the weight of the object
     */
    public void setWeight(double weight){
        this.weight = weight;
    }

    /**
     * Sets the mana cost of the object
     * @param  mana  the cost of the object in mana
     */
    public void setManaCost(double mana){
        manaCost = mana;
    }

    /**
     * Sets the gold cost of the object
     * @param  gold   a sample parameter for a method
     */
    public void setGoldCost(double gold){
        goldCost = gold;
    }

    /**
     * Returns the name of the object
     * @return the namr of the object
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the description of the object
     * @return the description of the object
     */
    public String getDescription(){
        return description;
    }

    /**
     * Returns the weight of the object
     * @return the weight of the object
     */
    public double getWeight(){
        return weight;
    }

    /**
     * Returns the cost in mana of the object
     * @return th cost in mana
     */
    public double getManaCost(){
        return manaCost;
    }

    /**
     * Returns the cost in gold of the object
     * @return the cost in gold
     */
    public double getGoldCost(){
        return goldCost;
    }

    /**
     * Returns the name of the object
     * @return the name of the object
     */
    public String toString(){
        return getName();
    }
    
    /**
     * Returns a string representation of the object
     * @return a string representation of the object
     */
    public String getAttributes(){
        return "Name:                    " + name + "\nDescription:             " + description + 
        		"\nWeight:                  " + weight + " pounds\nMana cost:               " + 
        manaCost + "\nGold cost:               " + goldCost;
    }

	@Override
	public int compare(Stuffs o1, Stuffs o2) {	
		return o1.toString().compareTo(o2.toString());
	}
}

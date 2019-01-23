import java.util.ArrayList;
import java.util.Collections;

/**
 * This class implements a simple store for the player
 * 
 * @author Corban Anderson
 * @version 2/14/14
 */
public class Store {
	ArrayList<Stuffs> storeItems = new ArrayList<Stuffs>();
	ArrayList<Stuffs> itemsOutOfStock = new ArrayList<Stuffs>();
	
	private double goldExchangeRate;
	private double manaExchangeRate;
	

	boolean userWantsToLeave = false;
//Stuffs don't affect the player or the enemy
	Stuffs oldMap = new Stuffs("Scrap of Old Map", "Looks like it could be useful, not right now though.", 0.25, 250, 150);
	Stuffs book = new Stuffs("Old Book", "Never knew how to read.", 2.5, 20, 25);
	Stuffs bookBible = new Stuffs("The Bible", "\"Man can not live on bread alone.\"", 5, 10, 5);
	Stuffs oldNoteBook = new Stuffs("Notebook", "An old thing, stained by the sun.", 5, 5, 10);
	Stuffs walkingStick = new Stuffs("Classy Walking Stick", "Hand carved by apes in Virgina, this thing says it all!", 15, 55, 75);
	Stuffs lanternOil = new Stuffs("Oil Lantern", "An oil lantern.", 15, 15, 20);
	Stuffs lanternGas = new Stuffs("Gas Lantern", "A gas lantern.", 20, 25, 30);
	Stuffs emptyBottle = new Stuffs("Empty Bottle", "Useful for your air collection.", 4, 2, 3);
	Stuffs clayCup = new Stuffs("Clay Cup", "Holds liquids like never before!", 5, 4, 2);
	Stuffs candleStick = new Stuffs("Candle Stick", "No this is not a weapon!", 12, 15, 20);
	Stuffs featherPen = new Stuffs("Feather Pen", "Use it to write letters to your mom, or gang signs on the neighbors' house!", 2.5, 15, 20);
	Stuffs oldManPicture = new Stuffs("Old Man Picture", "This isn't our most popular product, I wonder why.", 15, 15, 10);
	Stuffs rubiksCube = new Stuffs("Puzzle cube", "Will give you +5 IQ, assuming you can solve it!", 15, 25, 30);
//Edibles will only affect the player
	Edible apple = new Edible("Apple", "A little bruised, though it's still tasty.", 1.25, 5, 10, 3, 5, 0, 2);
	Edible oldAle = new Edible("Old Ale", "You can only get this stuff up north, a nice find.", 1.5, 25, 30, -5, 35, 5, -5);
	Edible mango = new Edible("Mango", "Delious, this is know to be the best fruit on Earth.", 3, 4.5, 5, 10, 5, 0, 3);
	Edible banana = new Edible("Banana", "\"Hello? Anyone there?\"", 3.5, 1.5, 2.5, 5, 7.5, 2, 3);
	Edible breadLoaf = new Edible("Loaf of Bread", "A loaf of bread, not much more to say.", 15, 15, 15, 9, 3, 0, 3);
	Edible bread = new Edible("Slice of Bread", "A slice of crappy bread, enjoy.", .5, 2, 3, 5, 5, 0, 1);
	Edible cabbage = new Edible("Cabbage", "Used as testing for the guiten, how lovely.", 15, 12, 15, 9, 0, 0, 5);
	Edible broccoli = new Edible("Broccoli", "Like little trees, which live in the potato fields... don't play with your food.", 5, 5, 15, 3, 3, -3, 3);
	Edible beet = new Edible("Beet", "Fresh, but that doesn't mean that it's good.", 5, 15, 5, 3, 3, -3, 3);
	Edible lettuce = new Edible("Lettuce", "Great in salad, if your that kind of guy.", 2.5, 10, 12.5, 5, 5, 0, 1);
	Edible potato = new Edible("Potato", "The master of all carbs! Pass the butter.", 2, 10, 5, 5, 3, -2, 0);
	Edible watermelon = new Edible("Watermelon", "Great in the summer time", 25, 2.5, 2.5, 10, 7.5, 0, 2);
	Edible pumpkin = new Edible("Pumpkin", "\"Trick or Treat!\"", 25, 2.5, 2.5, 4, 4, -2, 7);
	Edible garlic = new Edible("Garlic", "Now those vampires can't get you!", 5, 40, 55, 15, 10, 2, 3);
	Edible ginger = new Edible("Ginger", "It's also good deordorate!", 5, 15, 10, 5, 7.5, 0, 0);
	Edible apricot = new Edible("Bag of Apricots", "I used to have an apricot tree, never got anything though.", 7.5, 15, 25, 15, 0, 0, 3);
	Edible artichoke = new Edible("Artichoke", "It's like a big green pinecone.", 7.5, 15, 25, 0, 15, -3, 0);
	Edible yam = new Edible("Yam", "It's a potatos' uncle.", 8, 15, 30, 15, 9, -8, 5);
	Edible carrot = new Edible("Carrot", "They say it's good for your eyes.", 7.5, 25, 15, 0, 3, -15, 0);
	Edible bagOfCherries = new Edible("Bag of Cherries", "So tasty! Make sure to take out the seed!", 7.5, 25, 15, 3, 0, 0, 15);
	Edible corn = new Edible("Corn", "Fresh, I think.", 2.5, 5, 2.5, 2, 0, -1, 0);
	Edible boxOfElderberries = new Edible("Box of Elderberries", "I'm pretty sure these are safe to eat.", 7.5, 5, 5, 0, 10, 5, 2.5);
	Edible celery = new Edible("Celery", "It's good for your skin.", 8.5, 10, 15, 5, -2, 0, 5);
	Edible onion = new Edible("Onion", "Onions have layers, like a cake.", 8.5, 25, 0, 5, -2, 0, 5);
	Edible turnip = new Edible("Turnip", "Turn Up the Radio!", 8.5, 0, 25, 5, -2, 0, 5);
	Edible manure = new Edible("Manure", "Fresh from the source!", 3, 5, 5, -5, 5, 5, -5);
	
//Weapons can affect the player and the enemy
	Weapon dagger = new Weapon("Dagger", "Ah it's so cute!", 5, 35, 40, 0, 0, 0, -.25, -1, -1, 0, 50000, 0);
	Weapon crapSword = new Weapon("Crap Sword", "Just when you thought the wooden sword was bad", 5, 35, 40, 0, 0, 0, -.25, -1, -1, 0, 5, 0);
	Weapon shovel = new Weapon("Shovel", "It's really ment to be a gardening tool.", 7.5, 35, 35, 0, 0, 0, 0, -2.5, 0, 0, 50000, 0);
	Weapon swordWooden = new Weapon("Wooden Sword", "Not only useless, but also an embaressment!", 15, 75, 85, 0, 0, 0, -.5, -2.5, -2, 0, 25000, 0);
	Weapon swordIron = new Weapon("Iron Sword", "This thing says business.", 25, 125, 140, 0, 0, 0, -5, -7.5, -5, 0, 50000, 0);
	Weapon swordSilver = new Weapon("Silver Sword", "Your enemies will run from a mile away!", 50, 250, 275, 0, -10, 0, -5, -15, -10, 0, 50000, 0);
	Weapon annoyanceSpell = new Weapon("Annoyance Spell", "This will annoy your enemy like CRAZY!", .5, 950, 750, 25, 25, 0, 0, -50, -50, 15, 1, 0);
	Weapon daggerWooden = new Weapon("Wooden Dagger", "You're toast.", 5, 25, 35, 15, 0, 0, 0, -.1, -.5, -.5, 2500, 0);
//Special Items can only affect the player, but can affect the health,etc., and the max health, etc. levels
	SpecialItem earthPotion = new SpecialItem("Earth Potion", "A real mystery for sure.", 5, 1250, 1500, 75, 50, -50, 25, 15, 
			15, 15, 15, 10);
	SpecialItem corbanPotion = new SpecialItem("Starlight Potion", "Boss. Need I say more?", 7.5, 1500, 1250, 50, 50, -25, 0, 20, 20, 20, 5, 15);
	SpecialItem staminaPotion = new SpecialItem("Stamina Potion", "The name kind of says what it is.", 7.5, 65, 55, 0, 35, 0, 0, 0, 0, 0, 0, 0);
//Armor can affect the player stats, enemy stats, and has resistance to shield the player from enemy attacks
	Armor ironArmor = new Armor("Iron Armor", "Very Strong Armor to protect yourself from the Evil!", 10, 350, 250, 0, -2, 0, 0, 0, 0, 0, 500, 0, .1, .1, .1, .1);
	Armor ironEnchantedArmor = new Armor("Enchanted Iron Armor", "Enchanted by dark magic", 12, 475, 425, 1, 1, -1, -4, -1, 0, 0, 50, 0, .25, .25, .25, .25);
	
	/*Items to add:
	 * bell pepper
	 * Bronze armor
	 * Bronze sword
	 * brussel Sprouts
	 * Buk Choy
	 * Cauliflower
	 * Currents Spell
	 * Death Spell
	 * Destruction Spell
	 * Diamond Armor
	 * Diamond Encrested Sword
	 * Empty Bottle
	 * Fire Incense
	 * Fire Spell
	 * Foundation Spell
	 * Green Beans
	 * Guava
	 * Haste Spell
	 * Health Potion
	 * Iron Armor
	 * Lava Spell
	 * Lesser Health Potion
	 * Lesser Stamina Potion
	 * bag of lima beans
	 * milk bottle
	 * Mist encense
	 * Parsley
	 * peas
	 * Quickness Spell
	 * Radish
	 * Spinach
	 * Squash
	 * Stone Sword
	 * Superior Health Potion
	 * Superior Stamina potion
	 * tomato
	 * Ultra spelled diamond armor 
	 * ultra superior health potion
	 * ultra superior Stamina potion
	 * water bottle
	 * water incense
	 * water spell
	 * wind spell
	 * wooden armor
	 * wooden knife
	 * zucchini
	 * uvarovite sword
	 * emarald sword
	 */
	public Store() {
		// add the Stuffs
		storeItems.clear();
		//storeItems.add(oldMap);
		storeItems.add(book);
		storeItems.add(bookBible);
		storeItems.add(oldNoteBook);
		storeItems.add(walkingStick);
		storeItems.add(lanternOil);
		storeItems.add(lanternGas);
		storeItems.add(emptyBottle);
		storeItems.add(clayCup);
		storeItems.add(candleStick);
		storeItems.add(featherPen);
		storeItems.add(oldManPicture);
		storeItems.add(rubiksCube);
		//Add the Edibles
		storeItems.add(apple);
		storeItems.add(oldAle);
		storeItems.add(mango);
		storeItems.add(banana);
		storeItems.add(breadLoaf);
		storeItems.add(bread);
		storeItems.add(cabbage);
		storeItems.add(broccoli);
		storeItems.add(beet);
		storeItems.add(lettuce);
		storeItems.add(potato);
		storeItems.add(watermelon);
		storeItems.add(pumpkin);
		storeItems.add(garlic);
		storeItems.add(ginger);
		storeItems.add(apricot);
		storeItems.add(artichoke);
		storeItems.add(yam);
		storeItems.add(carrot);
		storeItems.add(bagOfCherries);
		storeItems.add(corn);
		storeItems.add(boxOfElderberries);
		storeItems.add(celery);
		storeItems.add(onion);
		storeItems.add(turnip);
		storeItems.add(manure);
		//Add the Weapons
		storeItems.add(dagger);
		storeItems.add(crapSword);
		storeItems.add(shovel);
		storeItems.add(swordWooden);
		storeItems.add(swordIron);
		storeItems.add(swordSilver);
		storeItems.add(daggerWooden);
		//add the special items
		storeItems.add(earthPotion);
		storeItems.add(corbanPotion);
		storeItems.add(staminaPotion);
		//add the armor
		storeItems.add(ironArmor);
		storeItems.add(ironEnchantedArmor);
		//sort the store
		sortStore();
		
		goldExchangeRate = 1;
		manaExchangeRate = 1;
	}
	
	public int getStoreNumItems(){
		return storeItems.size();
	}
	
	public Stuffs getItemAt(int place){
		return storeItems.get(place);
	}
	
	public void sortStore(){
		Collections.sort(storeItems, new Stuffs());
	}
	
	public void makeItemOutOfStock(Stuffs item){
		itemsOutOfStock.add(item);
	}
	
	public boolean isItemOutOfStock(Stuffs item){
		for(int i = 0; i < itemsOutOfStock.size(); i++){
			if(itemsOutOfStock.get(i).getName().equals(item.getName())){
				return true;
			}
		}
		return false;
	}
	
	public void makeItemInStock(int item){
		itemsOutOfStock.remove(item);
	}
	
	public void makeItemInStock(Stuffs item){
		if(isItemOutOfStock(item)){
			itemsOutOfStock.remove(item);
		}
	}
	
	public int numOutOfStock(){
		return itemsOutOfStock.size();
	}
	
	public Stuffs getItemOutOfStock(int index){
		return itemsOutOfStock.get(index);
	}

	/**
	 * @return the goldExchangeRate
	 */
	public double getGoldExchangeRate() {
		return goldExchangeRate;
	}

	/**
	 * @return the manaExchangeRate
	 */
	public double getManaExchangeRate() {
		return manaExchangeRate;
	}

	/**
	 * @param goldExchangeRate the goldExchangeRate to set
	 */
	public void setGoldExchangeRate(double goldExchangeRate) {
		this.goldExchangeRate = goldExchangeRate;
	}

	/**
	 * @param manaExchangeRate the manaExchangeRate to set
	 */
	public void setManaExchangeRate(double manaExchangeRate) {
		this.manaExchangeRate = manaExchangeRate;
	}
}

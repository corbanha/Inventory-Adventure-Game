import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.lang.NumberFormatException;
import java.util.Random;
//import java.lang.IndexOutOfBoundsException;

/**
 * Implmentation of a simple person, the basis of any attackable 'person' in the game.
 * 
 * @author Corban Anderson
 * @version 6/12/14
 */
public class Player {

	Store store = new Store();

	Scanner scanner = new Scanner(System.in);
	
	Random gen = new Random();
	
	private String name;
	private String description;
	private double maxHealth;
	private double health;
	private double maxStamina;
	private double stamina;
	private double maxRadiation;
	private double radiation;
	private double maxFullness;
	private double fullness;
	private double maxInventoryWeight;

	private double amountMana;
	private double amountGold;
	
	private String[] storeSayings = {"The Largest Supply of Manure in Town!", "Need Manure? We got you covered!", "Just sniff that manure! It's wonderful!",
			"Need manure?! Come here!", "We love manure!", "Don't forget to buy some manure!", "Know what your wife wants for Christms? Manure!",
			"1 out of 10 doctors recommend manure for it's health benifits! Buy manure today!"};
	
	private String[] townNews = {"Local man eats fishing pole.", "King caught locked outside castle nude", "King said to crack down on Old Ale selling",
			"King says new \"lightbulb\" will never catch on", "Another death in mine shaft makes 3 this week",
			"Manure from local store raises questions.\n\"It tried to talk to me!\" claims one resident.", "Thief caught smuggling Old Ale near local store",
			"Doctor says patient had finger growing from belly button.\nMay be contagious."};
	
	private Room currentRoom;//the current room that the player is in

	private static ArrayList<Stuffs> inventory = new ArrayList<Stuffs>();

	/**
	 * Constructor for objects of class Person<br>
	 * Defaults are set to 0
	 * 
	 * @param name the name of the player
	 * @param description the description of the player
	 */
	public Player(String name, String description) {
		this.name = name;
		this.description = description;
		maxHealth = 0;
		health = 0;
		maxStamina = 0;
		stamina = 0;
		maxRadiation = 0;
		radiation = 0;
		maxFullness = 0;
		fullness = 0;
		maxInventoryWeight = 0;
	}

	/**
	 * Sets the players' name must be less than 50 char
	 * @param namethe characters name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the players' description, must be less than 250 char
	 * @param descriptionthe description of the player
	 */
	public void setDescription(String des) {
		description = des;
	}

	/**
	 * Sets the max health of the player
	 * @param health the health of the player
	 */
	public void setMaxHealth(double health) {
		if (health > 0) {//makes sure that the max health is greater than 0
			maxHealth = health;
		}
	}

	/**
	 * Sets the health of the player, must be equal to, or less than max health
	 * @param health the health of the player to set
	 */
	public void setHealth(double health) {
		if (health <= maxHealth && health >= 0) {
			this.health = health;
		}
	}

	/**
	 * Sets the max stamina of the player
	 * @param staminathe max stamina of the player
	 */
	public void setMaxStamina(double stamina) {
		if (stamina > 0) {
			maxStamina = stamina;
		}
	}

	/**
	 * Sets the stamina of the player, must be less than, or equal to maxStamina
	 * @param staminathe stamina of the player
	 */
	public void setStamina(double stamina) {
		if (stamina <= maxStamina && stamina >= 0) {
			this.stamina = stamina;
		}
	}

	/**
	 * Sets the max amount of radiation that can be handled
	 * @param rad the max radiation that can be handled
	 */
	public void setMaxRadiation(double rad) {
		if (rad > 0) {
			maxRadiation = rad;
		}
	}

	/**
	 * Sets the radiation level of the player
	 * @param rad the radiation level of the player
	 */
	public void setRadiation(double rad) {
		if (rad <= maxRadiation && rad >= 0) {
			radiation = rad;
		}
	}

	/**
	 * Sets the max fullness level of the player
	 * @param fullness the fullness level of the player
	 */
	public void setMaxFullness(double fullness) {
		if (fullness > 0) {
			maxFullness = fullness;
		}
	}

	/**
	 * Sets the fullness level of the player
	 * @param fullness the fullness level of the player
	 */
	public void setFullness(double fullness) {
		if (fullness <= maxFullness && fullness >= 0) {
			this.fullness = fullness;
		}
	}

	/**
	 * Sets the max weight of the inventory
	 * @param weight the weight to set max
	 */
	public void setInventoryMaxWeight(double weight) {
		if (weight > 0) {
			maxInventoryWeight = weight;
		}
	}

	/**
	 * Returns the amountGold
	 * @return the amountGold
	 */
	public double getAmountGold() {
		return amountGold;
	}

	/**
	 * Sets the amount gold
	 * @param amountGold the amountGold to set
	 */
	public void setAmountGold(double amountGold) {
		this.amountGold = amountGold;
	}

	/**
	 * Gets the amount mana
	 * @return the amountMana
	 */
	public double getAmountMana() {
		return amountMana;
	}

	/**
	 * Sets the amount mana
	 * @param amountMana the amountMana to set
	 */
	public void setAmountMana(double amountMana) {
		this.amountMana = amountMana;
	}

	/**
	 * Gets the player name
	 * @return the player name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the player description
	 * @return the player description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Gets the max health of the player
	 * @return the max health of the player
	 */
	public double getMaxHealth() {
		return maxHealth;
	}

	/**
	 * Gets the health of the player
	 * @return the health of the player
	 */
	public double getHealth() {
		return health;
	}

	/**
	 * Gets the max stamina of the player
	 * @return the max stamina of the player
	 */
	public double getMaxStamina() {
		return maxStamina;
	}

	/**
	 * Gets the stamina of the player
	 * @return the stamina of the player
	 */
	public double getStamina() {
		return stamina;
	}

	/**
	 * Gets the max radiation that the player can handle
	 * @return the max radiation that the player can handle
	 */
	public double getMaxRadiation() {
		return maxRadiation;
	}

	/**
	 * Gets the radiation levels of the player
	 * @return the radiation levels of the player
	 */
	public double getRadiation() {
		return radiation;
	}

	/**
	 * Gets the max fullness of the player
	 * @return the max fullness of the player
	 */
	public double getMaxFullness() {
		return maxFullness;
	}

	/**
	 * Gets the fullness of the player
	 * @return the fullness of the player
	 */
	public double getFullness() {
		return fullness;
	}

	/**
	 * Gets the max inventory weight
	 * @return the max inventory weight
	 */
	public double getMaxInventoryWeight() {
		return maxInventoryWeight;
	}

	/**
	 * Gets the inventory weight
	 * @return the inventory weight
	 */
	public double getInventoryWeight() {
		double weight = 0;
		// for each statement
		for (Stuffs i : inventory) {
			weight += i.getWeight();
		}
		return Math.round(weight * 100.0) / 100.0;//rounds the number to two decimal places
	}

	/**
	 * Add an object to the inventory
	 * @param object the object to add to the inventory
	 */
	public void addItem(Stuffs object){
		if(!(object.getWeight() + getInventoryWeight() <= maxInventoryWeight)){
			System.out.println("Too heavy!!");//With the inventory checking in openStore, these should never be said
		}else if(getAmountMana() - object.getManaCost() < 0){
			System.out.println("Not enough mana to purchase!");//<----
		}else if(getAmountGold() - object.getGoldCost() < 0){
			System.out.println("Not enough gold!");//<----
		}else{
			inventory.add(object);
			setAmountMana(getAmountMana() - object.getManaCost());
			setAmountGold(getAmountGold() - object.getGoldCost());
		}
	}

	/**
	 * Forces an object to the inventory, mana, gold and weight are thrown out the window
	 * @param object the object to add to the inventory
	 */
	public void forceItem(Stuffs object){
		inventory.add(object);
	}

	/**
	 * Will check if the user has enough Mana, Gold and weight in inventory
	 * @param item the item to test
	 * @param num the number of items that the user would like to buy
	 * @return true if item can be bought, false is not
	 */
	public boolean canItemBeBought(Stuffs item, int num){
		return ((item.getWeight() * num + getInventoryWeight() <= maxInventoryWeight) && 
				(getAmountMana() - item.getManaCost() * num > 0) && (getAmountGold() - item.getGoldCost() * num > 0));
	}
	
	/**
	 * Allows the user to observe all of the items in the room, to observe the enemies, and access the chests in the room
	 */
	public void observeRoom(){
		try{
			System.out.println("\n" + currentRoom.getName());
			
			//display the options
			for(int i = 0; i < currentRoom.getEnemies().size(); i++){
				System.out.println("<" + (i + 1) + "> " + currentRoom.getEnemies().get(i).getName());
			}
			for(int i = 0; i < currentRoom.getChests().size(); i++){
				System.out.println("<" + (i + 1 + currentRoom.getEnemies().size()) + "> " + currentRoom.getChests().get(i).getName());
			}
			System.out.println("<" + (currentRoom.getEnemies().size() + currentRoom.getChests().size() + 1) + "> -Back-");
			
			int thingToObserve = scanner.nextInt() - 1;//because the menus start at one
			
			if(thingToObserve < currentRoom.getEnemies().size()){
				System.out.println(currentRoom.getEnemies().get(thingToObserve).getAttributes());				
			}else if(thingToObserve < currentRoom.getEnemies().size() + currentRoom.getChests().size()){
				System.out.println(currentRoom.getChests().get(thingToObserve - currentRoom.getEnemies().size()).getAttributes());
				System.out.println("Would you like to take the items in this " + 
						currentRoom.getChests().get(thingToObserve - currentRoom.getEnemies().size()).getName() + "?");
				String userWantToTakeChest = scanner.next();
				if(userWantToTakeChest.toUpperCase().equals("Y")){
					//adds the items to the users' inventory
					for(int i = 0; i < currentRoom.getChests().get(thingToObserve - currentRoom.getEnemies().size()).getItems().length; i++){
						//TODO check to make sure that the user can hold the items before they are added
						forceItem(currentRoom.getChests().get(thingToObserve - currentRoom.getEnemies().size()).getItems()[i]);
					}
					currentRoom.getChests().remove(thingToObserve - currentRoom.getEnemies().size());
				}
				//remove the chest when we are done
				//currentRoom.getChests().remove(thingToObserve - currentRoom.getEnemies().size());
			}else{
				//Do nothing
			}
			
		}catch(Exception e){
			System.out.println("I didn't get that.");
		}
	}
	

	/**
	 * Sets up the interface for the player to buy new objects
	 * @return true if the user is ready to leave, false if they are not ready to leave
	 */
	public boolean openStore() {
		String itemType = "";//used for which action that the user would like to do
		System.out.println("\n=============== Store ===============");
		System.out.printf("%5.2f     mana\n%5.2f     gold\n",getAmountMana(), getAmountGold());
		double inSpaceLeft = Math.round((getMaxInventoryWeight() - getInventoryWeight()) * 100.0) / 100.0;//Calculates the free space in inventory
		double inPercentUsed = (getInventoryWeight() / getMaxInventoryWeight()) * 100.0;//calculates the percent used in inventory
		System.out.print("Inventory:\n" + getInventoryNumItems() + " items | ");
		System.out.print(getInventoryWeight() + " lbs. / " + getMaxInventoryWeight() + " lbs. | ");
		System.out.printf("%.2f", inPercentUsed);//Makes sure that the percent is only 2 decimal paces
		System.out.println("%\n" + inSpaceLeft + " lbs. avaliable");
		System.out.println("=====================================");
		int news = gen.nextInt(5);//this will randomly generate news for the store and put items in/out of stock
		String itemOnSale = "";
		int itemPercentOnSale = 0;
		if(news == 0){//20% chance for each
			int randItem = gen.nextInt(store.getStoreNumItems());//makes an item out of stock
			if(store.isItemOutOfStock(store.getItemAt(randItem))){//if the item that we have chosen is out of stock
				System.out.println("Store News:\nNothing new today.");
			}else{
				System.out.println("Store News:\n" + store.getItemAt(randItem).getName() + " is out of stock.");
				store.makeItemOutOfStock(store.getItemAt(randItem));
			}
		}else if(news == 1){
			if(store.numOutOfStock() > 0){//if there is at least one item out of stock
				System.out.println("Store News:\n" + store.getItemOutOfStock(0).getName() + " is back in stock.");
				store.makeItemInStock(store.getItemOutOfStock(0));
			}else{
				System.out.println("Store News:\nNothing new today.");
			}
		}else if(news == 2){
			int randItem = gen.nextInt(store.getStoreNumItems());
			if(store.isItemOutOfStock(store.getItemAt(randItem))){//if the item that we have chosen is out of stock
				System.out.println("Store News:\nNothing new today.");
			}else{
				itemOnSale = store.getItemAt(randItem).getName();
				itemPercentOnSale = 10 + gen.nextInt(26);//10-35% on sale
				//itemPercentOnSale = 50 + gen.nextInt(26);//50-75% on sale
				System.out.println("Store News:\n" + itemOnSale + " is " + itemPercentOnSale + "% off!\nGo while sale is on!");
			}
		}else if(news == 3){//20%
			System.out.println("Message from Owner:\n" + storeSayings[(int) (Math.random() * (storeSayings.length))]);
		}else{//20
			System.out.println("Town News:\n" + townNews[(int) (Math.random() * (townNews.length))]);
		}
		System.out.println("=====================================\n");
		System.out.println("How can I help you today?\n<1> Regular Items\n<2> Food Items\n<3> Weapon Items\n<4> Armor Items\n<5> Special Items\n<6> All Items\n" + 
				"<7> Items that can be Bought\n<8> Search for an Item\n<9> Leave Store\n");
		itemType = scanner.next();//Gets the option that the user would like
		if (itemType.equals("1") || itemType.equals("2") || itemType.equals("3") || itemType.equals("4") || itemType.equals("5") || itemType.equals("6") ||
				itemType.equals("7") || itemType.equals("8")) {
			String userInput = "";
			if (itemType.equals("1")) {//Regular Items
				System.out.println("\nRegular Items:");
				for (int i = 0; i < store.getStoreNumItems(); i++) {//If the item is not a weapon, Edible or special item, then show it
					if(!(store.getItemAt(i) instanceof Weapon) && !(store.getItemAt(i) instanceof Edible) && !(store.getItemAt(i) instanceof SpecialItem)){
						System.out.println("<" + (i + 1) + "> " + store.getItemAt(i));
					}
				}
			} else if (itemType.equals("2")) {//Food Items
				System.out.println("\nFood Items:");
				for (int i = 0; i < store.getStoreNumItems(); i++) {//if item is not a weapon and not special item, but is edible then show it
					if(!(store.getItemAt(i) instanceof Weapon) && (store.getItemAt(i) instanceof Edible) && !(store.getItemAt(i) instanceof SpecialItem)){
						System.out.println("<" + (i + 1) + "> " + store.getItemAt(i));
					}
				}
			} else if (itemType.equals("3")) {//Weapon Items
				System.out.println("\nWeapon Items:");
				for (int i = 0; i < store.getStoreNumItems(); i++) {
					if(store.getItemAt(i) instanceof Weapon && !(store.getItemAt(i) instanceof Armor)){//it its a weapon
						System.out.println("<" + (i + 1) + "> " + store.getItemAt(i));
					}
				}
			} else if (itemType.equals("4")){
				System.out.println("\nArmor Items:");
				for(int i = 0; i < store.getStoreNumItems(); i++){
					if(store.getItemAt(i) instanceof Armor){//its an armor item
						System.out.println("<" + (i + 1) + "> " + store.getItemAt(i));
					}
				}
			} else if (itemType.equals("5")) {//Special Items
			
				System.out.println("\nSpecial Items:");
				for (int i = 0; i < store.getStoreNumItems(); i++) {
					if(store.getItemAt(i) instanceof SpecialItem){//if its a special item
						System.out.println("<" + (i + 1) + "> " + store.getItemAt(i));
					}
				}
			} else if (itemType.equals("6")){//All items
				System.out.println("\nAll Items:");
				for (int i = 0; i < store.getStoreNumItems(); i++) {//runs threw all the items, notice how there isn't a if statement here
					System.out.println("<" + (i + 1) + "> " + store.getItemAt(i));
				}
			} else if (itemType.equals("7")){//Items that can be bought
				System.out.println("\nItems that can be Bought:");
				for (int i = 0; i < store.getStoreNumItems(); i++) {
					//checks to make sure that the item can be bought at least once, and it is not out of stock, then shows it
					if(canItemBeBought(store.getItemAt(i), 1) && !store.isItemOutOfStock(store.getItemAt(i))){
						System.out.println("<" + (i + 1) + "> " + store.getItemAt(i));
					}
				}
			} else if (itemType.equals("8")){//Allows the user to search for an item
				System.out.println("\nWhat Item are you Looking for?");
				String itemLookingFor = scanner.next().toLowerCase();
				for (int i = 0; i < store.getStoreNumItems(); i++) {//shows it the item name contains the search
					if(store.getItemAt(i).getName().toLowerCase().contains(itemLookingFor)){
						System.out.println("<" + (i + 1) + "> " + store.getItemAt(i));
					}
				}
			}
			//By default, everything will do this stuff:
			System.out.println("<" + (store.getStoreNumItems() + 1) + "> -Back-\n");//the back button will always be one more than the store size
			userInput = scanner.next();
			
			try {
				if (Integer.parseInt(userInput) >= 0 && Integer.parseInt(userInput) <= store.getStoreNumItems()) {//chose item
					String itemName = store.getItemAt(Integer.parseInt(userInput) - 1).getName();
					double originalCostMana = store.getItemAt(Integer.parseInt(userInput) - 1).getManaCost();
					double originalCostGold = store.getItemAt(Integer.parseInt(userInput) - 1).getGoldCost();
					if(itemOnSale.equals(store.getItemAt(Integer.parseInt(userInput) - 1).getName())){//if the item is on sale
						System.out.println("\nThis item is on sale for " + itemPercentOnSale + "% off!");
						double setSaleMana = Math.round((originalCostMana - originalCostMana * (itemPercentOnSale / 100.0)) * 1000.0) / 1000.0;
						double setSaleGold = Math.round((originalCostGold - originalCostGold * (itemPercentOnSale / 100.0)) * 1000.0) / 1000.0;
						System.out.println("Get it for " + setSaleMana + " mana and " + setSaleGold + " gold,");
						System.out.println("Instead of " + originalCostMana + " mana and " + originalCostGold + " gold!");
						store.getItemAt(Integer.parseInt(userInput) - 1).setManaCost(setSaleMana);
						store.getItemAt(Integer.parseInt(userInput) - 1).setGoldCost(setSaleGold);
					}
					System.out.println("\n" + store.getItemAt(Integer.parseInt(userInput) - 1).getAttributes());//shows attributes
					String userInputPurchaseItem ="";
					boolean itemProcessed = false;//while the item isn't processed
					do{
						if(canItemBeBought(store.getItemAt(Integer.parseInt(userInput) - 1), 1)){//if the item can be bought
							if(store.isItemOutOfStock(store.getItemAt(Integer.parseInt(userInput) - 1))){
								System.out.println("\nThis item is Out of Stock.");//if the item is out of stock
								return false;
							}
							boolean userHasArmor = false;
							int indexOfArmor = -1;
							for(int i = 0; i < inventory.size(); i++){
								if(inventory.get(i) instanceof Armor){
									userHasArmor = true;
									indexOfArmor = i;
									break;
								}
							}	
							if(userHasArmor && store.getItemAt(Integer.parseInt(userInput) - 1) instanceof Armor){
								System.out.println("\nYou can only have one pair of Armor on at a time.\nPlease sell " + 
									inventory.get(indexOfArmor).getName() + " first, then you can buy this armor.");
								return true;
							}
							System.out.println("\nWould you like to purchase this item, " + itemName + "? (y/n)");
							userInputPurchaseItem = scanner.next();//user user still wants to purchase the item
							if(userInputPurchaseItem.equals("y") || userInputPurchaseItem.equals("Y") || userInputPurchaseItem.equals("1")){
								String quantityItem = "";
								int maxOfItem = 1;//the max that the user can buy with their money
								boolean canStillBuyMore = true;
								for(int i = 1; canStillBuyMore; i++){//checks to see how many of this item that the player can buy
									if(canItemBeBought(store.getItemAt(Integer.parseInt(userInput) - 1), i)){
										maxOfItem = i;
									}else{
										canStillBuyMore = false;
									}
								}
								if(itemOnSale.equals(itemName)){
									maxOfItem = 15;
								}
								System.out.println("How many of this item, " + itemName + ", would you like? (" + maxOfItem + " max)");
								quantityItem = scanner.next();//how many the user wants to buy
								int numPurchased = Integer.parseInt(quantityItem);//converting to an integer
								if(numPurchased <= 0){//if they say that they want 0 or less items
									System.out.println("You can't buy " + numPurchased + " " + itemName);
								}else if(numPurchased > maxOfItem && (itemOnSale.equals(itemName))){
									System.out.println("There's a limit of 15 per customer for when there is a sale!");
								}else{
									if(!canItemBeBought(store.getItemAt(Integer.parseInt(userInput) - 1), numPurchased)){//if item can't be purchased
										System.out.println("You do not have enough resources to make this purchase.");
									}else{//if user does have enough money, etc. to purchase all of the items wanted
										for(int i = 1; i <= numPurchased; i++ ){
											addItem(store.getItemAt(Integer.parseInt(userInput) - 1));//add the item
											if(gen.nextInt(50) == 0){//2% chance of getting pocket lint per buy
												addItem(new Stuffs("Pocket Lint", "Hmmmm soft.", 0, 1, 1));//pocket lint can't be bought at the store
											}
										}
										double itemManaCost = store.getItemAt(Integer.parseInt(userInput) - 1).getManaCost();
										double itemGoldCost = store.getItemAt(Integer.parseInt(userInput) - 1).getGoldCost();
										System.out.printf("\nSale has been processed! You bought %d %s for %.2f mana and %.2f gold!\n", numPurchased, 
												itemName, (itemManaCost * numPurchased),
												(itemGoldCost * numPurchased));
										if((itemOnSale.equals(store.getItemAt(Integer.parseInt(userInput) - 1).getName()))){
											double manaSaved = (originalCostMana - itemManaCost) * numPurchased;
											double goldSaved = (originalCostGold - itemGoldCost) * numPurchased;
											System.out.printf("You saved %.2f mana and %.2f gold!\n",manaSaved, goldSaved);
										}
										System.out.println("Come back soon!\n");//shows the processing receipt
										if(numPurchased >= 15){//if the user purchased more than 25, then this item will be out of stock
											store.makeItemOutOfStock(store.getItemAt(Integer.parseInt(userInput) - 1));
											System.out.println(store.getItemAt(Integer.parseInt(userInput) - 1).getName() + " is out of stock.");
										}
										store.getItemAt(Integer.parseInt(userInput) - 1).setManaCost(originalCostMana);
										store.getItemAt(Integer.parseInt(userInput) - 1).setGoldCost(originalCostGold);
										setAmountMana(Math.round(getAmountMana() * 1000.0) / 1000.0);
										setAmountGold(Math.round(getAmountGold() * 1000.0) / 1000.0);
										itemProcessed = true;//item is now processed
									}
								}
							}else if(userInputPurchaseItem.equals("n") || userInputPurchaseItem.equals("N") || userInputPurchaseItem.equals("0")){
								System.out.println("That's okay, Im sure I have something that will suite you.");
								itemProcessed= true;//item processed, meaning that the user has said that they want to leave
							}else{
								System.out.println("I dont understand.");
								itemProcessed = false;//User may have made a mistake and still wants to buy something
							}
						}else{
							System.out.println("\nYou do not have enough resources to get this item.");
							itemProcessed = true;//Auto leave because the user can't buy the item in the first place
						}

					}while(!itemProcessed);

				}else if(!(userInput.equals("" + (store.getStoreNumItems() + 1)))){//if it doesn't equal to the back button
					System.out.println("Sorry I didn't get that");
				}
				return false;//user is not ready to go yet
			} catch (NumberFormatException e) {
				System.out.println("Sorry, I didn't get that!");
			}
		} else if (itemType.equals("9")) {
			return true;//user is ready to go
		} else {
			System.out.println("I didnt quite catch that, maybe another try?\n");//user enters something wrong on the menu
			return false;
		}
		return false;
	}

	/**
	 * Gives the ability for the user to sell an item
	 * @return true if the user is ready to leave, false if not
	 */
	public boolean sellItem(){
		System.out.println("\nChoose an item that you would like to sell:");
		if(inventory.size() == 0){//If the user has nothing in the inventory
			System.out.println("You have nothing that you can sell.");
			return true;
		}else{
			System.out.println(getInventory());//shows the inventory contents
			String itemChoosen = scanner.next();
			int itemToSell;
			try{
				itemToSell = Integer.parseInt(itemChoosen);
				itemToSell--;//We have to do this because our menu items start a 1, when ArrayLists start at 0
				if(itemToSell >= 0 && itemToSell < inventory.size()){//Make sure that the item selected is in the inventory
					double sellingPriceMana = Math.round(inventory.get(itemToSell).getManaCost() * .75);
					double sellingPriceGold = Math.round(inventory.get(itemToSell).getGoldCost() * .75);//The money got from selling is less than when bought
					System.out.println("\n" + inventory.get(itemToSell).getAttributes());
					System.out.println("\nWould you like to sell this item for " + sellingPriceMana + " mana and " +
							sellingPriceGold + " gold? (y/n)");//Asks user if they want to sell the item
					String userWantToSell = scanner.next();
					if(userWantToSell.equals("y") || userWantToSell.equals("Y")){
						System.out.println("How many of this item would you like to sell? (" + 
								getNumOfItemInInventory(inventory.get(itemToSell)) + " max)");
						String numWantToSell = scanner.next();
						int numToSell = Integer.parseInt(numWantToSell);
						if(numToSell > 0 && numToSell <= getNumOfItemInInventory(inventory.get(itemToSell))){
							for(int i = 0; i < numToSell; i++){//Removes the item and adds the corresponding money
								removeItem(inventory.get(itemToSell));
								amountMana += sellingPriceMana;
								amountGold += sellingPriceGold;
							}
							System.out.println("\nSold for " + (sellingPriceMana * numToSell) + " mana and " + 
									(sellingPriceGold * numToSell) + " gold. Good doing business!");//End message tells them to total money received
							return true;
						}else{
							System.out.println("You don't have that many items");
							return false;
						}
					}else{//if the user doesn't want to sell anything
						return true;
					}
				}else{//if the item chosen is out of the inventory bounds
					System.out.println("You can't do that");
					return false;
				}
			}catch(NumberFormatException e){//if user doesn't put in a number
				System.out.println("I dont understand");
				return false;
			}catch(IndexOutOfBoundsException e){//if number is out of bounds, should be caught in first if though
				System.out.println("Oops! That's not in the inventory!");
				return false;
			}
		}
	}
	
	/*
	 * Returns the specs waste from adding the health
	 * @param health the health add
	 * @param stamina the stamina add
	 * @param rad the radiation waste, meaning when radiation can't go lower than 0
	 * @param fullness the fullness waste
	 * @return specs waste
	 *
	public String itemWaste(double health, double stamina, double rad, double fullness){
		String string = "";
		if(health + this.health > maxHealth){
			
		}
		return string;
	}*/
	
	
	/**
	 * Use item, use an item from the inventory
	 * @return true if user is ready to go, false if not
	 */
	public boolean useItem(){
		try{
			System.out.println("\nChoose an item that you would like to use:");
			if(inventory.size() == 0){//If the user has nothing in the inventory
				System.out.println("You have nothing that you can use.");
				return true;
			}else{
				System.out.println(getInventory());//shows the inventory contents
			}
			String itemUserWantsToUse = scanner.next();
			int itemAt = Integer.parseInt(itemUserWantsToUse) - 1;//because our menus start at 1
			if(itemAt < 0 ||itemAt >= inventory.size()){
				System.out.println("No such item");
				return false;
			}
			System.out.println(inventory.get(itemAt).getAttributes() + "\nAre you sre you want to use this item? (y/n)");
			String userSureWantUseItem = scanner.next();
			if(userSureWantUseItem.equals("y") || userSureWantUseItem.equals("Y")){
				//Use item
				/*System.out.println("Be careful, your health can not go past your maxHealth, you may waste some health!\n" +
						"How many of this item would you like to use? (" +
						getNumOfItemInInventory(inventory.get(itemAt)) + " max)");
				String numWantToUse = scanner.next();
				int numToUse = Integer.parseInt(numWantToUse);
				if(numToUse <= 0 || numToUse > getNumOfItemInInventory(inventory.get(itemAt))){
					System.out.println("You can't do that.");
					return false;
				}else{
					for(int i = 0; i < numToUse; i++){
						
					}
				}*/

				if(!(inventory.get(itemAt) instanceof Weapon) && !(inventory.get(itemAt) instanceof Edible) && !(inventory.get(itemAt) instanceof SpecialItem)){
					//Item is a Stuffs item
					System.out.println("There is nothing that you can do with this item right now.");
					return true;//the user is done
				}else{
					//The item can affect the player
					if(inventory.get(itemAt) instanceof SpecialItem){
						//If item is special, then set all of the maxes
						SpecialItem item = (SpecialItem) inventory.get(itemAt);
						maxHealth += item.getMaxHealthGain();
						maxStamina += item.getMaxStaminaGain();
						maxRadiation += item.getMaxRadiationGain();
						maxFullness += item.getMaxFullnessGain();
						maxInventoryWeight += item.getMaxInventoryGain();
					}
					if((inventory.get(itemAt) instanceof Weapon) && !(inventory.get(itemAt) instanceof Armor)){//if it's a weapon
						//select the enemy to attack
						if(currentRoom.getEnemies().size() == 0){
							System.out.println("There are no enemies nearby to attack.");
						}else{
							attackEnemy((Weapon) inventory.get(itemAt));
							return true;
						}						
					}else if(inventory.get(itemAt) instanceof Armor){
						System.out.println("You can not use this item at the current time.");
						return true;
					}
					//Now that Special item taken care of, all the items have Edible attributes so we can call:
					Edible item = (Edible) inventory.get(itemAt);
					//not going to warn the player if they may waste some health, etc.
					this.health += item.getHealthGain();
					this.stamina += item.getStaminaGain();
					this.radiation += item.getRadiationGain();
					this.fullness += item.getFullnessGain();	
					//Now we will make fix the health if it has gone higher than the max
					if(this.health > maxHealth){
						this.health = maxHealth;
					}
					if(this.stamina > maxStamina){
						this.stamina = maxStamina;
					}
					if(this.radiation < 0){
						this.radiation = 0;
					}
					if(this.fullness > maxFullness){
						this.fullness = maxFullness;
					}
					inventory.remove(itemAt);
				}
				return true;
			}else{
				return true;//user is done and doesn't want to use the item
			}
		}catch(NumberFormatException e){
			System.out.println("I don't understand");
		}
		return false;
	}
	
	/**
	 * Attack an enemy with an item
	 * @param weapon the weapon to attack the enemy with
	 * @param enemy the enemy to attack
	 */
	public void attackEnemy(Weapon weapon){
		System.out.println("Select the enemy that you would like to attack:");
		String enemyChoosen = "";
		for(int i = 0; i < currentRoom.getEnemies().size(); i++){
			enemyChoosen += "<" + (i + 1) + "> " + currentRoom.getEnemies().get(i).getName() + "\n";
		}
		System.out.println(enemyChoosen);
		
		String userSelection = scanner.next();
		
		Enemy enemyToAttack;
		
		int enemy;
		
		try{
			enemy = Integer.parseInt(userSelection) - 1;
		}catch(Exception e){
			enemy = 0;
		}
		
		if(enemy < 0 || enemy > currentRoom.getEnemies().size()){
			enemy = 0;
		}
		
		enemyToAttack = (Enemy) currentRoom.getEnemies().get(enemy);
		
		System.out.println("You chose to attack the " + enemyToAttack.getName() + "!");
		
		//Find out if the player has Armor
		Armor playerArmor = new Armor();
		boolean playerHasArmor = false;
		for(int i = 0; i < inventory.size(); i++){
			if(inventory.get(i) instanceof Armor){
				playerArmor = (Armor) inventory.get(i);
				playerHasArmor = true;
				break;
			}
		}
		
		//decrease enemy stats
		double enemyHealthGain = weapon.getEnemyHealthGain() + playerArmor.getEnemyHealthGain();//Remember that enemyHealthGain() will be negative by default
		double enemyStaminaGain = weapon.getEnemyStaminaGain() + playerArmor.getEnemyStaminaGain();
		double enemyRadiationGain = weapon.getEnemyRadiationGain() + playerArmor.getEnemyRadiationGain();
		double enemyFullnessGain = weapon.getEnemyFullnessGain() + playerArmor.getEnemyFullnessGain();
		
		enemyToAttack.setHealth(enemyToAttack.getHealth() + enemyHealthGain);		
		enemyToAttack.setStamina(enemyToAttack.getStamina() + enemyStaminaGain);
		enemyToAttack.setRadiation(enemyToAttack.getRadiation() + enemyRadiationGain);
		enemyToAttack.setFullness(enemyToAttack.getFullness() + enemyFullnessGain);
		
		//Tell player how much enemy lost
		System.out.println(this.name + " attacks!");
		if(enemyHealthGain != 0) System.out.println(String.format("%s loses (%.2f + %.2f) %.2f Health!", enemyToAttack.getName(), 
				Math.abs(weapon.getEnemyHealthGain()), Math.abs(playerArmor.getEnemyHealthGain()), Math.abs(enemyHealthGain)));
		if(enemyStaminaGain != 0) System.out.println(String.format("%s loses (%.2f + %.2f) %.2f Stamina!", enemyToAttack.getName(), 
				Math.abs(weapon.getEnemyStaminaGain()), Math.abs(playerArmor.getEnemyStaminaGain()), Math.abs(enemyStaminaGain)));
		if(enemyFullnessGain != 0) System.out.println(String.format("%s loses (%.2f + %.2f) %.2f Fullness!", enemyToAttack.getName(), 
				Math.abs(weapon.getEnemyFullnessGain()), Math.abs(playerArmor.getEnemyFullnessGain()), Math.abs(enemyFullnessGain)));
		if(enemyRadiationGain != 0) System.out.println(String.format("%s gains (%.2f + %.2f) %.2f Radiation!", enemyToAttack.getName(), 
				Math.abs(weapon.getEnemyRadiationGain()), Math.abs(playerArmor.getEnemyRadiationGain()), Math.abs(enemyRadiationGain)));
		
		System.out.println("\nNow it's " + enemyToAttack.getName() + "'s turn!");
		
		//decrease Player stats		
		
		double playerHealthSaved = enemyToAttack.getAttackHealth() * playerArmor.getHealthResistance();
		double playerStaminaSaved = enemyToAttack.getAttackStamina() * playerArmor.getStaminaResistance();
		double playerRadiationSaved = enemyToAttack.getAttackRadiation() * playerArmor.getRadiationResistance();
		double playerFullnessSaved = enemyToAttack.getAttackFullness() * playerArmor.getFullnessResistance();
		
		
		double playerHealthGain = enemyToAttack.getAttackHealth() - playerHealthSaved;
		double playerStaminaGain = enemyToAttack.getAttackStamina() - playerStaminaSaved;
		double playerRadiationGain = enemyToAttack.getAttackRadiation() - playerRadiationSaved;
		double playerFullnessGain = enemyToAttack.getAttackFullness() - playerFullnessSaved;
		
		this.health -= playerHealthGain ;
		this.stamina -= playerStaminaGain ;
		this.radiation -= playerRadiationGain;
		this.fullness -= playerFullnessGain ;
		
		if(playerHealthGain != 0) System.out.println(String.format("You lose (%.2f - %.2f) %.2f Health!", enemyToAttack.getAttackHealth(), playerHealthSaved, 
				playerHealthGain));
		if(playerStaminaGain != 0) System.out.println(String.format("You lose (%.2f - %.2f) %.2f Stamina!", enemyToAttack.getAttackStamina(), playerStaminaSaved,
				playerStaminaGain));
		if(playerFullnessGain != 0) System.out.println(String.format("You lose (%.2f - %.2f) %.2f Fullness!", enemyToAttack.getAttackFullness(), playerFullnessSaved,
				playerFullnessGain));
		if(playerRadiationGain != 0) System.out.println(String.format("You gain (%.2f - %.2f) %.2f Radiation!", (enemyToAttack.getAttackRadiation() * -1), 
				(playerRadiationSaved * -1), (playerRadiationGain * -1)));
		
		if(weapon.getHealthGain() != 0 || weapon.getStaminaGain() != 0 || weapon.getFullnessGain() != 0 || weapon.getRadiationGain() != 0) System.out.println();
		
		if(weapon.getHealthGain() != 0) System.out.println(String.format("You gain %.2f Health from %s!", weapon.getHealthGain(), weapon.getName()));
		if(weapon.getStaminaGain() != 0) System.out.println(String.format("You gain %.2f Stamina from %s!", weapon.getStaminaGain(), weapon.getName()));
		if(weapon.getFullnessGain() != 0) System.out.println(String.format("You gain %.2f Fullness from %s!", weapon.getFullnessGain(), weapon.getName()));
		if(weapon.getRadiationGain() != 0) System.out.println(String.format("You lose %.2f Radiation from %s!",  (weapon.getRadiationGain() * -1), weapon.getName()));
		
		if(playerArmor.getHealthGain() != 0 || playerArmor.getStaminaGain() != 0 || playerArmor.getFullnessGain() != 0 || playerArmor.getRadiationGain() != 0) System.out.println();
		
		if(playerArmor.getHealthGain() != 0) System.out.println(String.format("You gain %.2f Health from %s!", playerArmor.getHealthGain(), playerArmor.getName()));
		if(playerArmor.getStaminaGain() != 0) System.out.println(String.format("You gain %.2f Stamina from %s!", playerArmor.getStaminaGain(), playerArmor.getName()));
		if(playerArmor.getFullnessGain() != 0) System.out.println(String.format("You gain %.2f Fullness from %s!", playerArmor.getFullnessGain(), playerArmor.getName()));
		if(playerArmor.getRadiationGain() != 0) System.out.println(String.format("You lose %.2f Radiation from %s!",  (playerArmor.getRadiationGain() * -1), playerArmor.getName()));
		
		if(this.radiation / this.maxRadiation > .15){
			double radAffect = ((this.radiation / this.maxRadiation)) * 11;
			this.health -= radAffect;
			System.out.println("\nYou lose " + String.format("%.2f", radAffect) + " health from Radiation Sickness");
		}
		
		if(this.stamina / this.maxStamina < .7){
			double fullAffect = Math.abs((this.stamina / this.maxStamina) - 1) * 20;
			this.fullness -= fullAffect;
			System.out.println("\nYou lose " + String.format("%.2f", fullAffect) + " fullness from Stamina loss");
		}
		
		
		if(this.fullness / this.maxFullness < .7){
			double fullnessAffect = Math.abs((this.fullness / this.maxFullness) - 1) * 11;
			this.health -= fullnessAffect;
			System.out.println("\nYou lose " + String.format("%.2f", fullnessAffect) + " health from Hunger");
		}
		
		if(this.health < 0){
			System.out.println("\nYou would have died, but a humbled priest has healed you\nenough to get to the next town.\nYou are thankful.\n");
			this.health = 15;
			this.stamina += 5;
			this.fullness += 5;
			this.radiation -= 5;
		}
		
		
		//Add extra player stats from the weapon and Armor
		health += weapon.getHealthGain() + playerArmor.getHealthGain();
		stamina += weapon.getStaminaGain() + playerArmor.getStaminaGain();
		radiation += weapon.getRadiationGain() + playerArmor.getRadiationGain();
		fullness += weapon.getFullnessGain() + playerArmor.getFullnessGain();
		
		
		//decrease weapon and armor uses
		weapon.setNumUses(weapon.getNumUses() + 1);
		if(weapon.getNumUses() >= weapon.getMaxUses()){
			System.out.println("\n" + weapon.getName() + " has broken!");
			inventory.remove(weapon);
		}
		playerArmor.setNumUses(playerArmor.getNumUses() + 1);
		if(playerArmor.getNumUses() >= playerArmor.getMaxUses() && playerHasArmor){
			System.out.println("\n" + playerArmor.getName() + " has broken!");
			inventory.remove(playerArmor);
		}
		
		//remove enemy if dead
		if(enemyToAttack.getHealth() <= 0){
			System.out.println("\n" + enemyToAttack.getName() + " has fallen");
			currentRoom.getEnemies().remove(enemy);
			
			int goldGained = (int) (2 * enemyToAttack.getAttackHealth() * (Math.random() * enemyToAttack.getAttackStamina() + 1));
			int manaGained = (int) (2 * enemyToAttack.getAttackHealth() * (Math.random() * enemyToAttack.getAttackStamina() + 1));
			
			System.out.println("You found " + manaGained + " mana, and " + goldGained + " gold!");
			this.amountMana += manaGained;
			this.amountGold += goldGained;
		}
	}
	
	/**
	 * Observe item, check the specs of an item
	 */
	public void observeItem(){
		try{
			System.out.println("\nChoose an item that you would like to use:");
			if(inventory.size() == 0){//If the user has nothing in the inventory
				System.out.println("You have nothing that you can observe.");
			}else{
					System.out.println(getInventory());//shows the inventory contents
				}
				String itemUserWantsToUse = scanner.next();
				int itemAt = Integer.parseInt(itemUserWantsToUse) - 1;//because our menus start at 1
				if(itemAt < 0 ||itemAt >= inventory.size()){
					System.out.println("No such item");
				}
				System.out.println(inventory.get(itemAt).getAttributes());
			
		}catch(NumberFormatException e){
			System.out.println("That won't work");
		}
	}

	/**
	 * Returns a string representation of the player
	 * @return a string representation of the player
	 */
	public void getAttributes() {
		System.out.println("Name:                    " + getName());
		//System.out.printf("Description:          %50s\n", getDescription());
		System.out.printf("Mana:                    %6.2f\nGold:                    %6.2f\n",amountMana , amountGold);;
		System.out.printf("Health:                  %6.2f / %6.2f | %6.2f", getHealth(), getMaxHealth(), getHealth()/getMaxHealth() * 100.0);
		System.out.println("%");
		System.out.printf("Stamina:                 %6.2f / %6.2f | %6.2f", getStamina(), getMaxStamina(), getStamina()/getMaxStamina() * 100.0);
		System.out.println("%");
		System.out.printf("Fullness:                %6.2f / %6.2f | %6.2f", getFullness(), getMaxFullness(), getFullness() / getMaxFullness() * 100.0);
		System.out.println("%");
		System.out.printf("Radiation:               %6.2f / %6.2f | %6.2f", getRadiation(), getMaxRadiation(), 
				getRadiation() / getMaxRadiation() * 100.0);
		System.out.println("%");
		//System.out.printf("Inventory:               %6.2f / %6.2f | %6.2f", getInventoryWeight(), maxInventoryWeight, 
		//		getInventoryWeight() / maxInventoryWeight * 100.0);
		//System.out.println("%");//because % can't go in printf
		
	}

	/**
	 * Returns the player name
	 * @return the players' name
	 */
	public String toString() {
		return getName();
	}

	/**
	 * Returns a string representation of the inventory
	 * @return a string representation of the inventory
	 */
	public String getInventory() {
		sortInventory();
		String string = "";
		int num = 1;
		String watchItem = "";//the item that will be used to process duplicates
		int maxNameLength = 0;
		for(int i = 0; i < getInventoryNumItems(); i++){
			int nameLength = inventory.get(i).getName().length();
			if(nameLength > maxNameLength){//computes the length of the longest name
				maxNameLength = nameLength;
			}
		}
		maxNameLength += 5;//want to have at least 5 spaces between name and (numx) num times
		for (int i = 0; i < getInventoryNumItems(); i++) {
			if(getNumOfItemInInventory(inventory.get(i)) > 1){//There's at least two or more
				if(inventory.get(i).getName().equals(watchItem)){
					//Do nothing
				}else{
					watchItem = inventory.get(i).getName();
					int extraSpace = maxNameLength - inventory.get(i).getName().length();
					int numDigits = ("" + num).length();
					int numDigitsOfNumItems = ("" + getInventoryNumItems()).length();
					int shoulderSpace = 1 + numDigitsOfNumItems - numDigits;
					string += "<" + num + ">" + getWhitespace(shoulderSpace) + inventory.get(i).getName() + getWhitespace(extraSpace) + 
							getNumOfItemInInventory(inventory.get(i)) + "\n";
				}
			}else{
				string += "<" + num + "> " + inventory.get(i).getName() + "\n";
			}
			num++;
		}
		return string;
	}
	
	/**
	 * Returns whitespace for the user
	 * @param amount the amount of whitespace
	 */
	public String getWhitespace(int amount){
		String whitespace = "";
		for(int i = 0; i < amount; i++){
			whitespace += " ";
		}
		return whitespace;
	}
	
	/**
	 * Gets the inventory stats such at as of items, weight, max weight, and percentage
	 */
	public void printInventoryStats(){
		System.out.printf("%d items  %5.2f / %5.2f lbs. %5.2f", getInventoryNumItems(), getInventoryWeight(), maxInventoryWeight, 
				getInventoryWeight() / maxInventoryWeight * 100.0);
		System.out.println("%");
	}

	/**
	 * Sorts the inventory in ascending order
	 */
	public void sortInventory(){
		Collections.sort(inventory, new Stuffs());
	}

	/**
	 * Removes the given object from the inventory
	 * @param objectthe object to be removed
	 */
	public void removeItem(Stuffs object) {
		inventory.remove(object);
	}

	/**
	 * Returns the number items of a particular item in the inventory.<br>
	 * Note that this checks whether the name of the object is the same, not all of the contents of the object.
	 * @param object the object to test
	 * @return the number of items of that item that are in the inventory
	 */
	public int getNumOfItemInInventory(Stuffs object){
		int num = 0;
		for(Stuffs i: inventory){
			if(i.getName().equals(object.getName())){
				num++;
			}
		}
		return num;
	}

	/**
	 * Returns the number of items in the inventory
	 * 
	 * @return the number of items in the inventory
	 */
	public int getInventoryNumItems() {
		return inventory.size();
	}

	/**
	 * Returns information about the chosen item from the inventory
	 * 
	 * @param i
	 *            the item location in the inventory
	 * @return the attributes of the given item
	 */
	public String getAttributesOnItem(int i) {
		int item = i - 1;
		if (item < getInventoryNumItems() && item >= 0) {
			return inventory.get(item).getAttributes();
		} else {
			return "There is no such item in the inventory at location " + i + "!";
		}
	}

	/**
	 * @return the currentRoom
	 */
	public Room getCurrentRoom() {
		return currentRoom;
	}

	/**
	 * @param currentRoom the currentRoom to set
	 */
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
}

/**
 * A simple version 
 * @author CA
 * @version 6/12/14
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.InterruptedException;

public class PlayerTester {
	public static void main (String[]args){
		/*
		 * Ideas from thinking if this was to go big with the player having some 100 different attributes(remember that this current setup the player has 4 attributes)
		 * 6/12/14 - We would create an interface for editable attributes and an item would send an array of attribute objects that it affects
		 * Just an idea....
		 */

		Scanner scanner = new Scanner(System.in);
		try {
			Player bob = new Player("Mic McCansily", "A former peasant worker from Bosnicia, came here to strike it rich.");
			bob.setMaxHealth(50);
			bob.setMaxFullness(50);
			bob.setMaxRadiation(50);
			bob.setMaxStamina(50);
			bob.setHealth(50);
			bob.setFullness(50);// radiation default set to 0
			bob.setRadiation(0);
			bob.setStamina(50);
			bob.setInventoryMaxWeight(50);
			bob.setAmountMana(10000);
			bob.setAmountGold(10000);
			//bob.setStoreExchangeRate(.25);
			//Setting up the room things
			ArrayList<Enemy> enemies = new ArrayList<Enemy>();
			//enemies.add(new Enemy("Mage", "A powerful magician!", 5, 5, 5, 5, 2, 2, -2, 2));
			enemies.add(new Enemy("Demon", "A dark creature from the deep!", 24, 3, 0, 2, 13, 14, -14, 12));
			enemies.add(new Enemy("Skeleton", "Not physically possible, but who cares!", 13, 5, 0, 3, 34, 35, -14, 14));
			enemies.add(new Enemy("Werewolf", "Half Man, half wolf, half idiot.", 15, 5, 2, 5, 18, 12, -13, 11));
			//enemies.add(new Enemy("Boogey Man", "Who's been hiding under your bed?", 6, 5, 5, 5, 16, 4, -4, 4));
			
			//Setting up the chests
			ArrayList<Chest> chests = new ArrayList<Chest>();
			chests.add(new Chest("Old Chest", new Stuffs[] {
					new Stuffs("Old Bottle", "It's dusty.", 2, 4, 5),
					new Weapon("Electro Taser", "This hasn't been invented yet.", 3, 50, 55, 0, 0, 0, 0, -15, -10, 10, 3, 0),
					new Stuffs("Science Book", "EMC Squared!", 6, 15, 15)
			}));
			
			chests.add(new Chest("Magic Sack", new Stuffs[] {
					new Edible("Holy Bread", "A gift, use it wisely", 2, 100, 300, 100, 100, -100, 100),
					new SpecialItem("Magic Banana", "Tasty!", 2, 400, 344, 100, 100, -100, 100, 50, 50, 50, 50, 50)
			}));
			
			chests.add(new Chest("Old Cart", new Stuffs[] {
					new Weapon("Old Sword", "An old sword", 10, 35 ,35, 0, 0, 0, 0, -2, 0, 0, 50, 0),
					new Armor("Old Armor", "Old Armor", 15, 35, 35, 0, 0, 0, 0, 0, 0, 0, 50, 0, .1, .1, .1, .1)
			}));
			
			bob.setCurrentRoom(new Room("Jukinon", enemies, chests));
			//bob.forceItem(new SpecialItem("Magic Apple", "Magic.", 5, 0, 0, 25, 25, -25, 25, 25, 25, 25, 25, 1000));
			//Author Version and Changlog info here:
			/*
			System.out.println("Corbans Adventure Game\nCopyright Corban Anderson 2/15/14\nVersion 0.3.6");
			System.out.println("Changelog:\n-Made Player Attributes Cleaner\n-Added Store News");
			System.out.println("--Addeed \"No News Today\"\n--Added item out of stock");
			System.out.println("--Added item back in stock\n--Added sales on items\n-Added \"You saved\" message if bought on sale\n-Made inventory cleaner");
			System.out.println("-Added random add of pocket lint\n-Added more items to the store\n-Removed Crap Sword from the store");
			System.out.println("-Edible and Special Items can now be used and affect the player health, etc.\n-Added Menu\n-Added Changelog\n");
			try {
				Thread.sleep(00);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			System.out.println("Hello, and welcome to Jukinon, a fairly small town just outside of Hunison.\n"
					+ "But, before we continue, I didn't catch your name.");

			boolean userLikeName;
			;
			String name = "";
			String userInput = "";
			do {
				System.out.print("What would you like to be called?: ");
				name = scanner.next();
				System.out.println("Is " + name + " right? (y/n)");
				userInput = scanner.next();
				if (userInput.equals("y") || userInput.equals("Y")) {
					userLikeName = true;
				} else {
					userLikeName = false;
				}
			} while (!userLikeName);

			bob.setName(name + " the Great");// User Name is Set!

			System.out.println("Okay, " + bob.getName() + ", how would you like to describe yourself?");
			 
			 boolean userLikeDes; String des = "";
			 
			 do{ System.out.print("Describe yourself:"); des = scanner.nextLine();
			 System.out.println("How's this:\n\"" + des + "\"\nIs that good? (y/n)"); userInput = scanner.next();
			 if(userInput.equals("y") || userInput.equals("Y")){ userLikeDes = true; }else{ userLikeDes= false; }
			 }while(!userLikeDes);
			 
			 bob.setDescription(des);//User Description is set!
			 System.out.println("\nOkay, we are now ready, here are some attributes about you:\n");
			 bob.getAttributes();
			 System.out.println("\nHow to read the table:\n(health) / (max health) | (percentage)");
			 System.out.println("Try to keep Health, Stamina, and Fullness as high as possible.");
			 System.out.println("Radiation is the only one that is different, make sure to keep it as low as possible.");
			 System.out.println("Your max stats(max health, etc.) are really quite low, open your inventory and eat the holy bread.");
			 bob.forceItem(new SpecialItem("Holy Bread", "Blessed by a priest in Asia.", 5, 0, 0, 450, 400, -400, 400, 45, 45, 45, 45, 20));
			 
			 boolean userStillUsingTest = true;
			 do{
				 userStillUsingTest = !bob.useItem();
				 if(bob.getInventoryNumItems() == 1){
					 userStillUsingTest = true;
				 }
			 }while(userStillUsingTest);
			 
			 System.out.println("Now look at your stats, the holy bread has made you strong.");
			 bob.getAttributes();
			 
			 System.out.println("\n\nNow you still need something to fight with, here is a dagger that will hold you over for now.");
			 bob.forceItem(new Weapon("Old Dagger", "Not much to brag about, but it will work", 3, 0, 0, 0, 0, 0, 0, -2,-2, 0, 50, 0));
			 //bob.forceItem(new Weapon("Shovel", "Not much to brag about, but it will work", 3, 0, 0, 0, 0, 0, 0, -2,-2, 0, 50, 0));
			 System.out.println("\n\nHere is your Inventory:");
			 bob.printInventoryStats();
			 System.out.println(bob.getInventory());
			 
			 try {
				 Thread.sleep(1000);
			 } catch (InterruptedException ex) {
				 Thread.currentThread().interrupt();
			 }
			 
			 System.out.println("\n\nI'll also give you some food to start you on your way.");
			 bob.forceItem(new Edible("Fresh Apple", "Keeps the doctor away!", 1, 0, 0, 3, 1, 0, 3));
			 bob.forceItem(new Edible("Dried Scumwackle", "Hold you nose, and drink lots of water after.", 2, 0, 0, 6, 5, -5, 5));
			 bob.forceItem(new Edible("Cooked Dog", "Hey, has anyone seen Rosie?", 2, 0, 0, 7, 3, -1, 4));
			 bob.forceItem(new Edible("Water Canteen", "It holds water", 2, 0, 0, 0, 2, 0, 0));
			 
			 System.out.println("\nHere is your Inventory:");
			 bob.printInventoryStats();
			 System.out.println(bob.getInventory());
			 
			 System.out.println("\n\nHeres some armor to protect you.");
			 bob.forceItem(new Armor("Old Stone Armor", "This is armor!?", 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 500, 125, .15, .02, 0, .03));
			 
			 try {
				 Thread.sleep(1000);
			 } catch (InterruptedException ex) {
				 Thread.currentThread().interrupt();
			 }
			 
			 System.out.println("\nHere is your Inventory:");
			 bob.printInventoryStats();
			 System.out.println(bob.getInventory());
			 
			 System.out.println("\nBefore we begin you should check out the store."); */
			//bob.forceItem(new SpecialItem("Holy Bread", "Blessed by a priest in Asia.", 5, 0, 0, 450, 400, -400, 400, 45, 45, 45, 45, 20));
			//bob.forceItem(new Weapon("Old Dagger", "Not much to brag about, but it will work", 3, 0, 0, 0, 0, 0, 0, -2,-2, 0, 50, 0));
			//	bob.forceItem(new Edible("Fresh Apple", "Keeps the doctor away!", 1, 0, 0, 3, 1, 0, 3));
			// bob.forceItem(new Edible("Dried Scumwackle", "Hold you nose, and drink lots of water after.", 2, 0, 0, 6, 5, -5, 5));
			// bob.forceItem(new Edible("Cooked Dog", "Hey, has anyone seen Rosie?", 2, 0, 0, 7, 3, -1, 4));
			// bob.forceItem(new Edible("Water Canteen", "It holds water", 2, 0, 0, 0, 2, 0, 0));
			//bob.forceItem(new Armor("Old Stone Armor", "This is armor!?", 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 500, 125, .15, .02, 0, .03));
			//bob.forceItem(new Weapon("Old Dagger", "Not much to brag about, but it will work", 3, 0, 0, 0, 0, 0, 0, -2,-2, 0, 50, 20));
			//bob.forceItem(new Armor("Old Stone Armor", "This is armor!?", 5, 0, 0, 0, 0, 0, 0, 0, 0, 0,  50, 4, .15, .02, 0, .03));
			//bob.forceItem(new Weapon("Custom Sword", "<<<>>>", 0, 0, 0, 5, 4, -3, 4, -5, -5, 5, -5, 50));
			//bob.forceItem(new Armor("Custom Armor", "<<<>>>", 0, 0, 0, 3, 4, -5, 6, -3, -4, 5, 50, 0, .3, .4, .2, .3));
			 try {
				 Thread.sleep(1000);
			 } catch (InterruptedException ex) {
				 Thread.currentThread().interrupt();
			 }
			 boolean userStillOnMainMenu = true;
			 System.out.println("\nYour Attributes:");
			 bob.getAttributes();
			 System.out.println("\nInventory:");
			 bob.printInventoryStats();
			 System.out.println(bob.getInventory());
			 do{
				 System.out.println("\nWhat would you like to do?\n<1> Buy an item\n<2> Sell an item\n<3> Use Item\n" + 
						 "<4> Observe an Item\n<5> Observe the Room\n<6> Leave Game");
				 String menuWhatToDo = scanner.next();
				 if(menuWhatToDo.equals("1")){
					 boolean userWantToLeave;
					 do {
						 userWantToLeave = bob.openStore();

					 } while (!userWantToLeave);
					 userStillOnMainMenu = true;
				 }else if(menuWhatToDo.equals("2")){
					 boolean userWantToGo;
					 do {
						 userWantToGo = bob.sellItem();

					 } while (!userWantToGo);
					 userStillOnMainMenu = true; 
				 }else if(menuWhatToDo.equals("3")){
					 boolean userStillUsing = true;
					 do{
						 userStillUsing = !bob.useItem();
					 }while(userStillUsing);
				 }else if(menuWhatToDo.equals("4")){
					 bob.observeItem();
				 }else if(menuWhatToDo.equals("5")){
					 bob.observeRoom();
				 }else if(menuWhatToDo.equals("6")){
					 System.out.println("<<FILE NOT SAVED>>\n\nGoodbye.");
					 System.exit(0);
					 userStillOnMainMenu = false;
				 }else if(menuWhatToDo.equals("7")){
					 System.out.println("\nLet's begin your quest!");
					 //beginQuest();
				 }else{
					 System.out.println("I do not understand");
					 userStillOnMainMenu = true;
				 }	
				 System.out.println("\nYour Attributes:");
				 bob.getAttributes();
				 System.out.println("\nInventory:");
				 bob.printInventoryStats();
				 System.out.println(bob.getInventory());
				 
			 }while(userStillOnMainMenu);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}

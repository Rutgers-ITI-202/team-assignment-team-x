package adventure;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Keith, Kevin, Spencer
 * @version 1.0
 * @since 1.0
 *  <h1> Adventurer <h1>
 *  <p>Contains the methods that the player will use to interact with the world around them.</p>
 */
<<<<<<< HEAD
public class Adventurer {

    // Initialise new ArrayList for inventory.
    static ArrayList < Things > inven = new ArrayList < Things > ();
    static Scanner scan = new Scanner(System.in);

    public ArrayList < Things > getInventory() {
        /**
         * @since 1.0
         * <h1> getInventory </h1>
         * <p>Prints out contents of inventory so the user can interact with the items in it.</p>
         * @return     contents of inventory
         */
        return inven;

    }
=======
public class Adventurer 
{
	static ArrayList<AdventureObject> inven = new ArrayList<AdventureObject>();
	static Scanner scan = new Scanner(System.in);

	
	public ArrayList<AdventureObject> getInventory() //this prints out the content of the players inventory
	{
		/**
		 * @since 1.0
		 * <h1> description </h1>
		 * This method prints out what is in the players invetory so the user can interact wtih the items in it
		 */
       return inven;
        
	}
	
	public void take(AdventureObject toTake) //this adds an item into the inventory
	{
		/**
		 * @since 1.0
		 * @param this method is sent a Adventureobject so it can be added to the inventory arrayList
		 */
		inven.add(toTake);
		System.out.println("the "+toTake.getName()+" has been added to your inventory");
		
	}
	
	public void drop(AdventureObject toDrop) //this removes an item from the players inventory
	{
		/**
		 * @since 1.0
		 * @param this method is sent a Thing object so it can be removed from the players inventory
		 */
		String currentName="";
		for(int i=0; i<inven.size();i++)
        {
        	currentName=inven.get(i).getName();
        	if(currentName.equals(toDrop.getName()))
        	{
        		System.out.println(toDrop.getName()+" has been removed from your inventory");
        		inven.remove(i);
        		break;
        	}
        }
		
		
		
	}
>>>>>>> origin/master

    public void take(Things x) {
        /**
         * @since 1.0
         * <h1> take </h1>
         * <p>Add items to the inventory.</p>
         * @param       sent the object Thing so it can be added to the inventory arrayList
         */
    	
        inven.add(x);
        System.out.println("The " + x.getName() + " has been added to your inventory.");

    }

    public void drop(Things x) {
        /**
         * @since 1.0
         * <h1> drop </h1>
         * <p>Remove items from the inventory.</p>
         * @param       sent the object Thing so it can be removed from the inventory arrayList
         */
    	
    	// Initialise name of item.
        String currentName = "";
        for (int i = 0; i < inven.size(); i++) {
        	
        	// Get the name of the item to be dropped.
            currentName = inven.get(i).getName();
            
            // Check if the name of the item to be dropped is the entered name...
            if (currentName.equals(x.getName())) {
            	
            	// ...if so, give the player a confirmation that it has been removed.
                System.out.println("The " + x.getName() + " has been removed from your inventory.");
                
                // Remove the item from the inventory.
                inven.remove(i);
                break;
            }
        }
    }
}
package adventure;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Keith, Kevin, Spencer
 * @version 1.0
 * @since 1.0
 *  <h1> Description <h1>
 *  This class contains the methods that the player will use to interact with the world around them
 */
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


}
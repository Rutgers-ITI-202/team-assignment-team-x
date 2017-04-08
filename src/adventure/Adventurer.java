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
	static ArrayList<Things> inven = new ArrayList<Things>();
	static Scanner scan = new Scanner(System.in);
	
	public void north() // Walk north
	{
		/**
		 * @since 1.0
		 *  <h1> Description <h1>
		 *  moves the player north
		 */
		System.out.println("you walk north");
		
	}

	public void east() //Walk East
	{
		/**
		 * @since 1.0
		 *  <h1> Description <h1>
		 *  moves the player east
		 */
		System.out.println("you walk east");
		 
	}

	public void south() //Walk South
	{
		/**
		 * @since 1.0
		 *  <h1> Description <h1>
		 *  moves the player south
		 */
		System.out.println("you walk south");
		
	}
	
	public void west() //Walk West
	{
		/**
		 * @since 1.0
		 *  <h1> Description <h1>
		 *  moves the player west
		 */
		System.out.println("you walk west");
		
	}
	
	public void Inventory() //this prints out the content of the players inventory
	{
		/**
		 * @since 1.0
		 * <h1> description </h1>
		 * This method prints out what is in the players invetory so the user can interact wtih the items in it
		 */
        for(int x=0; x<inven.size();x++)
        {
        	System.out.println(inven.get(x).name);
        }
        
	}
	public void take(Things x) //this adds an item into the inventory
	{
		/**
		 * @since 1.0
		 * @param this method is sent a thing object so it can be added to the inventory arrayList
		 */
		inven.add(x);
		System.out.println(x.name+" has been added to your inventory");
		
	}
	
	public void drop(Things x) //this removes an item from the players inventory
	{
		/**
		 * @since
		 * @param this method is sent a Thing object so it can be removed from the players inventory
		 */
		String currentName="";
		for(int i=0; i<inven.size();i++)
        {
        	currentName=inven.get(i).name;
        	if(currentName.equals(x.name))
        	{
        		inven.remove(i);
        		break;
        	}
        }
		
		
		
	}


}
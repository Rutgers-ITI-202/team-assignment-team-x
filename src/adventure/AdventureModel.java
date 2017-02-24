/*
This class:
•	Creates the Rooms, the Things, and the Adventurer.
•	Connects the Rooms with "paths" to other Rooms.
•	Places Things in the Rooms.
•	Places the Adventurer in some Room.
•	Accepts commands from the player, and executes them.
	o	As commands are entered, they should be copied to the main text area.
	o	The method that executes commands should return a String to be displayed in the main text area.
*/

package adventure;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Keith, Kevin, Spencer
 * @version 1.0
 * @since 1.0
 * <h1> This the main logic class of the adventure text Project</h1>
 *  This class contains the command method and item interaction methods for the text adventure project
 */
public class AdventureModel
{
	static Scanner scan = new Scanner(System.in);
	static Adventurer player = new Adventurer();
	
	
		static ArrayList<Things> firstRoomContents=  new ArrayList<Things>();	
		static Things flashlight = new Things("a regular looking flashlight ", "the room lights up","flashlight");			// Instantiated Items
		static Things desk = new Things("an old oak desk that has clearly been used", "you riffle through the drawers but find nothing of interest","desk");
		static Things note = new Things("a note on clean new paper it looks like it was just written the ink is still wet in some areas","the note reads: \n Hello John you are probably wondering why your room has been ransacked come down to the kitchen for answers","note");
		
		public static void itemAdder()		// Add Items to room
		{
			/**
			 * @since 1.0
			 *  <h1> Description <h1>
			 * This method adds item to the arraylists that are sent to the room constructor
			 */
			firstRoomContents.add(flashlight);
			firstRoomContents.add(desk);
			firstRoomContents.add(note);
		}
		
		static Rooms startRoom = new Rooms("bedroom", "You wake up in your bedroom. It is usually dark, and your lights are flickering."
				+ " It looks as though someone has ransacked your bedroom. "
				+ "You look for your phone, but along with the rest of your things, it is missing. The only thing you see is a flashlight on your desk. "
				+ "On top of your nightstand there is a note…", firstRoomContents);
	
	
	//this creates the first room
	
	static int currentRoom=1;// sets the current room the first room is room number one used in roomDescription to print the correct description of the current room
	
	public static void roomDescription()//prints out a description of the room
	{
		/**
		 * @since 1.0
		 *  <h1> Description <h1>
		 * this will print out the description for the room that you are in and uses the currentRoom variable to keep track
		 */
		
		if(currentRoom==1)
		{
			System.out.println(startRoom.description);
		}
	}
	public static void command() //asks the player for input
	{
		/**
		 * @since 1.0
		 *  <h1> Description <h1>
		 * this is the main command method for the program
		 * this method asks the user what they would like to do and then using a switch statement sends calls the correct method
		 */
		String in="";
         System.out.println("what would you like to do: look, take, use, or drop or go in a cardinal direction"); 
		  in = scan.nextLine();
		  in=in.toLowerCase();
		  switch(in)//goes through the options
		  {
		  	case "look":				// Applies methods based on user input
		  		look();
		  		break;
		  	case "take":
		  		take();
		  		break;
		  	case "use":
		  		use();
		  		break;
		  	case "drop":
		  		drop();
		  		break;
		  	case "go south":
		  		player.south();
		  		break;
		  	case "go north":
		  		player.north();
		  		break;
		  	case "go east":
		  		player.east();
		  		break;
		  	case "go west":
		  		player.west();
		  		break;
		  }
	  
	}
	public static void look()// looks at an item or a room depending on the players choice
	{
		/**\
		 * @since 1.0
		 *  <h1> Description <h1>
		 * this method calls the methods and variables that describe items or rooms to users
		 * 
		 */
		String in="";
		System.out.println("what would you like to look at an item or the room");
		in= scan.nextLine();
		
		
		if(in.equalsIgnoreCase("item"))						//Look method for items and room
		{
			System.out.println("which item: ");
			player.Inventory();
			in=scan.nextLine();
			 if(in.equalsIgnoreCase("flashlight"))
    		 {
    		  System.out.println(flashlight.description);
    		 }
    	  if(in.equalsIgnoreCase("desk"))
    	  {
    		  System.out.println(desk.description);
    	  }
    	  if(in.equalsIgnoreCase("note"))
    	  {
    		  System.out.println(note.description);
    	  }
			
		}
		if(in.equalsIgnoreCase("room"))
		{
			roomDescription();
		}
		command();
		
	}
	public static void take()			// Add items to inventory
	{
		/**
		 * @since 1.0
		 *  <h1> Description <h1>
		 * this method asks the user what item they want to pick up and then calls the take method in the player class to add the item to the players inventory
		 */
		String in="";
		  System.out.println("which item");
    	  in=scan.nextLine();
    	  if(in.equalsIgnoreCase("flashlight"))
    		 {
    		  player.take(flashlight);
    		 }
    	  if(in.equalsIgnoreCase("desk"))
    	  {
    		  System.out.println("this item cannot be picked up");
    	  }
    	  if(in.equalsIgnoreCase("note"))
    	  {
    		  player.take(note);
    	  }
    	  command();
	}
	public static void use()				// Use method for items
	{
		/**
		 * @since 1.0
		 *  <h1> Description <h1>
		 * this method calls the use methods from the Things class to tell the user what using an object does
		 */
	  String in="";
	  System.out.println("which item");
	  in=scan.nextLine();
	  if(in.equalsIgnoreCase("flashlight"))
   		 {
   		  flashlight.use();
   		 }
   	  if(in.equalsIgnoreCase("desk"))
   	  {
   		  desk.use();
   	  }
   	  if(in.equalsIgnoreCase("note"))
   	  {
   		  note.use();
   	  }
   	  command();
	}
	
	public static void drop()			// Drop items from inventory
	{
		/**
		 * @since 1.0
		 * <h1> Description </h1>
		 * This method asks which item the user would like to drop and then uses that input to send the correct item to the adventurer drop method so it can be removed from the inventory array
		 */
		String in="";
		System.out.println("which item");
  	  in=scan.nextLine();
  	  if(in.equalsIgnoreCase("flashlight"))
  	   {
  		  player.drop(flashlight);
  	   }
  	  if(in.equalsIgnoreCase("note"))
  	  {
  		  player.drop(note);
  	  }
  	  command();
	}
	 
		  
	      
	
	
	
	 
	
	
}

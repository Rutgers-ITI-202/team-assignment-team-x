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

//package adventure;

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
		static int [][] map= new int [3][3];
	
	
		static ArrayList<Things> cheeksCageContents = new ArrayList<Things>();
		static ArrayList<Things> rabbitCageContents = new ArrayList<Things>();
		static ArrayList<Things> catCageContents = new ArrayList<Things>();
		static ArrayList<Things> puppyCrateContents = new ArrayList<Things>();
		static ArrayList<Things> turtleCageContents = new ArrayList<Things>();
		static ArrayList<Things> mouseCageContents = new ArrayList<Things>();
		static ArrayList<Things> ratCageContents = new ArrayList<Things>();
		static ArrayList<Things> guineaPigContents = new ArrayList<Things>();
		static ArrayList<Things> snakeCageContents = new ArrayList<Things>();
		static ArrayList<Things> checkoutCounterContents = new ArrayList<Things>();
		static ArrayList<Things> allThings = new ArrayList<Things>();
		
		static Things invoice = new Things("a receipt with some info on it","          ","invoice");
		static Things trainquilizer = new Things("can knock someone out","              ","tranquilizer");
		static Things toothpick = new Things("pointy, could be used to fight","           ","toothpick");
		static Things key = new Things("a regular key, could be used to open something up","            ","key");
		static Things posion= new Things("a small pill that has a skull and crossbones and a rat","           ","posion");
		static Things treat = new Things("doesn't look appetizing, maybe a dog would like it","          ","treat");
		static Things boxCutter = new Things("sharp a little unweidly could be used to fight","            ","box cutter");
		static Things laserPointer = new Things("shines a bright red light wherever it is pointer","           ","laser pointer");
		static Things plasticBag = new Things("could be used to hold items","          ","a plastic bag");
		static Things animalFood = new Things("food for common animals","         ","animal food");
		static Things water = new Things("regular old water in a bottle","              ","water");
		static Things shinyObject = new Things("a shiny object ooohhhhhh","             ","shiny object");
		static Things animalDroppings = new Things("gross","","animal droppings");
		static Things chewedGum = new Things("chewed up gum, sticky","              ","chewed gum");
		
		
		
		public void itemAdder()		// Add Items to room
		{
			/**
			 * @since 1.0
			 *  <h1> Description <h1>
			 * This method adds item to the arrayLists that are sent to the room constructor
			 */			
			cheeksCageContents.add(laserPointer);
			cheeksCageContents.add(toothpick);
			cheeksCageContents.add(invoice);
			rabbitCageContents.add(plasticBag);
			catCageContents.add(treat);
			catCageContents.add(trainquilizer);
			puppyCrateContents.add(key);
			turtleCageContents.add(posion);
			turtleCageContents.add(trainquilizer);
			mouseCageContents.add(treat);
			ratCageContents.add(boxCutter);	
			guineaPigContents.add(plasticBag);
			snakeCageContents.add(toothpick);
			
			allThings.add(invoice);
			allThings.add(trainquilizer);
			allThings.add(toothpick);
			allThings.add(key);
			allThings.add(posion);
			allThings.add(treat);
			allThings.add(boxCutter);
			allThings.add(laserPointer);
			allThings.add(plasticBag);
			allThings.add(animalFood);
			allThings.add(water);
			allThings.add(shinyObject);
			allThings.add(animalDroppings);
			allThings.add(chewedGum);
		}
		
		//give rooms numbers 
		//create map of rooms
		static Rooms cheeksCage = new Rooms("Cheek's Cage", "a regular hamster cage", cheeksCageContents);
		static Rooms rabbitCage = new Rooms("Rabbit Cage", "a large cage with a rabbit in it",rabbitCageContents);
		static Rooms catCage = new Rooms("Cat's cage","a large crate with a cat in it", catCageContents);
		static Rooms puppyCrate = new Rooms("Puppy's Crate","a large crate with a small puppy in it", puppyCrateContents);
		static Rooms turtleCage = new Rooms("Turtle's Cage", "a small cage with a little pond and a turtle", turtleCageContents);
		static Rooms mouseCage = new Rooms ("Mouse's Cage", "a small cage with some mice in it",mouseCageContents);
		static Rooms ratCage = new Rooms ("Rat's cage","a small cage with some large rats in it", ratCageContents);
		static Rooms guineaPig = new Rooms ("Guinea Pig's cage","a cage with a large guinea pig in it", guineaPigContents);
		static Rooms snakeCage = new Rooms("Snake's cage","a cage with a large snake in it", snakeCageContents);
		static Rooms checkoutCounter = new Rooms("Checkout Counter", "a regular old checkout counter",checkoutCounterContents);
		
		
		static Adventurer cheeks= new Adventurer();
		
	
	
	static public void movement(String direction)
		{
			if(direction.equalsIgnoreCase("start"))
			{
				for(int x=0; x<map.length;x++ )
				{
					for(int y=0; y<map[0].length; y++)
					{
						if(x==0 && y==0)
						{
							map[x][y]=0;
						}
						else
						{
							map[x][y]=1;
						}
					}
				}
			}
			
			if(direction.equalsIgnoreCase("north"))
			{
				for(int x=0; x<map.length;x++ )
				{
					for(int y=0; y<map[0].length; y++)
					{
						if(map[x][y]==0 && x !=0)
						{
							map[x][y]=1;
							map[x+1][y]=0;
						}
					}
				}
			}
			
			if(direction.equalsIgnoreCase("east"))
			{
				for(int x=0; x<map.length;x++ )
				{
					for(int y=0; y<map[0].length; y++)
					{
						if(map[x][y]==0 && y !=map[0].length)
						{
							map[x][y]=1;
							map[x][y+1]=0;
						}
					}
				}
			}
			
			if(direction.equalsIgnoreCase("west"))
			{
				for(int x=0; x<map.length;x++ )
				{
					for(int y=0; y<map[0].length; y++)
					{
						if(map[x][y]==0 && y != 0)
						{
							map[x][y]=1;
							map[x][y-1]=0;
						}
					}
				}
			}
			
			if(direction.equalsIgnoreCase("south"))
			{
				for(int x=0; x<map.length;x++ )
				{
					for(int y=0; y<map[0].length; y++)
					{
						if(map[x+1][y]==0 && y !=map.length)
						{
							map[x][y]=1;
							map[x-1][y]=0;
						}
					}
				}
			}
		}
	

	
	public void command() //asks the player for input
	{
		/**
		 * @since 1.0
		 *  <h1> Description <h1>
		 * this is the main command method for the program
		 * this method asks the user what they would like to do and then using a switch statement sends calls the correct method
		 */
		String in="";
         System.out.println("what would you like to do: inspect an item, take an item, use an item , or drop an item or go in a cardinal direction"); 
		  in = takeString();
		  in=in.toLowerCase();
		  switch(in)//goes through the options
		  {
		  	case "look":
		  		System.out.println("at what \ntype room to look at the room that you are in");
		  		in=takeString();
		  		//use look method here
		  		break;
		  	case "take":
		  		System.out.println("take what");
		  		in=takeString();
		  		cheeks.take(itemLookup(in));
		  		break;
		  	case "use":
		  		System.out.println("what item");
		  		in=takeString();
		  		use(itemLookup(in));
		  		break;
		  	case "drop":
		  		System.out.println("drop what");
		  		in=takeString();
		  		cheeks.drop(itemLookup(in));
		  		break;
		  	case "go south":
		  		movement("south");
		  		break;
		  	case "go north":
		  		movement("north");
		  		break;
		  	case "go east":
		  		movement("east");
		  		break;
		  	case "go west":
		  		movement("west");
		  		break;
		  }
	  
	}
	
	
	
	

	
	
	static private int takeNumber()
	{
		/**
		 * @since 1.0
		 * @return returns the number that the user inputs
		 * <h1> description <h1>
		 * This method attempts to take in a number from the user if there is a problem with the input the error is caught and the user is asked to input again
		 */
		int in;
		while(true)
		{
			try
			{
				in=scan.nextInt();
			}
			catch(Exception e)
			{
				scan.next();
				System.out.println("bad input try again");
				continue;
			}
			return in;
		}
		
	
	}
	
	static private String takeString()
	{
		/**
		 * @since
		 * <h1> description <h1>
		 * this method attempts to take in a string from the user if there is something wrong with the input the user is asked again
		 */
		scan.nextLine();
		String in;
		while(true)
		{
			try
			{
				in=scan.nextLine();
			}
			catch(Exception e)
			{
				scan.next();
				System.out.println("bad input try again");
				continue;
			}
			return in;
		}
		
	}
	 
	static private Things itemLookup(String in)
	{
		for(int x=0; x<allThings.size(); x++)
		{
			if(allThings.get(x).getName()==in)
			{
				return allThings.get(x);
			}
		}
		return null;
		
	}
	static private Rooms roomLookup()
	{
		for(int x=0; x<map.length; x++)
		{
			for(int y=0; y<map[0].length; y++)
			{
				if(map[x][y]==0)
				{
					//use if statements to check what room and return that room
				}
			}
		}
	}
}
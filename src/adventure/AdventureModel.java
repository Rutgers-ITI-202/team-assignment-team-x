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
		public static int [][] map= new int [3][3];
	
		public int [][] getMap()
		{
			return map;
		}
	
		
		
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
		
		
		static ArrayList<Things> allThings = new ArrayList <Things>();
		//give rooms numbers 
		//create map of rooms
		static Rooms cheeksCage = new Rooms("Cheek's Cage", "a regular hamster cage");
		static Rooms rabbitCage = new Rooms("Rabbit Cage", "a large cage with a rabbit in it");
		static Rooms catCage = new Rooms("Cat's cage","a large crate with a cat in it");
		static Rooms puppyCrate = new Rooms("Puppy's Crate","a large crate with a small puppy in it");
		static Rooms turtleCage = new Rooms("Turtle's Cage", "a small cage with a little pond and a turtle");
		static Rooms mouseCage = new Rooms ("Mouse's Cage", "a small cage with some mice in it");
		static Rooms ratCage = new Rooms ("Rat's cage","a small cage with some large rats in it");
		static Rooms guineaPigCage = new Rooms ("Guinea Pig's cage","a cage with a large guinea pig in it");
		static Rooms snakeCage = new Rooms("Snake's cage","a cage with a large snake in it");
		static Rooms checkoutCounter = new Rooms("Checkout Counter", "a regular old checkout counter");
		
		static Adventurer cheeks= new Adventurer();
	
		public void itemAdd()
		{
			cheeksCage.getContents().add(laserPointer);
			cheeksCage.getContents().add(invoice);
			cheeksCage.getContents().add(toothpick);
			rabbitCage.getContents().add(plasticBag);
			catCage.getContents().add(trainquilizer);
			catCage.getContents().add(treat);
			puppyCrate.getContents().add(key);
			turtleCage.getContents().add(posion);
			turtleCage.getContents().add(trainquilizer);
			mouseCage.getContents().add(treat);
			ratCage.getContents().add(boxCutter);
			guineaPigCage.getContents().add(plasticBag);
			snakeCage.getContents().add(toothpick);
			
			allThings.add(laserPointer);
			allThings.add(invoice);
			allThings.add(toothpick);
			allThings.add(plasticBag);
			allThings.add(trainquilizer);
			allThings.add(treat);
			allThings.add(key);
			allThings.add(posion);
			allThings.add(boxCutter);
			allThings.add(water);
			allThings.add(shinyObject);
			allThings.add(animalDroppings);
			allThings.add(chewedGum);
			allThings.add(animalFood);
		}
	
	static public boolean movement(String direction)
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
				return false;
			}
			
			if(direction.equalsIgnoreCase("north"))
			{
				for(int x=0; x<3;x++ )
				{
					for(int y=0; y<3; y++)
					{
						if(map[x][y]==0 && x-1 != -1)
						{
							
							map[x][y]=1;
							map[x-1][y]=0;
							return true;
						}
					}
				}
				return false;
			}
			
			if(direction.equalsIgnoreCase("east"))
			{
				for(int x=0; x<3;x++ )
				{
					for(int y=0; y<3; y++)
					{
						if(map[x][y]==0 && y+1 != 3)
						{
							
							map[x][y]=1;
							map[x][y+1]=0;
							return true;
						}
					}
				}
				return false;
			}
			
			if(direction.equalsIgnoreCase("west"))
			{
				for(int x=0; x<3;x++ )
				{
					for(int y=0; y<3; y++)
					{
						if(map[x][y]==0 && y != 0)
						{
							
							map[x][y]=1;
							map[x][y-1]=0;
							return true;
						}
					}
				}
				return false;
			}
			
			if(direction.equalsIgnoreCase("south"))
			{
				
				for(int x=0; x<3;x++ )
				{
					for(int y=0; y<3; y++)
					{
						if(map[x][y]==0 && x+1 !=3)
						{
							map[x][y]=1;
							map[x+1][y]=0;
							return true;
						}
					}
				}
				return false;
			}
			return false;
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
          System.out.println("what would you like to do: inspect an item, take an item, use an item , drop an item, look around,  or go in a cardinal direction"); 
		  in = takeString();
		  in=in.toLowerCase();
		  while(checkInput(in)==false)
		  {
				 System.out.println("bad input\nplease type in one of the follow \"take\",\"use\",\"drop\",\"inspect\",\"go north\",\"go east\",\"go south\", \"go west\", \"look around\" ");
				 in=takeString();
		  }
		  
		  switch(in)//goes through the options
		  {
		  	case "look around":
		  		System.out.println(roomLookup().inspect());
		  		break;
		  	case "inspect":
		  		System.out.println("which item");
		  		in=takeString();
		  		itemLookup(in).inspect();
		  		break;
		  	case "take":
		  		System.out.println("take what");
		  		in=takeString();
		  		cheeks.take(itemLookup(in));
		  		break;
		  	case "use":
		  		System.out.println("what item");
		  		in=takeString();
		  		itemLookup(in).whenUsed();
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
	
	
	static private boolean checkInput(String in)
	{
		
		switch(in)
		{
		case "inspect":
			return true;
		case "use":
			return true;
		case "drop":
			return true;
		case "take":
			return true;
		case "go north":
			return true;
		case "go east":
			return true;
		case "go south":
			return true;
		case "go west":
			return true;
		case "look around":
			return true;
		}
		return false;

	
	}
	

	
	

	
	static private String takeString()
	{
		/**
		 * @since
		 * <h1> description <h1>
		 * this method attempts to take in a string from the user if there is something wrong with the input the user is asked again
		 */
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
			if(in.equals(allThings.get(x).getName()))
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
					if(x==0 && y==0)
					{
						
						return cheeksCage;
					}
					if(x==0 && y==1)
					{
						return rabbitCage;
					}
					if(x==0 && y==2)
					{
						return catCage;
					}
					if(x==1 && y==0)
					{
						return puppyCrate;
					}
					if(x==1 && y==1)
					{
						return turtleCage;
					}
					if(x==1 && y==2)
					{
						return mouseCage;
					}
					if(x==2 && y==0)
					{
						return ratCage;
					}
					if(x==2 && y==1)
					{
						return guineaPigCage;
					}
					if(x==2 && y==2)
					{
						return snakeCage;
					}
				}
			}
		}
		return null;
	}
}
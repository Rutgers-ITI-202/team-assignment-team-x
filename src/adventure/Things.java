package adventure;

/**
 * 
 * @author Keith, Kevin, Spencer
 * @version 1.0
 * @since 1.0
 *  <h1> Description <h1>
 *  This class creates things and gives them the variable description, whenUser(a description of what happened when used), and a name it also includes a boolean variable that is set to true when used so the program knows if an item is being used or not
 */
public class Things 
{ 
	// we can use these decelerations for things that may effect gameplay
	
	 String description="";				// Defines traits of a Thing
	 String whenUsed="";
	 String name="";
	 boolean used=false;
	 
	public Things(String d, String WU, String n) // Constructor
	{
		
		this.description=d;
		this.whenUsed=WU;
		this.name=n;
	}
	
	public  void inspect()		// Prints description of item when inspecting it
	{
		/**
		 * @since 1.0
		 *  <h1> Description <h1>
		 * prints out a description of the item when the user looks at an item
		 */
		
		System.out.println(this.description);
		AdventureModel.command();
	}
	public  void use()			// Method to print message following use of item
	{
		/**
		 * @since 1.0
		 *  <h1> Description <h1>
		 *  prints out what happens when you use an item and then sets the item to used 
		 */
		
		System.out.println(this.whenUsed);
		this.used=true;
		
		AdventureModel.command();
		
	}


}

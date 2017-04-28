package adventure;
//make this class extend another class with a inspect or look method that returns a description
/**
 * 
 * @author Keith, Kevin, Spencer
 * @version 1.0
 * @since 1.0
 *  <h1> Description <h1>
 *  This class creates things and gives them the variable description, whenUser(a description of what happened when used), and a name it also includes a boolean variable that is set to true when used so the program knows if an item is being used or not
 *@return     name
 * @return     description
 * @return     whenUser : a description of what happens when the object is interacted with
 * @return     boolean : set to true when used so the player knows if the item is being used or not.
 */
public class Things extends AdventureObject implements Usable
{ 
		
			
	 String whenUsed="";
	
	 boolean used=false;
	 
	public Things(String d, String WU, String n) // Constructor
	{
		
		this.description=d;
		this.whenUsed=WU;
		this.name=n;
	}
	
	
	public void setDescription(String in)
	{
		this.description=in;
	}
	
	
	public void setUsed(boolean in)
	{
		this.used=in;
	}

	public String whenUsed() 
	{
		
		return this.whenUsed;
	}
	
	


}

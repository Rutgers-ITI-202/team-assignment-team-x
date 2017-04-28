package adventure;
/**
 * 
 * @author Keith, Kevin, Spencer
 * @version 1.0
 * @since 2.0
 * <h1> Description </h1>
 * The class is the parent class of Things and Characters and holds their name and description and the getters and setters for those and a whenUsed method
 *  @param     inspect game objects
 *  @return    name
 *  @return    description
 *  @return    whether the object is being used or not.
 */

public class AdventureObject implements Inspectable,Usable
{
	String description;
	String name;
	
	public String inspect()
	{
		
		return description;
	}
	
	public String getName()
	{
		return name;
	}

	
	public String whenUsed() 
	{
		
		return "";
	}
	
	

}

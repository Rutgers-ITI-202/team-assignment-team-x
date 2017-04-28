package adventure;
/**
 * 
 * @author Keith, Kevin, Keith
 * @since 2.0
 * <h1> Description </h1>
 * This class holds information about characters in the game and their constructor
 *
 */

public class Characters extends AdventureObject implements Usable 
{
	String used;
	
	
	public Characters(String n,String d ,String u)
	{
		this.used=u;
		this.description=d;
		this.name=n;
	}
	public String whenUsed() 
	{
		return used;
	}

}

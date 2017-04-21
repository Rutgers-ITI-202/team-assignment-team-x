package adventure;

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

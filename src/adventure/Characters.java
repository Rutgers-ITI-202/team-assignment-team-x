package adventure;

public class Characters extends AdventureObject implements Usable 
{
	String used;
	String voiceLine="";
	
	public Characters(String u, String vc)
	{
		this.used=u;
		this.voiceLine=vc;
	}
	public String whenUsed() 
	{
		return used;
	}

}

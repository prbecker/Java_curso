package Entities;

public class Room 
{
	private int number;
	private String name;
	private String email;
	private boolean isBusy;
	
	public Room(int number, String name, String email, boolean isBusy) 
	{
		super();
		this.number = number;
		this.name = name;
		this.email = email;
		this.isBusy = isBusy;
	}

	public int getNumber() 
	{
		return number;
	}

	public void setNumber(int number) 
	{
		this.number = number;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public boolean isBusy() 
	{
		return isBusy;
	}

	public void setBusy(boolean isBusy) 
	{
		this.isBusy = isBusy;
	}

	public String toString() 
	{
		return number + ": " + name + ", " + email;
	}
	

}

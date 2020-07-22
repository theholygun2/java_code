package javaCode;

public class Neighbor
{
	public String homeOwnerName;
	public int houseNumber;
	
	public Neighbor next;
	public Neighbor previous;
	
	public Neighbor(String homeOwnerName, int houseNumber)
	{
		this.homeOwnerName = homeOwnerName;
		this.houseNumber = houseNumber;
	}//constructor that take 2 values and set it to the link fields.
	
	public void display()//display the values inside a Link 
	{
		System.out.println(homeOwnerName + ": " + houseNumber + " Privet Drive");
	}
	
	public String toString()
	{
		return homeOwnerName;
	}
	
}
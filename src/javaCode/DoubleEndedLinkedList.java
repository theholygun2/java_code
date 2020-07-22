package javaCode;

public class DoubleEndedLinkedList {
	
	Neighbor firstLink;
	Neighbor lastLink;
	
	public void insertInFirstPosition(String homeOwnerName, int houseNumber)//insert to first link that means that have the last reference
	{
		Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);
		
		if(isEmpty())
		{
			lastLink = theNewLink;
		}else {
			firstLink.previous = theNewLink;
		}
		theNewLink.next = firstLink;
		firstLink = theNewLink;
	}
	
	public void insertInLastPosition(String homeOwnerName, int houseNumber)//insert to last link that have the null reference
	{
		Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);
		
		if(isEmpty())
		{
			lastLink.next = theNewLink;
		}
		else
		{
			lastLink.next = theNewLink;
			theNewLink.previous = lastLink;
		}
		lastLink = theNewLink;
	}
	
	public Boolean insertAfterKey(String homeOwnerName, int houseNumber, int key)
	{
		Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);
		
		Neighbor currentNeighbor = firstLink;
		
		while(currentNeighbor.houseNumber != key)
		{
			currentNeighbor = currentNeighbor.next;
			
			if(currentNeighbor == null)
			{
				return false;
			}
		}
		
		if(currentNeighbor == lastLink)
		{
			theNewLink.next = null;
			lastLink = theNewLink;
		}else {
			theNewLink.next = currentNeighbor.next;
			currentNeighbor.next.previous = theNewLink;
		}
		
		theNewLink.previous = currentNeighbor;
		currentNeighbor.next = theNewLink;
		return true;
	}
	
	public void insertInOrder(String homeOwnerName, int houseNumber)
	{
		Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);
		
		Neighbor previousNeighbor = null;
		Neighbor currentNeighbor = firstLink;
		
		while((currentNeighbor != null) && (houseNumber > currentNeighbor.houseNumber))
		{
			previousNeighbor = currentNeighbor;
			currentNeighbor = currentNeighbor.next;
		}
		
		if(previousNeighbor == null)
		{
			firstLink = theNewLink;
		}else
		{
			previousNeighbor.next = theNewLink;
		}
		
		theNewLink.next = currentNeighbor;
	}
	
	public boolean isEmpty()
	{
		return(firstLink == null);
	}
	
	public static void main(String[] args)
	{
		DoubleEndedLinkedList theLinkedList = new DoubleEndedLinkedList();
		
		theLinkedList.insertInOrder("Mark Evans", 7);
		theLinkedList.insertInOrder("Piers Polkiss", 9);
		theLinkedList.insertInOrder("Doreen Figg", 6);
		theLinkedList.insertInOrder("Petunia Dursley", 4);
		
		theLinkedList.insertAfterKey("David Stefan", 10, 4);
		
		theLinkedList.display();
	}
	
	public void display()
	{
		Neighbor theLink = firstLink;
		
		while(theLink != null)
		{
			theLink.display();
			System.out.println("Next Link: " + theLink.next);
			theLink = theLink.next;
			System.out.println();
		}
	}
}

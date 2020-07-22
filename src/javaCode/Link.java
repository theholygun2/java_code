package javaCode;

public class Link
{
	public String bookName;
	public int millionSold;
	
	public Link next;
	
	public Link(String bookName, int millionSold)
	{
		this.bookName = bookName;
		this.millionSold = millionSold;
	}
	
	public void display()
	{
		System.out.println(bookName + ": " + millionSold + ",000,000 sold");
	}
	
	public String toString()
	{
		return bookName;
	}
	
	public static void main(String[] args)
	{
		LinkList theLinkedList = new LinkList();
		
		theLinkedList.insertFirstLink("Don quixote", 500);
		theLinkedList.insertFirstLink("A Tale of Two Cities", 200);
		theLinkedList.insertFirstLink("The Lord of the Rings", 150);
		theLinkedList.insertFirstLink("Harry Potter and the Sorcerer's Stone", 107);
		
		theLinkedList.display();
	}
}
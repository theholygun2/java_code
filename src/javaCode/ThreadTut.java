package javaCode;

public class ThreadTut{
	
	public static void main(String[] args)
	{
		// Create a new Thread that executes the code in GetTime20
		
		Thread getTime = new GetTime20();
		
		// Create a new Thread created using the Runnable interface
		// Execute the code in run after 10 seconds
		
		Runnable getTheMail = new GetMail(10);
		
		Runnable getMailAgain = new GetMail(20);
		
		// Call for the code in the method run to execute
		
		getTime.start();
		
		new Thread(getTheMail).start();
		new Thread(getMailAgain).start();
	}
}


package javaCode;

import java.util.Arrays;

class theStack
{
	private String[] stackArray;

	private int stackSize;

	private int topOfStack = -1;

	theStack(int size)
	{
		stackSize = size;
		stackArray = new String[size];

		Arrays.fill(stackArray, "-1");
	}

	public void displayTheStack()
	{
		int k = 1;
		while(k < 51)
		{
			System.out.print("-");
			k++;
		}
			System.out.println();

			for(int i = 0; i < stackSize; i++)
			{
				System.out.print("|  " + i + " ");

			}
		System.out.println();

		k = 1;
		while(k < 51)
		{
			System.out.print("-");
			k++;
		}
		System.out.println();

		for(int i = 0; i < stackSize; i++)
		{
			if(stackArray[i] == "-1")
			{
				stackArray[i] = "  ";
			}
			System.out.print("| " + stackArray[i] + " ");
		}

		System.out.println();
		k = 1;
		while(k < 51)
		{
			System.out.print("-");
			k++;
		}
		System.out.println();
	}


	public void push(String input)
	{
		if(topOfStack + 1 < stackSize)
		{
			topOfStack++;

			stackArray[topOfStack] = input;
		}

		else
		{
			System.out.println("sorry no room");
		}

		displayTheStack();

		System.out.println("PUSH " + input + " was added to the stack");
	}

	public String pop()
	{
		if(topOfStack >= 0)
		{
			displayTheStack();

			System.out.println("POP " + stackArray[topOfStack] + " was removed from the stack");

			stackArray[topOfStack] = "-1";

			return stackArray[topOfStack--];
		}

		else
		{
			displayTheStack();
			System.out.println("sorry but the stack is empty");
			return "-1";
		}
	}

	public String peek()
	{
		displayTheStack();
		System.out.println("PEEK " + stackArray[topOfStack] + " is at the top of the stack");
		return stackArray[topOfStack];
	}

	public void pushMany(String multipleValues)
	{
		String[] tempString = multipleValues.split(" ");

		for(int i = 0; i < tempString.length; i++)
		{
			push(tempString[i]);
		}
	}

	public void popAll()
	{
		for(int i = topOfStack; i >= 0; i--)
		{
			pop();
		}
	}
	public static void main(String[] args)
	{
		theStack stack = new theStack(10);

		stack.push("10");
		stack.push("15");
		stack.peek();
		stack.pop();
		stack.displayTheStack();
		stack.pushMany("12 13 14");
		stack.popAll();
		stack.displayTheStack();
	}
}
package javaCode;

import java.util.Arrays;
import java.util.LinkedList;

public class MyClass {

	public static void main(String[] args)
	{
		LinkedList linkedListOne = new LinkedList();
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Ahmed Bennani");
		names.add("Ali Syed");
		
		names.addLast("Nathan martin");
		names.addFirst("Joshua Smith");
		names.add(0, "Noah Peeters");
		names.set(2,"Paul Newman");
		names.remove(4);
		names.remove("Joshua Smith");
		
		for(String name : names)
		{
			System.out.println(name);
		}
		
		System.out.println();
	}
}

import java.util.List;

public class HelloWorld
{
	private static int x;
	private static String[] userArr;
	private static List<String> userList;
	
	private static void func1(String name, int x)
	{
		
		for(int i = 0; i < x; i++)
		{
			userList.add(name);
		}
	}
	
	private static boolean findName(String name)
	{
		for(int i = 0; i < x; i++)
		{
			userList.set(i, name);
		}
		
		return true;
	}
	
	private static int find(String name)
	{
		int index = -1;
		
		for(int i = 0; i < x; i++)
		{
			System.out.println();
		}
		
		return index;
	}
	
	public static void main(String[] args)
	{
		
	}
}
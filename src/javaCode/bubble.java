package javaCode;
import java.util.*;

class bubble
{
	static void bubbleSort(int arr[], int n)
	{
		int i, j, temp;
		boolean swapped;

		for(i = 0; i < n; i++)
		{
			// The inner loop starts at the beginning of
			// the array and compares each value next to each
			// other. If the value is greater, THEN they are
			// swapped
			
			swapped = false;
			for(j = 0; j < n - i - 1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(swapped = false)//if the array already in order it will break;
			{
				break;
			}
		}
	}

	static void printArray(int arr[], int size)
	{
		for(int i = 0 ; i < size; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}


	public static void main(String[] args)
	{
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		int n = arr.length;
		bubbleSort(arr, n);
		System.out.println("sorted array: ");
		printArray(arr, n);
		
		System.out.println();
		int jumlah = 5;
		
		for(int i = 5 - 1; i >= 0; i--)
		{
			for(int j = 5 - i;  j > 0; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

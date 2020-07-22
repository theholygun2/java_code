package javaCode;

class selection
{
	static void selectionSort(int arr[], int n)
	{
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
            {
                if (arr[j] < arr[min_idx])
                {
                    min_idx = j;
				}
			}
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

	static void printArray(int arr[], int size)
	{
		for(int i = 0; i < size; i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args)
	{
		int arr[] = {61, 81, 45, 16, 71};
		int n = arr.length;
		selectionSort(arr, n);
		System.out.println("sorted arrays");
		printArray(arr, n);

	}
}
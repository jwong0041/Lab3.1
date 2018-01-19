public class ArrayMethods1
{

	
	public static void main(String[] args)
	{
		
		int[] list1 = {4, 8, 3, 1, 0, 2, 6, 5, 7, 9};
		double[] list2 = {1.6, 1.2, 1.0, 1.3, 1.4, 1.7, 1.9, 1.5, 1.8, 1.1};
		//String[] list3 = {};
		insertionSort(list1);
		System.out.println(list1);
	}
		
		public static void insertionSort(int[] list1)
		{
			for(int x = 1; x< list1.length; x++)
			{
				int z = list1[x];
				int y = x-1;
				while(y >= 0 && list1[y] > z)
				{
					list1[y+1] = list1[y];
					y = y - 1;
				}
				list1[y+1] = z;
			}
		}
		
		
		public static void selectionSort(double[] list2)
		{
			for (int a = 0; a < list2.length - 1; a++)
			{
				int min = a;
				for (int b = a+1; b < list2.length; b++)
				{
					if (list2[b] < list2[min])
					{
						min = b;
						swap(list2, min, b);
					}
				}
			}
			
		}
		
		/*
		public static void bubbleSort(String[] list3)
		{
			
		}
		*/
	
		
		
		
	public static void swap(int[] arr, int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void swap(double[] arr, int index1, int index2)
	{
		double temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void swap(String[] arr, int index1, int index2)
	{
		String temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	
	
}

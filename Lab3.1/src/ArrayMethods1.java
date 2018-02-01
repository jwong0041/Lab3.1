//Author: Joyin Wong
//Special thanks to Rajat Mishra on www.geeksforgeeks.org

import java.util.Arrays;

public class ArrayMethods1
{
	public static void main(String[] args)
	{
		
		int[] list1 = {4, 8, 3, 1, 0, 2, 6, 5, 7, 9};
		double[] list2 = {1.6, 1.2, 1.0, 1.3, 1.4, 1.7, 1.9, 1.5, 1.8, 1.1};
		String[] list3 = {"d", "b", "h", "a", "g", "j", "e", "c", "i", "f"}; //taking as variable instead of string D: //nvm i fixed it i didnt have quotations
		
		System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
		System.out.println(Arrays.toString(list3));
		System.out.println();
		System.out.println("--- Begin Sorting ---");
		
		long start = System.nanoTime();
		insertionSort(list1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println(Arrays.toString(list1));
		System.out.println("Insertion sort took: " + time + " nanoseconds.");
		System.out.println();
		
		start = System.nanoTime();
		selectionSort(list2);
		end = System.nanoTime();
		time = end - start;
		System.out.println(Arrays.toString(list2));
		System.out.println("Selection sort took: " + time + " nanoseconds.");
		System.out.println();
		
		start = System.nanoTime();
		bubbleSort(list3);
		end = System.nanoTime();
		time = end - start;
		System.out.println(Arrays.toString(list3));
		System.out.println("Bubble sort took: " + time + " nanoseconds.");

	}
		//thank you Rajat Mishra
		public static void insertionSort(int[] list1)
		{
			for(int x = 1; x < list1.length; x++)
			{
				int z = list1[x];
				int y = x - 1;
				//meant to move the values greater than z one position ahead
				while(y >= 0 && list1[y] > z) 
				{
					list1[y+1] = list1[y];
					y = y - 1;
				}
				list1[y+1] = z;
			}
		}
		//I'll be honest I don't understand this code 100%
		
		
		//thank you Rajat Mishra
		public static void selectionSort(double[] list2)
		{
			for (int a = 0; a < list2.length - 1; a++)
			{
				int min = a; //need a new variable or else it replaces the previous a
								//and breaks the loop
				for (int b = a+1; b < list2.length; b++)
				{
					if (list2[b] < list2[min])
					{
						min = b;
						//note that if the swap method is here is still sorts, however
						//if the value is within 0.1~ it tends to mess up the order.
						//larger numbers seem to work fine if the swap method is in here.
					}
				}	
				swapD(list2, min, a); //is outside the second loops because
										//the minimum is being replaced each time and
					 					//it only swaps after it has finished going through the whole array.
			}
		}
		
		
		
		//I did this myself! mostly. Used selection sort as a shell and converted it into bubble.
		public static void bubbleSort(String[] list3)
		{
			for (int g = 0; g < list3.length - 1; g++)
			{
				for (int h = g+1; h < list3.length; h++)
				{
					if (list3[g].compareTo(list3[h]) > 0) //using java built in method that compares lexographic values.
															//returns a positive number if the first value, g is greater than the second, h.
														//if greater than it will swap, else it does nothing.
					{
						swapS(list3, h, g);
					}
				}	
			}
		}
		
	
		
		
	//copied your sample code and then changed each one to fit the type :P	
	public static void swapI(int[] arr, int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void swapD(double[] arr, int index1, int index2)
	{
		double temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void swapS(String[] arr, int index1, int index2)
	{
		String temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	
	
}

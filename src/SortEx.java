public class SortEx 
{ 
	void bubbleSort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) 
			for (int j = 0; j < n-i-1; j++) 
				if (arr[j] > arr[j+1]) 
				{ 
					// swap arr[j+1] and arr[j] 
					int temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = temp; 
				} 
	} 

	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 


	public static void main(String args[]) 
	{ 
		SortEx ob = new SortEx(); 
		int arr[] = {14, 94, 65, 1, 72, 41, 21}; 
		ob.bubbleSort(arr); 
		System.out.println("Sorted array"); 
		ob.printArray(arr); 
	} 
} 



public class SearchEx {
	
	public static int search(int arr[],int key)
	{
	 int arrlength = arr.length;
	 for (int i=0;i< arrlength; i++) {
		 if(arr[i]== key) {
			 return i;
			 		 }
	 
	 }
	return -1;

	}
	
	public static void main(String args[])
	{
		int items[] = {2,100,9,4,4,7,9,10};
		int result = search (items,9);
		
		if (result==-1)
		{
			System.out.println("Element not found");
				
		}
		else 
		{
	        System.out.print("Element is present at index " + result); 

		}
		
		
	}

}

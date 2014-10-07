import java.util.*;

// A recusive binary search method
public class Problem2 {

   // General binary search method
   public int binarySearch(int[] a, int x) { 
      return binarySearch(a, x, 0, a.length - 1);
   }
  
   // 
   private int binarySearch(int[] a, int x, int low, int high) {
      
	  if (low > high) 
		  return -1; // Not found
      
	  int mid = (low + high)/2; // Get the mid value
	  
      if (a[mid] == x) 
		  return mid; // Find it and return the index
      
	  else if (a[mid] < x)
         return binarySearch(a, x, mid+1, high); // Check the part after the middle one recusively
      
	  else // Which is a[mid] > x
         return binarySearch(a, x, low, mid-1); // Check the part before the middle one recusively
   }


   public static void main(String[] args) {
      Problem2 search = new Problem2();
      int[] a =
        { 1, 4, 9, 11, 19, 33, 35, 38, 39, 41, 44, 48, 49, 54, 58, 59, // Index from 0 to 15
			62, 65, 67, 70, 72, 75, 77, 82, 88, 90, 92, 96, 99};  // Index from 16 to 28
     
		 //Firstly check the index for each number in the array to verify the search algorithm
	  for (int i = 0; i < a.length; i++)
         System.out.print(search.binarySearch(a,a[i]) + " "); 
      
	  
	  System.out.println();
	  
	  int[] numbers = {1, 59, 45, 22, 33, 32, 88, 99}; // Search these number in the array;
	  
	  for (int j = 0; j < numbers.length; j++){
		  int result = search.binarySearch(a,numbers[j]);
		  if (result != -1)
			  System.out.println("The number of " + numbers[j] + " is found at Index " + result + " in the array.");
		  else
			  System.out.println("The number of " + numbers[j] + " is not found in the array.");
	  }
    
      System.out.println();
   }
}

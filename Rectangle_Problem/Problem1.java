import java.util.*;


// First make the area comparator

class areaCompare implements Comparator<Rectangle>{
	
	public int compare(Rectangle left, Rectangle right){
		if (left.getArea() < right.getArea()) return -1;
		if (left.getArea() > right.getArea()) return 1;
		return 0;
	}
}

// Then make the perimeter comparator

class perimeterCompare implements Comparator<Rectangle>{
	
	public int compare(Rectangle left, Rectangle right){
		if (left.getPerimeter() < right.getPerimeter()) return -1;
		if (left.getPerimeter() > right.getPerimeter()) return 1;
		return 0;
	}
}

public class Problem1{
	
	public static void main(String[] args){
		
		Rectangle[] rec = new Rectangle[10]; // Create an array of 10 rectangles.
		
		System.out.println(" ");
		
		System.out.println("Here are the rectangles in the array:");
		for (int i = 0; i< 10; i++){
			// Set values for each rectangle
			Rectangle r = new Rectangle();
			r.setWidth(((int)(Math.random()*20))+10); // Create the width value randomly.
			r.setHeight(((int)(Math.random()*20))+10); // Create the hright value randomly.
			System.out.println("No." + (i+1) + " " + r.toString() + " has area of " + r.getArea() + 
				" and perimeter of " + r.getPerimeter() + ". "); // Print out the information for each rectangle
			rec[i]=r; // Save the rectangle into the array
			
		}
		
		System.out.println(" ");
		
		Rectangle areaMax = findMax(rec, new areaCompare()); // Get the rectangle with the maximum area
		Rectangle perimeterMax = findMax(rec, new perimeterCompare()); // Get the rectangle with the maximum perimeter
		
		
		System.out.println("Here are the results:");
		// Print out the result.
		System.out.println("The rectangle with width of " + areaMax.getWidth() + " and height of "
			+ areaMax.getHeight() + " has the maximum area which is " + areaMax.getArea() + ". ");
		
		System.out.println("The rectangle with width of " + perimeterMax.getWidth() + " and height of "
			+ perimeterMax.getHeight() + " has the maximum perimeter which is " + perimeterMax.getPerimeter() + 
				". ");
		
		
	}
	
	public static Rectangle findMax( Rectangle[] arr, Comparator<Rectangle> cmp){
		
		// Used to find the maximum one in an array
		int maxIndex = 0;
	
		for (int i = 1; i < arr.length; i++)
			if(cmp.compare(arr[i],arr[maxIndex])>0)
				maxIndex = i;
	
		return arr[maxIndex];
	}
}
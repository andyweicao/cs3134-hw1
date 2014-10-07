import java.util.*;
import java.util.Scanner;

public class Number4{
	
	public static void main(String[] args){
		
		int n;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the value of N: ");
		
		n = in.nextInt();
		
		TimeInterval t = new TimeInterval();
		t.startTiming();
		int sum = 0;
		for(int i = 0; i < n; i++)
			for(int j = 0; j < i; j++)
				sum++;
		
		t.endTiming();
		
		double time = t.getElapsedTime();
		System.out.println("The elapsed time is " + time + "ms. ");
			
	}

}
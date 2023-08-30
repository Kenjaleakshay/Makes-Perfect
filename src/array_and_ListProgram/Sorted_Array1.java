package array_and_ListProgram;

import java.util.Arrays;

public class Sorted_Array1 {

	public static void main(String[] args) {
		
		int[] arr = {2,4,7,5,1};
		
		//In Bubble sort algorithm, adjacent elements are compared and swapped for n-1 passes.
		// so outer loop is for passes.
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					}
			}
		System.out.println(Arrays.toString(arr));	
			
		}
		
		
		
	}
	
}

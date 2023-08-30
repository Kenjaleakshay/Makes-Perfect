package array_and_ListProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorted_Array2 {
	
	public static void main(String[] args) {
		
		int[] arr = {8,3,2,8,8,27,23,67,89};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		ArrayList<Integer> al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	}

}

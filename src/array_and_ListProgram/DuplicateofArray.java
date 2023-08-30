package array_and_ListProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateofArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,4,5,3,1,7,7,7,7,7};
		
		System.out.println(duplicateofarray(arr));
		duplicate(arr);
		
		
	}
	
	public static ArrayList<Integer> duplicateofarray(int[] arr) {
		
		ArrayList<Integer> dup = new ArrayList();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					dup.add(arr[i]);
				}
			}
		}
		return dup;
		
	}

	public static void duplicate(int[] arr) {
		
		ArrayList<Integer> al = new ArrayList();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					al.add(arr[i]);
				}
			}
		}
		Set<Integer> set = new HashSet();
		set.addAll(al);
		System.out.println(set);
		
		
		
	}
}

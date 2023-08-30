package array_and_ListProgram;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	//	int cap = sc.nextInt();
		
	/*	int[] ar = new int[cap];
		
		for(int i=0;i<ar.length;i++) {
			
			ar[i] = sc.nextInt();
			
		}
		System.out.println(Arrays.toString(ar));
		
		for(int a : ar) {
			System.out.println(a);
		}*/
		
	/*	int[][] arr = new int[cap][cap];
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j] = sc.nextInt();
			}
			}
		for(int[] ar : arr) {
			System.out.println(Arrays.toString(ar));
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}*/
		
	int[] arr = {10,5,8,6,5};
	//swaparray(arr,1,4);
//	maxofArray(arr);
	revarray(arr);
	
		
		
		
		
		
	}
	
	public static void swaparray(int[] ar,int i,int j) {
		
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
		System.out.println(Arrays.toString(ar));
		}
	
	public static void maxofArray(int[] ar) {
		
		int max = ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>max) {
				max = ar[i];
			}
		}
		System.out.println(max);
	}
	
	public static void revarray(int[] ar) {
		
		
		int[] arr = new int[ar.length];
		int ind = 0;
		for(int i=ar.length-1;i>=0;i--) {
			arr[ind] = ar[i];
			ind++;
			}
		ar = arr ;
		System.out.println(Arrays.toString(ar));
		
		
		
		
		
		
	}
	

}

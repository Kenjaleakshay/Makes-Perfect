package string_programs;

import java.util.Scanner;

public class Max_Char {

	public static void main(String[] args) {
		
	
		maxoccurence();
		System.out.println(maxoccurence());
		
		
		
		
		
		
		
		
}
	
	public static int maxoccurence() {
		
	Scanner sc = new Scanner(System.in);
		
		String str = sc.next();//kjkjkit
		
		int[] arr = new int[127];
		
		for(int i=0;i<str.length();i++) {
			
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
			
		}
		int max = -1;
		char ch = ' ';
		
		for(int i=0;i<str.length();i++) {
			
			if(max<arr[str.charAt(i)]) {
				
				max = arr[str.charAt(i)];
				ch = str.charAt(i);
			}
		}
		if(max==1) {
			
		return 0;
		}
		else {
			System.out.println(ch);
			return max;
			
		}
		
		
		
		
	}
}